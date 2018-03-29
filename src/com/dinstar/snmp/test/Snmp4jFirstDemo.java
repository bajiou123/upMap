package com.dinstar.snmp.test;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;
 
public class Snmp4jFirstDemo {
	 
 
	public static void main(String[] args)throws IOException,InterruptedException{
		Snmp snmp = new Snmp(new DefaultUdpTransportMapping());
		snmp.listen();
		CommunityTarget target = new CommunityTarget();
		target.setCommunity(new OctetString("public"));
		target.setVersion(SnmpConstants.version2c);
		target.setAddress(new UdpAddress("172.25.1.187/161"));
		target.setTimeout(3000);  // 3 
		target.setRetries(1);
		sendRequest(snmp,createGetPdu(),target);
		sendRequest(snmp, createGetNextPdu(), target);
		sendRequest(snmp, createGetBulkPdu(), target);
		snmpWalk(snmp, target);
		target.setCommunity(new OctetString("private"));
		sendRequest(snmp, createSetPdu(), target);
		CommunityTarget broadcastTarget = new CommunityTarget();
		broadcastTarget.setCommunity(new OctetString("public"));
		broadcastTarget.setVersion(SnmpConstants.version2c);
		broadcastTarget.setAddress(new UdpAddress("172.0.0.1/162"));
		broadcastTarget.setTimeout(5000);	// 5m 
		sendAsyncRequest(snmp, createGetNextPdu(), broadcastTarget);
		Thread.sleep(6000);  //main thread wait 6s for the completion of asynchronous request   
		
	}
	
	private static void sendAsyncRequest(Snmp snmp,PDU pdu,CommunityTarget target)throws IOException{
		snmp.send(pdu, target,null,new ResponseListener() {
			
			@Override
			public void onResponse(ResponseEvent event) {
				PDU response = event.getRequest();
				System.err.println("TimeOut...");
				if (response == null) {
					System.err.println("TimeOut...");
				}else {
					if(response.getErrorStatus() == PDU.noError){
						Vector<? extends VariableBinding> vbs = response.getVariableBindings();
						for (VariableBinding vb : vbs) {
							System.err.println(vb+","+vb.getVariable().getSyntaxString());
						}
					}else {
						System.err.println("error:"+response.getErrorStatusText());
					}
				}
			}
		});
	}

// 	private  static PDU createGetPdu(String oid) {
	/**
	 * SNMPЭ�����ݵ�Ԫ��
	 */
 	private  static PDU createGetPdu() {
 		// PDU���ʾһ��SNMPЭ�����ݵ�Ԫ��
		PDU pdu = new PDU();
		// ��PDU���� �õ���PDU���͡�ȱʡֵ��GETNEXT����ȡһ���̶��ֶ�ֵ
		pdu.setType(PDU.GET);
		// �����PDU���һ�������󶨡���������󶨻������Ϊ�գ����׳�NullPointerException��
		// ����vb -һ��������ʵ����
		// VariableBinding�Ƕ���ʵ����ʶ��(OID)��ʵ��ֵ(����)�Ĺ�������
		// ʹ���ṩ�Ķ���ʵ����ʶ���Ϳ�ֵ����һ�������󶨡�
		// oid -�����±����󶨵�oid��
//		pdu.add(new VariableBinding(new OID(oid))); // sysUpTime  
		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10"))); // sysUpTime
		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10"))); // sysName 
		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10")));  //expect an no_such_instance error
 		return pdu;
	}
 	
 	private static PDU createGetNextPdu(){
 		PDU pdu = new PDU();
 		pdu.setType(PDU.GETNEXT);
 		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10")));
 		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10")));
 		return pdu;
 	}
 	
 	private  static PDU createGetBulkPdu() {
		PDU pdu = new PDU();
		pdu.setType(PDU.GETBULK);
		pdu.setMaxRepetitions(10); // must set it , default is 0
		pdu.setNonRepeaters(0); 
		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.38111.7.30.2")));
		return pdu;
	}
 	
 	/**
 	 * һ��CommunityTarget���������������Ϣ����ģ�͵�SNMPĿ������(SNMPv1��SNMPv2c)��
 	 * @param snmp
 	 * @param target
 	 */
 	private static void snmpWalk(Snmp snmp,CommunityTarget target){
 		TableUtils utils = new TableUtils(snmp, new DefaultPDUFactory(PDU.GETBULK)); // GETNEXT or GETBULK
 		utils.setMaxNumColumnsPerPDU(5);
 		OID[] columnOids = new OID[]{
 				new OID("1.3.6.1.4.1.38111.7.30.2"),
 				new OID("1.3.6.1.4.1.38111.7.30.3"),
 				new OID("1.3.6.1.4.1.38111.7.30.4"),
 		};
 		
 		//<code>TableEvent</code>�౨���¼��ڱ�����С�
 		List<TableEvent> l = utils.getTable(target, columnOids, new OID("3"), new OID("10"));  
 		for (TableEvent e : l) {
			System.err.println(e);
		}
 	}
 	
 	/**
 	 * ���ڷ���ͬ����Ϣ
 	 * @param snmp 
 	 * @param pdu
 	 * @param target
 	 * @throws IOException
 	 */
 	private static void sendRequest(Snmp snmp,PDU pdu,CommunityTarget target)throws IOException {
 		ResponseEvent responseEvent = snmp.send(pdu, target);
 		PDU response = responseEvent.getResponse(); 
 		if(response == null){
 			System.err.println("request timed out TimeOut...");
 		}else {
 			if (response.getErrorStatus() == PDU.noError) {
 				// dump response PDU
				Vector<? extends VariableBinding> vbs = response.getVariableBindings();
				for (VariableBinding vb : vbs) {
					System.err.println(vb+","+vb.getVariable().getSyntaxString());
				}
			}else {
				System.err.println("error:"+response.getErrorStatusText());
			}
		}
 	}
 	
 	private static PDU createSetPdu(){
 		PDU pdu = new PDU();
 		pdu.setType(PDU.SET);
 		pdu.add(new VariableBinding(new OID("1.3.6.1.4.1.80.72.3.2.10"),new OctetString("sysname")));
 		return pdu;
 	}
}
