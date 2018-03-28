package com.dinstar.snmp.dao;

import com.dinstar.snmp.mapper.TblAlarmSnmphandlingMapper;
import com.dinstar.snmp.model.TblAlarmSnmphandlingExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;


public interface TblAlarmSnmphandlingDao {
    long countByExample(TblAlarmSnmphandlingExample example);

    int deleteByExample(TblAlarmSnmphandlingExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(TblAlarmSnmphandlingMapper record);

    int insertSelective(TblAlarmSnmphandlingMapper record);

    List<TblAlarmSnmphandlingMapper> selectByExample(TblAlarmSnmphandlingExample example);

    TblAlarmSnmphandlingMapper selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") TblAlarmSnmphandlingMapper record, @Param("example") TblAlarmSnmphandlingExample example);

    int updateByExample(@Param("record") TblAlarmSnmphandlingMapper record, @Param("example") TblAlarmSnmphandlingExample example);

    int updateByPrimaryKeySelective(TblAlarmSnmphandlingMapper record);

    int updateByPrimaryKey(TblAlarmSnmphandlingMapper record);
}