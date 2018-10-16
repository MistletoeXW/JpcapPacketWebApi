package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ARPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ARPExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrIsNull() {
            addCriterion("target_protoaddr is null");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrIsNotNull() {
            addCriterion("target_protoaddr is not null");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrEqualTo(String value) {
            addCriterion("target_protoaddr =", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrNotEqualTo(String value) {
            addCriterion("target_protoaddr <>", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrGreaterThan(String value) {
            addCriterion("target_protoaddr >", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("target_protoaddr >=", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrLessThan(String value) {
            addCriterion("target_protoaddr <", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrLessThanOrEqualTo(String value) {
            addCriterion("target_protoaddr <=", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrLike(String value) {
            addCriterion("target_protoaddr like", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrNotLike(String value) {
            addCriterion("target_protoaddr not like", value, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrIn(List<String> values) {
            addCriterion("target_protoaddr in", values, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrNotIn(List<String> values) {
            addCriterion("target_protoaddr not in", values, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrBetween(String value1, String value2) {
            addCriterion("target_protoaddr between", value1, value2, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetProtoaddrNotBetween(String value1, String value2) {
            addCriterion("target_protoaddr not between", value1, value2, "targetProtoaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrIsNull() {
            addCriterion("target_hardaddr is null");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrIsNotNull() {
            addCriterion("target_hardaddr is not null");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrEqualTo(String value) {
            addCriterion("target_hardaddr =", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrNotEqualTo(String value) {
            addCriterion("target_hardaddr <>", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrGreaterThan(String value) {
            addCriterion("target_hardaddr >", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrGreaterThanOrEqualTo(String value) {
            addCriterion("target_hardaddr >=", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrLessThan(String value) {
            addCriterion("target_hardaddr <", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrLessThanOrEqualTo(String value) {
            addCriterion("target_hardaddr <=", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrLike(String value) {
            addCriterion("target_hardaddr like", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrNotLike(String value) {
            addCriterion("target_hardaddr not like", value, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrIn(List<String> values) {
            addCriterion("target_hardaddr in", values, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrNotIn(List<String> values) {
            addCriterion("target_hardaddr not in", values, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrBetween(String value1, String value2) {
            addCriterion("target_hardaddr between", value1, value2, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andTargetHardaddrNotBetween(String value1, String value2) {
            addCriterion("target_hardaddr not between", value1, value2, "targetHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrIsNull() {
            addCriterion("sender_protoaddr is null");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrIsNotNull() {
            addCriterion("sender_protoaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrEqualTo(String value) {
            addCriterion("sender_protoaddr =", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrNotEqualTo(String value) {
            addCriterion("sender_protoaddr <>", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrGreaterThan(String value) {
            addCriterion("sender_protoaddr >", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("sender_protoaddr >=", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrLessThan(String value) {
            addCriterion("sender_protoaddr <", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrLessThanOrEqualTo(String value) {
            addCriterion("sender_protoaddr <=", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrLike(String value) {
            addCriterion("sender_protoaddr like", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrNotLike(String value) {
            addCriterion("sender_protoaddr not like", value, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrIn(List<String> values) {
            addCriterion("sender_protoaddr in", values, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrNotIn(List<String> values) {
            addCriterion("sender_protoaddr not in", values, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrBetween(String value1, String value2) {
            addCriterion("sender_protoaddr between", value1, value2, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderProtoaddrNotBetween(String value1, String value2) {
            addCriterion("sender_protoaddr not between", value1, value2, "senderProtoaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrIsNull() {
            addCriterion("sender_hardaddr is null");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrIsNotNull() {
            addCriterion("sender_hardaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrEqualTo(String value) {
            addCriterion("sender_hardaddr =", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrNotEqualTo(String value) {
            addCriterion("sender_hardaddr <>", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrGreaterThan(String value) {
            addCriterion("sender_hardaddr >", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrGreaterThanOrEqualTo(String value) {
            addCriterion("sender_hardaddr >=", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrLessThan(String value) {
            addCriterion("sender_hardaddr <", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrLessThanOrEqualTo(String value) {
            addCriterion("sender_hardaddr <=", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrLike(String value) {
            addCriterion("sender_hardaddr like", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrNotLike(String value) {
            addCriterion("sender_hardaddr not like", value, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrIn(List<String> values) {
            addCriterion("sender_hardaddr in", values, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrNotIn(List<String> values) {
            addCriterion("sender_hardaddr not in", values, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrBetween(String value1, String value2) {
            addCriterion("sender_hardaddr between", value1, value2, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andSenderHardaddrNotBetween(String value1, String value2) {
            addCriterion("sender_hardaddr not between", value1, value2, "senderHardaddr");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(Integer value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(Integer value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(Integer value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(Integer value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(Integer value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<Integer> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<Integer> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(Integer value1, Integer value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(Integer value1, Integer value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andPlenIsNull() {
            addCriterion("plen is null");
            return (Criteria) this;
        }

        public Criteria andPlenIsNotNull() {
            addCriterion("plen is not null");
            return (Criteria) this;
        }

        public Criteria andPlenEqualTo(Integer value) {
            addCriterion("plen =", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenNotEqualTo(Integer value) {
            addCriterion("plen <>", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenGreaterThan(Integer value) {
            addCriterion("plen >", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenGreaterThanOrEqualTo(Integer value) {
            addCriterion("plen >=", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenLessThan(Integer value) {
            addCriterion("plen <", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenLessThanOrEqualTo(Integer value) {
            addCriterion("plen <=", value, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenIn(List<Integer> values) {
            addCriterion("plen in", values, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenNotIn(List<Integer> values) {
            addCriterion("plen not in", values, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenBetween(Integer value1, Integer value2) {
            addCriterion("plen between", value1, value2, "plen");
            return (Criteria) this;
        }

        public Criteria andPlenNotBetween(Integer value1, Integer value2) {
            addCriterion("plen not between", value1, value2, "plen");
            return (Criteria) this;
        }

        public Criteria andHlenIsNull() {
            addCriterion("hlen is null");
            return (Criteria) this;
        }

        public Criteria andHlenIsNotNull() {
            addCriterion("hlen is not null");
            return (Criteria) this;
        }

        public Criteria andHlenEqualTo(Integer value) {
            addCriterion("hlen =", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenNotEqualTo(Integer value) {
            addCriterion("hlen <>", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenGreaterThan(Integer value) {
            addCriterion("hlen >", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenGreaterThanOrEqualTo(Integer value) {
            addCriterion("hlen >=", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenLessThan(Integer value) {
            addCriterion("hlen <", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenLessThanOrEqualTo(Integer value) {
            addCriterion("hlen <=", value, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenIn(List<Integer> values) {
            addCriterion("hlen in", values, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenNotIn(List<Integer> values) {
            addCriterion("hlen not in", values, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenBetween(Integer value1, Integer value2) {
            addCriterion("hlen between", value1, value2, "hlen");
            return (Criteria) this;
        }

        public Criteria andHlenNotBetween(Integer value1, Integer value2) {
            addCriterion("hlen not between", value1, value2, "hlen");
            return (Criteria) this;
        }

        public Criteria andPrototypeIsNull() {
            addCriterion("prototype is null");
            return (Criteria) this;
        }

        public Criteria andPrototypeIsNotNull() {
            addCriterion("prototype is not null");
            return (Criteria) this;
        }

        public Criteria andPrototypeEqualTo(Integer value) {
            addCriterion("prototype =", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeNotEqualTo(Integer value) {
            addCriterion("prototype <>", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeGreaterThan(Integer value) {
            addCriterion("prototype >", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prototype >=", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeLessThan(Integer value) {
            addCriterion("prototype <", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeLessThanOrEqualTo(Integer value) {
            addCriterion("prototype <=", value, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeIn(List<Integer> values) {
            addCriterion("prototype in", values, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeNotIn(List<Integer> values) {
            addCriterion("prototype not in", values, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeBetween(Integer value1, Integer value2) {
            addCriterion("prototype between", value1, value2, "prototype");
            return (Criteria) this;
        }

        public Criteria andPrototypeNotBetween(Integer value1, Integer value2) {
            addCriterion("prototype not between", value1, value2, "prototype");
            return (Criteria) this;
        }

        public Criteria andHardtypeIsNull() {
            addCriterion("hardtype is null");
            return (Criteria) this;
        }

        public Criteria andHardtypeIsNotNull() {
            addCriterion("hardtype is not null");
            return (Criteria) this;
        }

        public Criteria andHardtypeEqualTo(Integer value) {
            addCriterion("hardtype =", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeNotEqualTo(Integer value) {
            addCriterion("hardtype <>", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeGreaterThan(Integer value) {
            addCriterion("hardtype >", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hardtype >=", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeLessThan(Integer value) {
            addCriterion("hardtype <", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("hardtype <=", value, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeIn(List<Integer> values) {
            addCriterion("hardtype in", values, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeNotIn(List<Integer> values) {
            addCriterion("hardtype not in", values, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeBetween(Integer value1, Integer value2) {
            addCriterion("hardtype between", value1, value2, "hardtype");
            return (Criteria) this;
        }

        public Criteria andHardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hardtype not between", value1, value2, "hardtype");
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