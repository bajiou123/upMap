package com.dinstar.snmp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dinstar.snmp.dao.TblAlarmSnmphandlingDao;
import com.dinstar.snmp.mapper.TblAlarmSnmphandlingMapper;
import com.dinstar.snmp.model.TblAlarmSnmphandlingExample;

public class TblAlarmSnmphandlingDaoImpl implements TblAlarmSnmphandlingDao {
	
	private SqlSession session;
	
	public SqlSession getSession() {
		return session;
	}

	public void setSession(SqlSession session) {
		this.session = session;
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
