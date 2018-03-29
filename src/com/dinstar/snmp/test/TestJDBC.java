package com.dinstar.snmp.test;

import java.util.ArrayList;
import java.util.List;

import com.dinstar.snmp.dao.impl.TblAlarmSnmphandlingDaoImpl;
import com.dinstar.snmp.mapper.TblAlarmSnmphandlingMapper;
import com.dinstar.snmp.model.TblAlarmSnmphandlingExample;
import com.dinstar.snmp.service.impl.TblAlarmSnmphandlingServiceImpl;

public class TestJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblAlarmSnmphandlingDaoImpl tblAlarmSnmphandlingdao = new TblAlarmSnmphandlingDaoImpl();
		TblAlarmSnmphandlingExample tblAlarmSnmpExample = new TblAlarmSnmphandlingExample();
		tblAlarmSnmpExample.setOrderByClause(null);
		List<TblAlarmSnmphandlingMapper> tblList = new ArrayList<TblAlarmSnmphandlingMapper>();
		tblList = tblAlarmSnmphandlingdao.selectByExamplejoin(tblAlarmSnmpExample);
		for (TblAlarmSnmphandlingMapper tblAlarmSnmphandlingMapper : tblList) {
			System.err.println(tblAlarmSnmphandlingMapper.getNeSn());
		}
	}

}
