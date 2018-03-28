package com.dinstar.snmp.dao;

import com.dinstar.snmp.dao.TblAlarmSnmphandling;
import com.dinstar.snmp.dao.TblAlarmSnmphandlingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAlarmSnmphandlingMapper {
    long countByExample(TblAlarmSnmphandlingExample example);

    int deleteByExample(TblAlarmSnmphandlingExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(TblAlarmSnmphandling record);

    int insertSelective(TblAlarmSnmphandling record);

    List<TblAlarmSnmphandling> selectByExample(TblAlarmSnmphandlingExample example);

    TblAlarmSnmphandling selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") TblAlarmSnmphandling record, @Param("example") TblAlarmSnmphandlingExample example);

    int updateByExample(@Param("record") TblAlarmSnmphandling record, @Param("example") TblAlarmSnmphandlingExample example);

    int updateByPrimaryKeySelective(TblAlarmSnmphandling record);

    int updateByPrimaryKey(TblAlarmSnmphandling record);
}