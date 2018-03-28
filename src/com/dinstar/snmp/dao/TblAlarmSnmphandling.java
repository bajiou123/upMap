package com.dinstar.snmp.dao;

import java.util.Date;

public class TblAlarmSnmphandling {
    private Integer uuid;

    private Integer recStatus;

    private Integer objectType;

    private Integer objectId;

    private Integer neUuid;

    private Integer alarmType;

    private Integer causeId;

    private String objectBrief;

    private String objectDesc;

    private Date reportTime;

    private Date recvTime;

    private Integer alarmId;

    private Integer sysUuid;

    private Integer domainUuid;

    private Integer alarmSn;

    private Integer alarmIndex;

    private Date cleanTime;

    private Integer cleanFlag;

    private Integer confirmFlag;

    private Integer neInnerSn;

    private Integer alarmFlag;

    private Integer pushType;

    private Integer pushFlag;

    private Integer pushSmsFlag;

    private Integer pushMailFlag;

    private Integer neCpuUse;

    private Integer sipRegisterInterval;

    private Integer alarmLevel;

    private Integer alarmAlarmType;

    private String alarmName;

    private String neSn;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Integer recStatus) {
        this.recStatus = recStatus;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getNeUuid() {
        return neUuid;
    }

    public void setNeUuid(Integer neUuid) {
        this.neUuid = neUuid;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getCauseId() {
        return causeId;
    }

    public void setCauseId(Integer causeId) {
        this.causeId = causeId;
    }

    public String getObjectBrief() {
        return objectBrief;
    }

    public void setObjectBrief(String objectBrief) {
        this.objectBrief = objectBrief == null ? null : objectBrief.trim();
    }

    public String getObjectDesc() {
        return objectDesc;
    }

    public void setObjectDesc(String objectDesc) {
        this.objectDesc = objectDesc == null ? null : objectDesc.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getRecvTime() {
        return recvTime;
    }

    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public Integer getSysUuid() {
        return sysUuid;
    }

    public void setSysUuid(Integer sysUuid) {
        this.sysUuid = sysUuid;
    }

    public Integer getDomainUuid() {
        return domainUuid;
    }

    public void setDomainUuid(Integer domainUuid) {
        this.domainUuid = domainUuid;
    }

    public Integer getAlarmSn() {
        return alarmSn;
    }

    public void setAlarmSn(Integer alarmSn) {
        this.alarmSn = alarmSn;
    }

    public Integer getAlarmIndex() {
        return alarmIndex;
    }

    public void setAlarmIndex(Integer alarmIndex) {
        this.alarmIndex = alarmIndex;
    }

    public Date getCleanTime() {
        return cleanTime;
    }

    public void setCleanTime(Date cleanTime) {
        this.cleanTime = cleanTime;
    }

    public Integer getCleanFlag() {
        return cleanFlag;
    }

    public void setCleanFlag(Integer cleanFlag) {
        this.cleanFlag = cleanFlag;
    }

    public Integer getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(Integer confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public Integer getNeInnerSn() {
        return neInnerSn;
    }

    public void setNeInnerSn(Integer neInnerSn) {
        this.neInnerSn = neInnerSn;
    }

    public Integer getAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(Integer alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public Integer getPushSmsFlag() {
        return pushSmsFlag;
    }

    public void setPushSmsFlag(Integer pushSmsFlag) {
        this.pushSmsFlag = pushSmsFlag;
    }

    public Integer getPushMailFlag() {
        return pushMailFlag;
    }

    public void setPushMailFlag(Integer pushMailFlag) {
        this.pushMailFlag = pushMailFlag;
    }

    public Integer getNeCpuUse() {
        return neCpuUse;
    }

    public void setNeCpuUse(Integer neCpuUse) {
        this.neCpuUse = neCpuUse;
    }

    public Integer getSipRegisterInterval() {
        return sipRegisterInterval;
    }

    public void setSipRegisterInterval(Integer sipRegisterInterval) {
        this.sipRegisterInterval = sipRegisterInterval;
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Integer getAlarmAlarmType() {
        return alarmAlarmType;
    }

    public void setAlarmAlarmType(Integer alarmAlarmType) {
        this.alarmAlarmType = alarmAlarmType;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName == null ? null : alarmName.trim();
    }

    public String getNeSn() {
        return neSn;
    }

    public void setNeSn(String neSn) {
        this.neSn = neSn == null ? null : neSn.trim();
    }
}