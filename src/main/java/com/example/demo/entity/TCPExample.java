package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TCPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCPExample() {
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

        public Criteria andSrcPortIsNull() {
            addCriterion("src_port is null");
            return (Criteria) this;
        }

        public Criteria andSrcPortIsNotNull() {
            addCriterion("src_port is not null");
            return (Criteria) this;
        }

        public Criteria andSrcPortEqualTo(Integer value) {
            addCriterion("src_port =", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortNotEqualTo(Integer value) {
            addCriterion("src_port <>", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortGreaterThan(Integer value) {
            addCriterion("src_port >", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_port >=", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortLessThan(Integer value) {
            addCriterion("src_port <", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortLessThanOrEqualTo(Integer value) {
            addCriterion("src_port <=", value, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortIn(List<Integer> values) {
            addCriterion("src_port in", values, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortNotIn(List<Integer> values) {
            addCriterion("src_port not in", values, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortBetween(Integer value1, Integer value2) {
            addCriterion("src_port between", value1, value2, "srcPort");
            return (Criteria) this;
        }

        public Criteria andSrcPortNotBetween(Integer value1, Integer value2) {
            addCriterion("src_port not between", value1, value2, "srcPort");
            return (Criteria) this;
        }

        public Criteria andDstPortIsNull() {
            addCriterion("dst_port is null");
            return (Criteria) this;
        }

        public Criteria andDstPortIsNotNull() {
            addCriterion("dst_port is not null");
            return (Criteria) this;
        }

        public Criteria andDstPortEqualTo(Integer value) {
            addCriterion("dst_port =", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortNotEqualTo(Integer value) {
            addCriterion("dst_port <>", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortGreaterThan(Integer value) {
            addCriterion("dst_port >", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dst_port >=", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortLessThan(Integer value) {
            addCriterion("dst_port <", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortLessThanOrEqualTo(Integer value) {
            addCriterion("dst_port <=", value, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortIn(List<Integer> values) {
            addCriterion("dst_port in", values, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortNotIn(List<Integer> values) {
            addCriterion("dst_port not in", values, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortBetween(Integer value1, Integer value2) {
            addCriterion("dst_port between", value1, value2, "dstPort");
            return (Criteria) this;
        }

        public Criteria andDstPortNotBetween(Integer value1, Integer value2) {
            addCriterion("dst_port not between", value1, value2, "dstPort");
            return (Criteria) this;
        }

        public Criteria andUrgIsNull() {
            addCriterion("urg is null");
            return (Criteria) this;
        }

        public Criteria andUrgIsNotNull() {
            addCriterion("urg is not null");
            return (Criteria) this;
        }

        public Criteria andUrgEqualTo(Boolean value) {
            addCriterion("urg =", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgNotEqualTo(Boolean value) {
            addCriterion("urg <>", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgGreaterThan(Boolean value) {
            addCriterion("urg >", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("urg >=", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgLessThan(Boolean value) {
            addCriterion("urg <", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgLessThanOrEqualTo(Boolean value) {
            addCriterion("urg <=", value, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgIn(List<Boolean> values) {
            addCriterion("urg in", values, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgNotIn(List<Boolean> values) {
            addCriterion("urg not in", values, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgBetween(Boolean value1, Boolean value2) {
            addCriterion("urg between", value1, value2, "urg");
            return (Criteria) this;
        }

        public Criteria andUrgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("urg not between", value1, value2, "urg");
            return (Criteria) this;
        }

        public Criteria andAckIsNull() {
            addCriterion("ack is null");
            return (Criteria) this;
        }

        public Criteria andAckIsNotNull() {
            addCriterion("ack is not null");
            return (Criteria) this;
        }

        public Criteria andAckEqualTo(Boolean value) {
            addCriterion("ack =", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckNotEqualTo(Boolean value) {
            addCriterion("ack <>", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckGreaterThan(Boolean value) {
            addCriterion("ack >", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ack >=", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckLessThan(Boolean value) {
            addCriterion("ack <", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckLessThanOrEqualTo(Boolean value) {
            addCriterion("ack <=", value, "ack");
            return (Criteria) this;
        }

        public Criteria andAckIn(List<Boolean> values) {
            addCriterion("ack in", values, "ack");
            return (Criteria) this;
        }

        public Criteria andAckNotIn(List<Boolean> values) {
            addCriterion("ack not in", values, "ack");
            return (Criteria) this;
        }

        public Criteria andAckBetween(Boolean value1, Boolean value2) {
            addCriterion("ack between", value1, value2, "ack");
            return (Criteria) this;
        }

        public Criteria andAckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ack not between", value1, value2, "ack");
            return (Criteria) this;
        }

        public Criteria andPshIsNull() {
            addCriterion("psh is null");
            return (Criteria) this;
        }

        public Criteria andPshIsNotNull() {
            addCriterion("psh is not null");
            return (Criteria) this;
        }

        public Criteria andPshEqualTo(Boolean value) {
            addCriterion("psh =", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshNotEqualTo(Boolean value) {
            addCriterion("psh <>", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshGreaterThan(Boolean value) {
            addCriterion("psh >", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psh >=", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshLessThan(Boolean value) {
            addCriterion("psh <", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshLessThanOrEqualTo(Boolean value) {
            addCriterion("psh <=", value, "psh");
            return (Criteria) this;
        }

        public Criteria andPshIn(List<Boolean> values) {
            addCriterion("psh in", values, "psh");
            return (Criteria) this;
        }

        public Criteria andPshNotIn(List<Boolean> values) {
            addCriterion("psh not in", values, "psh");
            return (Criteria) this;
        }

        public Criteria andPshBetween(Boolean value1, Boolean value2) {
            addCriterion("psh between", value1, value2, "psh");
            return (Criteria) this;
        }

        public Criteria andPshNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psh not between", value1, value2, "psh");
            return (Criteria) this;
        }

        public Criteria andRstIsNull() {
            addCriterion("rst is null");
            return (Criteria) this;
        }

        public Criteria andRstIsNotNull() {
            addCriterion("rst is not null");
            return (Criteria) this;
        }

        public Criteria andRstEqualTo(Boolean value) {
            addCriterion("rst =", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotEqualTo(Boolean value) {
            addCriterion("rst <>", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstGreaterThan(Boolean value) {
            addCriterion("rst >", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rst >=", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstLessThan(Boolean value) {
            addCriterion("rst <", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstLessThanOrEqualTo(Boolean value) {
            addCriterion("rst <=", value, "rst");
            return (Criteria) this;
        }

        public Criteria andRstIn(List<Boolean> values) {
            addCriterion("rst in", values, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotIn(List<Boolean> values) {
            addCriterion("rst not in", values, "rst");
            return (Criteria) this;
        }

        public Criteria andRstBetween(Boolean value1, Boolean value2) {
            addCriterion("rst between", value1, value2, "rst");
            return (Criteria) this;
        }

        public Criteria andRstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rst not between", value1, value2, "rst");
            return (Criteria) this;
        }

        public Criteria andSynIsNull() {
            addCriterion("syn is null");
            return (Criteria) this;
        }

        public Criteria andSynIsNotNull() {
            addCriterion("syn is not null");
            return (Criteria) this;
        }

        public Criteria andSynEqualTo(Boolean value) {
            addCriterion("syn =", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynNotEqualTo(Boolean value) {
            addCriterion("syn <>", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynGreaterThan(Boolean value) {
            addCriterion("syn >", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynGreaterThanOrEqualTo(Boolean value) {
            addCriterion("syn >=", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynLessThan(Boolean value) {
            addCriterion("syn <", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynLessThanOrEqualTo(Boolean value) {
            addCriterion("syn <=", value, "syn");
            return (Criteria) this;
        }

        public Criteria andSynIn(List<Boolean> values) {
            addCriterion("syn in", values, "syn");
            return (Criteria) this;
        }

        public Criteria andSynNotIn(List<Boolean> values) {
            addCriterion("syn not in", values, "syn");
            return (Criteria) this;
        }

        public Criteria andSynBetween(Boolean value1, Boolean value2) {
            addCriterion("syn between", value1, value2, "syn");
            return (Criteria) this;
        }

        public Criteria andSynNotBetween(Boolean value1, Boolean value2) {
            addCriterion("syn not between", value1, value2, "syn");
            return (Criteria) this;
        }

        public Criteria andFinIsNull() {
            addCriterion("fin is null");
            return (Criteria) this;
        }

        public Criteria andFinIsNotNull() {
            addCriterion("fin is not null");
            return (Criteria) this;
        }

        public Criteria andFinEqualTo(Boolean value) {
            addCriterion("fin =", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinNotEqualTo(Boolean value) {
            addCriterion("fin <>", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinGreaterThan(Boolean value) {
            addCriterion("fin >", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fin >=", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinLessThan(Boolean value) {
            addCriterion("fin <", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinLessThanOrEqualTo(Boolean value) {
            addCriterion("fin <=", value, "fin");
            return (Criteria) this;
        }

        public Criteria andFinIn(List<Boolean> values) {
            addCriterion("fin in", values, "fin");
            return (Criteria) this;
        }

        public Criteria andFinNotIn(List<Boolean> values) {
            addCriterion("fin not in", values, "fin");
            return (Criteria) this;
        }

        public Criteria andFinBetween(Boolean value1, Boolean value2) {
            addCriterion("fin between", value1, value2, "fin");
            return (Criteria) this;
        }

        public Criteria andFinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fin not between", value1, value2, "fin");
            return (Criteria) this;
        }

        public Criteria andWindowIsNull() {
            addCriterion("window is null");
            return (Criteria) this;
        }

        public Criteria andWindowIsNotNull() {
            addCriterion("window is not null");
            return (Criteria) this;
        }

        public Criteria andWindowEqualTo(Integer value) {
            addCriterion("window =", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotEqualTo(Integer value) {
            addCriterion("window <>", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowGreaterThan(Integer value) {
            addCriterion("window >", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("window >=", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowLessThan(Integer value) {
            addCriterion("window <", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowLessThanOrEqualTo(Integer value) {
            addCriterion("window <=", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowIn(List<Integer> values) {
            addCriterion("window in", values, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotIn(List<Integer> values) {
            addCriterion("window not in", values, "window");
            return (Criteria) this;
        }

        public Criteria andWindowBetween(Integer value1, Integer value2) {
            addCriterion("window between", value1, value2, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotBetween(Integer value1, Integer value2) {
            addCriterion("window not between", value1, value2, "window");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerIsNull() {
            addCriterion("urgent_pointer is null");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerIsNotNull() {
            addCriterion("urgent_pointer is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerEqualTo(Integer value) {
            addCriterion("urgent_pointer =", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerNotEqualTo(Integer value) {
            addCriterion("urgent_pointer <>", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerGreaterThan(Integer value) {
            addCriterion("urgent_pointer >", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerGreaterThanOrEqualTo(Integer value) {
            addCriterion("urgent_pointer >=", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerLessThan(Integer value) {
            addCriterion("urgent_pointer <", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerLessThanOrEqualTo(Integer value) {
            addCriterion("urgent_pointer <=", value, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerIn(List<Integer> values) {
            addCriterion("urgent_pointer in", values, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerNotIn(List<Integer> values) {
            addCriterion("urgent_pointer not in", values, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerBetween(Integer value1, Integer value2) {
            addCriterion("urgent_pointer between", value1, value2, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andUrgentPointerNotBetween(Integer value1, Integer value2) {
            addCriterion("urgent_pointer not between", value1, value2, "urgentPointer");
            return (Criteria) this;
        }

        public Criteria andOptionIsNull() {
            addCriterion("option is null");
            return (Criteria) this;
        }

        public Criteria andOptionIsNotNull() {
            addCriterion("option is not null");
            return (Criteria) this;
        }

        public Criteria andOptionEqualTo(String value) {
            addCriterion("option =", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotEqualTo(String value) {
            addCriterion("option <>", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionGreaterThan(String value) {
            addCriterion("option >", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionGreaterThanOrEqualTo(String value) {
            addCriterion("option >=", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLessThan(String value) {
            addCriterion("option <", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLessThanOrEqualTo(String value) {
            addCriterion("option <=", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionLike(String value) {
            addCriterion("option like", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotLike(String value) {
            addCriterion("option not like", value, "option");
            return (Criteria) this;
        }

        public Criteria andOptionIn(List<String> values) {
            addCriterion("option in", values, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotIn(List<String> values) {
            addCriterion("option not in", values, "option");
            return (Criteria) this;
        }

        public Criteria andOptionBetween(String value1, String value2) {
            addCriterion("option between", value1, value2, "option");
            return (Criteria) this;
        }

        public Criteria andOptionNotBetween(String value1, String value2) {
            addCriterion("option not between", value1, value2, "option");
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