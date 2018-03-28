package com.dinstar.snmp.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblAlarmSnmphandlingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblAlarmSnmphandlingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Integer value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Integer value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Integer value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Integer value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Integer value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Integer> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Integer> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Integer value1, Integer value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andRecStatusIsNull() {
            addCriterion("rec_status is null");
            return (Criteria) this;
        }

        public Criteria andRecStatusIsNotNull() {
            addCriterion("rec_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecStatusEqualTo(Integer value) {
            addCriterion("rec_status =", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotEqualTo(Integer value) {
            addCriterion("rec_status <>", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusGreaterThan(Integer value) {
            addCriterion("rec_status >", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_status >=", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusLessThan(Integer value) {
            addCriterion("rec_status <", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rec_status <=", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusIn(List<Integer> values) {
            addCriterion("rec_status in", values, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotIn(List<Integer> values) {
            addCriterion("rec_status not in", values, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusBetween(Integer value1, Integer value2) {
            addCriterion("rec_status between", value1, value2, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_status not between", value1, value2, "recStatus");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNull() {
            addCriterion("object_type is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("object_type is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(Integer value) {
            addCriterion("object_type =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(Integer value) {
            addCriterion("object_type <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(Integer value) {
            addCriterion("object_type >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("object_type >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(Integer value) {
            addCriterion("object_type <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("object_type <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<Integer> values) {
            addCriterion("object_type in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<Integer> values) {
            addCriterion("object_type not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("object_type between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("object_type not between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNull() {
            addCriterion("object_id is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("object_id is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Integer value) {
            addCriterion("object_id =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Integer value) {
            addCriterion("object_id <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Integer value) {
            addCriterion("object_id >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("object_id >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Integer value) {
            addCriterion("object_id <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("object_id <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Integer> values) {
            addCriterion("object_id in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Integer> values) {
            addCriterion("object_id not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("object_id between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("object_id not between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andNeUuidIsNull() {
            addCriterion("ne_uuid is null");
            return (Criteria) this;
        }

        public Criteria andNeUuidIsNotNull() {
            addCriterion("ne_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andNeUuidEqualTo(Integer value) {
            addCriterion("ne_uuid =", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidNotEqualTo(Integer value) {
            addCriterion("ne_uuid <>", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidGreaterThan(Integer value) {
            addCriterion("ne_uuid >", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ne_uuid >=", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidLessThan(Integer value) {
            addCriterion("ne_uuid <", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidLessThanOrEqualTo(Integer value) {
            addCriterion("ne_uuid <=", value, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidIn(List<Integer> values) {
            addCriterion("ne_uuid in", values, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidNotIn(List<Integer> values) {
            addCriterion("ne_uuid not in", values, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidBetween(Integer value1, Integer value2) {
            addCriterion("ne_uuid between", value1, value2, "neUuid");
            return (Criteria) this;
        }

        public Criteria andNeUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ne_uuid not between", value1, value2, "neUuid");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(Integer value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(Integer value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<Integer> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andCauseIdIsNull() {
            addCriterion("cause_id is null");
            return (Criteria) this;
        }

        public Criteria andCauseIdIsNotNull() {
            addCriterion("cause_id is not null");
            return (Criteria) this;
        }

        public Criteria andCauseIdEqualTo(Integer value) {
            addCriterion("cause_id =", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotEqualTo(Integer value) {
            addCriterion("cause_id <>", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdGreaterThan(Integer value) {
            addCriterion("cause_id >", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cause_id >=", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdLessThan(Integer value) {
            addCriterion("cause_id <", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdLessThanOrEqualTo(Integer value) {
            addCriterion("cause_id <=", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdIn(List<Integer> values) {
            addCriterion("cause_id in", values, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotIn(List<Integer> values) {
            addCriterion("cause_id not in", values, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdBetween(Integer value1, Integer value2) {
            addCriterion("cause_id between", value1, value2, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cause_id not between", value1, value2, "causeId");
            return (Criteria) this;
        }

        public Criteria andObjectBriefIsNull() {
            addCriterion("object_brief is null");
            return (Criteria) this;
        }

        public Criteria andObjectBriefIsNotNull() {
            addCriterion("object_brief is not null");
            return (Criteria) this;
        }

        public Criteria andObjectBriefEqualTo(String value) {
            addCriterion("object_brief =", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefNotEqualTo(String value) {
            addCriterion("object_brief <>", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefGreaterThan(String value) {
            addCriterion("object_brief >", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefGreaterThanOrEqualTo(String value) {
            addCriterion("object_brief >=", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefLessThan(String value) {
            addCriterion("object_brief <", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefLessThanOrEqualTo(String value) {
            addCriterion("object_brief <=", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefLike(String value) {
            addCriterion("object_brief like", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefNotLike(String value) {
            addCriterion("object_brief not like", value, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefIn(List<String> values) {
            addCriterion("object_brief in", values, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefNotIn(List<String> values) {
            addCriterion("object_brief not in", values, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefBetween(String value1, String value2) {
            addCriterion("object_brief between", value1, value2, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectBriefNotBetween(String value1, String value2) {
            addCriterion("object_brief not between", value1, value2, "objectBrief");
            return (Criteria) this;
        }

        public Criteria andObjectDescIsNull() {
            addCriterion("object_desc is null");
            return (Criteria) this;
        }

        public Criteria andObjectDescIsNotNull() {
            addCriterion("object_desc is not null");
            return (Criteria) this;
        }

        public Criteria andObjectDescEqualTo(String value) {
            addCriterion("object_desc =", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescNotEqualTo(String value) {
            addCriterion("object_desc <>", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescGreaterThan(String value) {
            addCriterion("object_desc >", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("object_desc >=", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescLessThan(String value) {
            addCriterion("object_desc <", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescLessThanOrEqualTo(String value) {
            addCriterion("object_desc <=", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescLike(String value) {
            addCriterion("object_desc like", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescNotLike(String value) {
            addCriterion("object_desc not like", value, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescIn(List<String> values) {
            addCriterion("object_desc in", values, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescNotIn(List<String> values) {
            addCriterion("object_desc not in", values, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescBetween(String value1, String value2) {
            addCriterion("object_desc between", value1, value2, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andObjectDescNotBetween(String value1, String value2) {
            addCriterion("object_desc not between", value1, value2, "objectDesc");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNull() {
            addCriterion("recv_time is null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIsNotNull() {
            addCriterion("recv_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecvTimeEqualTo(Date value) {
            addCriterion("recv_time =", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotEqualTo(Date value) {
            addCriterion("recv_time <>", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThan(Date value) {
            addCriterion("recv_time >", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recv_time >=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThan(Date value) {
            addCriterion("recv_time <", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeLessThanOrEqualTo(Date value) {
            addCriterion("recv_time <=", value, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeIn(List<Date> values) {
            addCriterion("recv_time in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotIn(List<Date> values) {
            addCriterion("recv_time not in", values, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeBetween(Date value1, Date value2) {
            addCriterion("recv_time between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andRecvTimeNotBetween(Date value1, Date value2) {
            addCriterion("recv_time not between", value1, value2, "recvTime");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdEqualTo(Integer value) {
            addCriterion("alarm_id =", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotEqualTo(Integer value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThan(Integer value) {
            addCriterion("alarm_id >", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThan(Integer value) {
            addCriterion("alarm_id <", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIn(List<Integer> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotIn(List<Integer> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andSysUuidIsNull() {
            addCriterion("sys_uuid is null");
            return (Criteria) this;
        }

        public Criteria andSysUuidIsNotNull() {
            addCriterion("sys_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andSysUuidEqualTo(Integer value) {
            addCriterion("sys_uuid =", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidNotEqualTo(Integer value) {
            addCriterion("sys_uuid <>", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidGreaterThan(Integer value) {
            addCriterion("sys_uuid >", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_uuid >=", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidLessThan(Integer value) {
            addCriterion("sys_uuid <", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidLessThanOrEqualTo(Integer value) {
            addCriterion("sys_uuid <=", value, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidIn(List<Integer> values) {
            addCriterion("sys_uuid in", values, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidNotIn(List<Integer> values) {
            addCriterion("sys_uuid not in", values, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidBetween(Integer value1, Integer value2) {
            addCriterion("sys_uuid between", value1, value2, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andSysUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_uuid not between", value1, value2, "sysUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidIsNull() {
            addCriterion("domain_uuid is null");
            return (Criteria) this;
        }

        public Criteria andDomainUuidIsNotNull() {
            addCriterion("domain_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andDomainUuidEqualTo(Integer value) {
            addCriterion("domain_uuid =", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidNotEqualTo(Integer value) {
            addCriterion("domain_uuid <>", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidGreaterThan(Integer value) {
            addCriterion("domain_uuid >", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("domain_uuid >=", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidLessThan(Integer value) {
            addCriterion("domain_uuid <", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidLessThanOrEqualTo(Integer value) {
            addCriterion("domain_uuid <=", value, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidIn(List<Integer> values) {
            addCriterion("domain_uuid in", values, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidNotIn(List<Integer> values) {
            addCriterion("domain_uuid not in", values, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidBetween(Integer value1, Integer value2) {
            addCriterion("domain_uuid between", value1, value2, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andDomainUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("domain_uuid not between", value1, value2, "domainUuid");
            return (Criteria) this;
        }

        public Criteria andAlarmSnIsNull() {
            addCriterion("alarm_sn is null");
            return (Criteria) this;
        }

        public Criteria andAlarmSnIsNotNull() {
            addCriterion("alarm_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmSnEqualTo(Integer value) {
            addCriterion("alarm_sn =", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnNotEqualTo(Integer value) {
            addCriterion("alarm_sn <>", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnGreaterThan(Integer value) {
            addCriterion("alarm_sn >", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_sn >=", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnLessThan(Integer value) {
            addCriterion("alarm_sn <", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_sn <=", value, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnIn(List<Integer> values) {
            addCriterion("alarm_sn in", values, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnNotIn(List<Integer> values) {
            addCriterion("alarm_sn not in", values, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnBetween(Integer value1, Integer value2) {
            addCriterion("alarm_sn between", value1, value2, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmSnNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_sn not between", value1, value2, "alarmSn");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexIsNull() {
            addCriterion("alarm_index is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexIsNotNull() {
            addCriterion("alarm_index is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexEqualTo(Integer value) {
            addCriterion("alarm_index =", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexNotEqualTo(Integer value) {
            addCriterion("alarm_index <>", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexGreaterThan(Integer value) {
            addCriterion("alarm_index >", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_index >=", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexLessThan(Integer value) {
            addCriterion("alarm_index <", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_index <=", value, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexIn(List<Integer> values) {
            addCriterion("alarm_index in", values, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexNotIn(List<Integer> values) {
            addCriterion("alarm_index not in", values, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexBetween(Integer value1, Integer value2) {
            addCriterion("alarm_index between", value1, value2, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andAlarmIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_index not between", value1, value2, "alarmIndex");
            return (Criteria) this;
        }

        public Criteria andCleanTimeIsNull() {
            addCriterion("clean_time is null");
            return (Criteria) this;
        }

        public Criteria andCleanTimeIsNotNull() {
            addCriterion("clean_time is not null");
            return (Criteria) this;
        }

        public Criteria andCleanTimeEqualTo(Date value) {
            addCriterion("clean_time =", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeNotEqualTo(Date value) {
            addCriterion("clean_time <>", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeGreaterThan(Date value) {
            addCriterion("clean_time >", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clean_time >=", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeLessThan(Date value) {
            addCriterion("clean_time <", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeLessThanOrEqualTo(Date value) {
            addCriterion("clean_time <=", value, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeIn(List<Date> values) {
            addCriterion("clean_time in", values, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeNotIn(List<Date> values) {
            addCriterion("clean_time not in", values, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeBetween(Date value1, Date value2) {
            addCriterion("clean_time between", value1, value2, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanTimeNotBetween(Date value1, Date value2) {
            addCriterion("clean_time not between", value1, value2, "cleanTime");
            return (Criteria) this;
        }

        public Criteria andCleanFlagIsNull() {
            addCriterion("clean_flag is null");
            return (Criteria) this;
        }

        public Criteria andCleanFlagIsNotNull() {
            addCriterion("clean_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCleanFlagEqualTo(Integer value) {
            addCriterion("clean_flag =", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagNotEqualTo(Integer value) {
            addCriterion("clean_flag <>", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagGreaterThan(Integer value) {
            addCriterion("clean_flag >", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("clean_flag >=", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagLessThan(Integer value) {
            addCriterion("clean_flag <", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagLessThanOrEqualTo(Integer value) {
            addCriterion("clean_flag <=", value, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagIn(List<Integer> values) {
            addCriterion("clean_flag in", values, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagNotIn(List<Integer> values) {
            addCriterion("clean_flag not in", values, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagBetween(Integer value1, Integer value2) {
            addCriterion("clean_flag between", value1, value2, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andCleanFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("clean_flag not between", value1, value2, "cleanFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIsNull() {
            addCriterion("confirm_flag is null");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIsNotNull() {
            addCriterion("confirm_flag is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagEqualTo(Integer value) {
            addCriterion("confirm_flag =", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotEqualTo(Integer value) {
            addCriterion("confirm_flag <>", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagGreaterThan(Integer value) {
            addCriterion("confirm_flag >", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_flag >=", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagLessThan(Integer value) {
            addCriterion("confirm_flag <", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_flag <=", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIn(List<Integer> values) {
            addCriterion("confirm_flag in", values, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotIn(List<Integer> values) {
            addCriterion("confirm_flag not in", values, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagBetween(Integer value1, Integer value2) {
            addCriterion("confirm_flag between", value1, value2, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_flag not between", value1, value2, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnIsNull() {
            addCriterion("ne_inner_sn is null");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnIsNotNull() {
            addCriterion("ne_inner_sn is not null");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnEqualTo(Integer value) {
            addCriterion("ne_inner_sn =", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnNotEqualTo(Integer value) {
            addCriterion("ne_inner_sn <>", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnGreaterThan(Integer value) {
            addCriterion("ne_inner_sn >", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("ne_inner_sn >=", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnLessThan(Integer value) {
            addCriterion("ne_inner_sn <", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnLessThanOrEqualTo(Integer value) {
            addCriterion("ne_inner_sn <=", value, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnIn(List<Integer> values) {
            addCriterion("ne_inner_sn in", values, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnNotIn(List<Integer> values) {
            addCriterion("ne_inner_sn not in", values, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnBetween(Integer value1, Integer value2) {
            addCriterion("ne_inner_sn between", value1, value2, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andNeInnerSnNotBetween(Integer value1, Integer value2) {
            addCriterion("ne_inner_sn not between", value1, value2, "neInnerSn");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagIsNull() {
            addCriterion("alarm_flag is null");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagIsNotNull() {
            addCriterion("alarm_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagEqualTo(Integer value) {
            addCriterion("alarm_flag =", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagNotEqualTo(Integer value) {
            addCriterion("alarm_flag <>", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagGreaterThan(Integer value) {
            addCriterion("alarm_flag >", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_flag >=", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagLessThan(Integer value) {
            addCriterion("alarm_flag <", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_flag <=", value, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagIn(List<Integer> values) {
            addCriterion("alarm_flag in", values, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagNotIn(List<Integer> values) {
            addCriterion("alarm_flag not in", values, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagBetween(Integer value1, Integer value2) {
            addCriterion("alarm_flag between", value1, value2, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andAlarmFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_flag not between", value1, value2, "alarmFlag");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNull() {
            addCriterion("push_type is null");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNotNull() {
            addCriterion("push_type is not null");
            return (Criteria) this;
        }

        public Criteria andPushTypeEqualTo(Integer value) {
            addCriterion("push_type =", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotEqualTo(Integer value) {
            addCriterion("push_type <>", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThan(Integer value) {
            addCriterion("push_type >", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_type >=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThan(Integer value) {
            addCriterion("push_type <", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThanOrEqualTo(Integer value) {
            addCriterion("push_type <=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeIn(List<Integer> values) {
            addCriterion("push_type in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotIn(List<Integer> values) {
            addCriterion("push_type not in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeBetween(Integer value1, Integer value2) {
            addCriterion("push_type between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("push_type not between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushFlagIsNull() {
            addCriterion("push_flag is null");
            return (Criteria) this;
        }

        public Criteria andPushFlagIsNotNull() {
            addCriterion("push_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPushFlagEqualTo(Integer value) {
            addCriterion("push_flag =", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotEqualTo(Integer value) {
            addCriterion("push_flag <>", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagGreaterThan(Integer value) {
            addCriterion("push_flag >", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_flag >=", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagLessThan(Integer value) {
            addCriterion("push_flag <", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagLessThanOrEqualTo(Integer value) {
            addCriterion("push_flag <=", value, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagIn(List<Integer> values) {
            addCriterion("push_flag in", values, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotIn(List<Integer> values) {
            addCriterion("push_flag not in", values, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagBetween(Integer value1, Integer value2) {
            addCriterion("push_flag between", value1, value2, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("push_flag not between", value1, value2, "pushFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagIsNull() {
            addCriterion("push_sms_flag is null");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagIsNotNull() {
            addCriterion("push_sms_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagEqualTo(Integer value) {
            addCriterion("push_sms_flag =", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagNotEqualTo(Integer value) {
            addCriterion("push_sms_flag <>", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagGreaterThan(Integer value) {
            addCriterion("push_sms_flag >", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_sms_flag >=", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagLessThan(Integer value) {
            addCriterion("push_sms_flag <", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagLessThanOrEqualTo(Integer value) {
            addCriterion("push_sms_flag <=", value, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagIn(List<Integer> values) {
            addCriterion("push_sms_flag in", values, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagNotIn(List<Integer> values) {
            addCriterion("push_sms_flag not in", values, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagBetween(Integer value1, Integer value2) {
            addCriterion("push_sms_flag between", value1, value2, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushSmsFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("push_sms_flag not between", value1, value2, "pushSmsFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagIsNull() {
            addCriterion("push_mail_flag is null");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagIsNotNull() {
            addCriterion("push_mail_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagEqualTo(Integer value) {
            addCriterion("push_mail_flag =", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagNotEqualTo(Integer value) {
            addCriterion("push_mail_flag <>", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagGreaterThan(Integer value) {
            addCriterion("push_mail_flag >", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_mail_flag >=", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagLessThan(Integer value) {
            addCriterion("push_mail_flag <", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagLessThanOrEqualTo(Integer value) {
            addCriterion("push_mail_flag <=", value, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagIn(List<Integer> values) {
            addCriterion("push_mail_flag in", values, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagNotIn(List<Integer> values) {
            addCriterion("push_mail_flag not in", values, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagBetween(Integer value1, Integer value2) {
            addCriterion("push_mail_flag between", value1, value2, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andPushMailFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("push_mail_flag not between", value1, value2, "pushMailFlag");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseIsNull() {
            addCriterion("ne_cpu_use is null");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseIsNotNull() {
            addCriterion("ne_cpu_use is not null");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseEqualTo(Integer value) {
            addCriterion("ne_cpu_use =", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseNotEqualTo(Integer value) {
            addCriterion("ne_cpu_use <>", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseGreaterThan(Integer value) {
            addCriterion("ne_cpu_use >", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("ne_cpu_use >=", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseLessThan(Integer value) {
            addCriterion("ne_cpu_use <", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseLessThanOrEqualTo(Integer value) {
            addCriterion("ne_cpu_use <=", value, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseIn(List<Integer> values) {
            addCriterion("ne_cpu_use in", values, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseNotIn(List<Integer> values) {
            addCriterion("ne_cpu_use not in", values, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseBetween(Integer value1, Integer value2) {
            addCriterion("ne_cpu_use between", value1, value2, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andNeCpuUseNotBetween(Integer value1, Integer value2) {
            addCriterion("ne_cpu_use not between", value1, value2, "neCpuUse");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalIsNull() {
            addCriterion("sip_register_interval is null");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalIsNotNull() {
            addCriterion("sip_register_interval is not null");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalEqualTo(Integer value) {
            addCriterion("sip_register_interval =", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalNotEqualTo(Integer value) {
            addCriterion("sip_register_interval <>", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalGreaterThan(Integer value) {
            addCriterion("sip_register_interval >", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sip_register_interval >=", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalLessThan(Integer value) {
            addCriterion("sip_register_interval <", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("sip_register_interval <=", value, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalIn(List<Integer> values) {
            addCriterion("sip_register_interval in", values, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalNotIn(List<Integer> values) {
            addCriterion("sip_register_interval not in", values, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalBetween(Integer value1, Integer value2) {
            addCriterion("sip_register_interval between", value1, value2, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andSipRegisterIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("sip_register_interval not between", value1, value2, "sipRegisterInterval");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNull() {
            addCriterion("alarm_level is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNotNull() {
            addCriterion("alarm_level is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelEqualTo(Integer value) {
            addCriterion("alarm_level =", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotEqualTo(Integer value) {
            addCriterion("alarm_level <>", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThan(Integer value) {
            addCriterion("alarm_level >", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_level >=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThan(Integer value) {
            addCriterion("alarm_level <", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_level <=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIn(List<Integer> values) {
            addCriterion("alarm_level in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotIn(List<Integer> values) {
            addCriterion("alarm_level not in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelBetween(Integer value1, Integer value2) {
            addCriterion("alarm_level between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_level not between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeIsNull() {
            addCriterion("alarm_alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeIsNotNull() {
            addCriterion("alarm_alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeEqualTo(Integer value) {
            addCriterion("alarm_alarm_type =", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarm_alarm_type <>", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarm_alarm_type >", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_alarm_type >=", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeLessThan(Integer value) {
            addCriterion("alarm_alarm_type <", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_alarm_type <=", value, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeIn(List<Integer> values) {
            addCriterion("alarm_alarm_type in", values, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarm_alarm_type not in", values, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarm_alarm_type between", value1, value2, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_alarm_type not between", value1, value2, "alarmAlarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNull() {
            addCriterion("alarm_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNotNull() {
            addCriterion("alarm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameEqualTo(String value) {
            addCriterion("alarm_name =", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotEqualTo(String value) {
            addCriterion("alarm_name <>", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThan(String value) {
            addCriterion("alarm_name >", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_name >=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThan(String value) {
            addCriterion("alarm_name <", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThanOrEqualTo(String value) {
            addCriterion("alarm_name <=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLike(String value) {
            addCriterion("alarm_name like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotLike(String value) {
            addCriterion("alarm_name not like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIn(List<String> values) {
            addCriterion("alarm_name in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotIn(List<String> values) {
            addCriterion("alarm_name not in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameBetween(String value1, String value2) {
            addCriterion("alarm_name between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotBetween(String value1, String value2) {
            addCriterion("alarm_name not between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andNeSnIsNull() {
            addCriterion("ne_sn is null");
            return (Criteria) this;
        }

        public Criteria andNeSnIsNotNull() {
            addCriterion("ne_sn is not null");
            return (Criteria) this;
        }

        public Criteria andNeSnEqualTo(String value) {
            addCriterion("ne_sn =", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnNotEqualTo(String value) {
            addCriterion("ne_sn <>", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnGreaterThan(String value) {
            addCriterion("ne_sn >", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnGreaterThanOrEqualTo(String value) {
            addCriterion("ne_sn >=", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnLessThan(String value) {
            addCriterion("ne_sn <", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnLessThanOrEqualTo(String value) {
            addCriterion("ne_sn <=", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnLike(String value) {
            addCriterion("ne_sn like", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnNotLike(String value) {
            addCriterion("ne_sn not like", value, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnIn(List<String> values) {
            addCriterion("ne_sn in", values, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnNotIn(List<String> values) {
            addCriterion("ne_sn not in", values, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnBetween(String value1, String value2) {
            addCriterion("ne_sn between", value1, value2, "neSn");
            return (Criteria) this;
        }

        public Criteria andNeSnNotBetween(String value1, String value2) {
            addCriterion("ne_sn not between", value1, value2, "neSn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}