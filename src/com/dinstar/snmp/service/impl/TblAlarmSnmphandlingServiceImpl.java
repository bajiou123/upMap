package com.dinstar.snmp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
import com.dinstar.snmp.dao.TblAlarmSnmphandlingDao;
import com.dinstar.snmp.mapper.TblAlarmSnmphandlingMapper;
import com.dinstar.snmp.model.TblAlarmSnmphandlingExample;
import com.dinstar.snmp.service.TblAlarmSnmphandlingService;

@Controller
public class TblAlarmSnmphandlingServiceImpl implements
		TblAlarmSnmphandlingService {

	@Autowired
	private TblAlarmSnmphandlingService tblAlarmSnmphandlingServiceDao;
	
	@Autowired
	private TblAlarmSnmphandlingDao tblAlarmSnmphandlingDao;
	
	public TblAlarmSnmphandlingService getTblAlarmSnmphandlingServiceDao() {
		return tblAlarmSnmphandlingServiceDao;
	}

	public void setTblAlarmSnmphandlingServiceDao(
			TblAlarmSnmphandlingService tblAlarmSnmphandlingServiceDao) {
		this.tblAlarmSnmphandlingServiceDao = tblAlarmSnmphandlingServiceDao;
	}

	public TblAlarmSnmphandlingDao getTblAlarmSnmphandlingDao() {
		return tblAlarmSnmphandlingDao;
	}

	public void setTblAlarmSnmphandlingDao(
			TblAlarmSnmphandlingDao tblAlarmSnmphandlingDao) {
		this.tblAlarmSnmphandlingDao = tblAlarmSnmphandlingDao;
	}

	@Override
	public long countByExample(TblAlarmSnmphandlingExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(TblAlarmSnmphandlingExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer uuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TblAlarmSnmphandlingMapper record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TblAlarmSnmphandlingMapper record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TblAlarmSnmphandlingMapper> selectByExample(
			TblAlarmSnmphandlingExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblAlarmSnmphandlingMapper selectByPrimaryKey(Integer uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExample(TblAlarmSnmphandlingMapper record,
			TblAlarmSnmphandlingExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleSelective(TblAlarmSnmphandlingMapper record,
			TblAlarmSnmphandlingExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TblAlarmSnmphandlingMapper record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(TblAlarmSnmphandlingMapper record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
