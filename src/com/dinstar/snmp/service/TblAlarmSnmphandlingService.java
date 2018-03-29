package com.dinstar.snmp.service;

import com.dinstar.snmp.mapper.TblAlarmSnmphandlingMapper;
import com.dinstar.snmp.model.TblAlarmSnmphandlingExample;

import java.util.List; 

public interface TblAlarmSnmphandlingService {
    long countByExample(TblAlarmSnmphandlingExample example);

    int deleteByExample(TblAlarmSnmphandlingExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(TblAlarmSnmphandlingMapper record);

    int insertSelective(TblAlarmSnmphandlingMapper record);

    List<TblAlarmSnmphandlingMapper> selectByExample(TblAlarmSnmphandlingExample example);

    List<TblAlarmSnmphandlingMapper> selectByExamplejoin(TblAlarmSnmphandlingExample example);
    
    TblAlarmSnmphandlingMapper selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(TblAlarmSnmphandlingMapper record,TblAlarmSnmphandlingExample example);

    int updateByExample(TblAlarmSnmphandlingMapper record,TblAlarmSnmphandlingExample example);

    int updateByPrimaryKeySelective(TblAlarmSnmphandlingMapper record);

    int updateByPrimaryKey(TblAlarmSnmphandlingMapper record);
}