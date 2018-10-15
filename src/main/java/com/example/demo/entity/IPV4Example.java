package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class IPV4Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IPV4Example() {
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andRsvTosIsNull() {
            addCriterion("rsv_tos is null");
            return (Criteria) this;
        }

        public Criteria andRsvTosIsNotNull() {
            addCriterion("rsv_tos is not null");
            return (Criteria) this;
        }

        public Criteria andRsvTosEqualTo(Integer value) {
            addCriterion("rsv_tos =", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosNotEqualTo(Integer value) {
            addCriterion("rsv_tos <>", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosGreaterThan(Integer value) {
            addCriterion("rsv_tos >", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosGreaterThanOrEqualTo(Integer value) {
            addCriterion("rsv_tos >=", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosLessThan(Integer value) {
            addCriterion("rsv_tos <", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosLessThanOrEqualTo(Integer value) {
            addCriterion("rsv_tos <=", value, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosIn(List<Integer> values) {
            addCriterion("rsv_tos in", values, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosNotIn(List<Integer> values) {
            addCriterion("rsv_tos not in", values, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosBetween(Integer value1, Integer value2) {
            addCriterion("rsv_tos between", value1, value2, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andRsvTosNotBetween(Integer value1, Integer value2) {
            addCriterion("rsv_tos not between", value1, value2, "rsvTos");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
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

        public Criteria andDstIpIsNull() {
            addCriterion("dst_ip is null");
            return (Criteria) this;
        }

        public Criteria andDstIpIsNotNull() {
            addCriterion("dst_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDstIpEqualTo(String value) {
            addCriterion("dst_ip =", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotEqualTo(String value) {
            addCriterion("dst_ip <>", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpGreaterThan(String value) {
            addCriterion("dst_ip >", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpGreaterThanOrEqualTo(String value) {
            addCriterion("dst_ip >=", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLessThan(String value) {
            addCriterion("dst_ip <", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLessThanOrEqualTo(String value) {
            addCriterion("dst_ip <=", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLike(String value) {
            addCriterion("dst_ip like", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotLike(String value) {
            addCriterion("dst_ip not like", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpIn(List<String> values) {
            addCriterion("dst_ip in", values, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotIn(List<String> values) {
            addCriterion("dst_ip not in", values, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpBetween(String value1, String value2) {
            addCriterion("dst_ip between", value1, value2, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotBetween(String value1, String value2) {
            addCriterion("dst_ip not between", value1, value2, "dstIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpIsNull() {
            addCriterion("src_ip is null");
            return (Criteria) this;
        }

        public Criteria andSrcIpIsNotNull() {
            addCriterion("src_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSrcIpEqualTo(String value) {
            addCriterion("src_ip =", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotEqualTo(String value) {
            addCriterion("src_ip <>", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpGreaterThan(String value) {
            addCriterion("src_ip >", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpGreaterThanOrEqualTo(String value) {
            addCriterion("src_ip >=", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLessThan(String value) {
            addCriterion("src_ip <", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLessThanOrEqualTo(String value) {
            addCriterion("src_ip <=", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLike(String value) {
            addCriterion("src_ip like", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotLike(String value) {
            addCriterion("src_ip not like", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpIn(List<String> values) {
            addCriterion("src_ip in", values, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotIn(List<String> values) {
            addCriterion("src_ip not in", values, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpBetween(String value1, String value2) {
            addCriterion("src_ip between", value1, value2, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotBetween(String value1, String value2) {
            addCriterion("src_ip not between", value1, value2, "srcIp");
            return (Criteria) this;
        }

        public Criteria andIdentIsNull() {
            addCriterion("ident is null");
            return (Criteria) this;
        }

        public Criteria andIdentIsNotNull() {
            addCriterion("ident is not null");
            return (Criteria) this;
        }

        public Criteria andIdentEqualTo(Integer value) {
            addCriterion("ident =", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotEqualTo(Integer value) {
            addCriterion("ident <>", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThan(Integer value) {
            addCriterion("ident >", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ident >=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThan(Integer value) {
            addCriterion("ident <", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentLessThanOrEqualTo(Integer value) {
            addCriterion("ident <=", value, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentIn(List<Integer> values) {
            addCriterion("ident in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotIn(List<Integer> values) {
            addCriterion("ident not in", values, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentBetween(Integer value1, Integer value2) {
            addCriterion("ident between", value1, value2, "ident");
            return (Criteria) this;
        }

        public Criteria andIdentNotBetween(Integer value1, Integer value2) {
            addCriterion("ident not between", value1, value2, "ident");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(Integer value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(Integer value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(Integer value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(Integer value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(Integer value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<Integer> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<Integer> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(Integer value1, Integer value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andHopLimitIsNull() {
            addCriterion("hop_limit is null");
            return (Criteria) this;
        }

        public Criteria andHopLimitIsNotNull() {
            addCriterion("hop_limit is not null");
            return (Criteria) this;
        }

        public Criteria andHopLimitEqualTo(Integer value) {
            addCriterion("hop_limit =", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitNotEqualTo(Integer value) {
            addCriterion("hop_limit <>", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitGreaterThan(Integer value) {
            addCriterion("hop_limit >", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("hop_limit >=", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitLessThan(Integer value) {
            addCriterion("hop_limit <", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitLessThanOrEqualTo(Integer value) {
            addCriterion("hop_limit <=", value, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitIn(List<Integer> values) {
            addCriterion("hop_limit in", values, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitNotIn(List<Integer> values) {
            addCriterion("hop_limit not in", values, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitBetween(Integer value1, Integer value2) {
            addCriterion("hop_limit between", value1, value2, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andHopLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("hop_limit not between", value1, value2, "hopLimit");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNull() {
            addCriterion("offset is null");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNotNull() {
            addCriterion("offset is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetEqualTo(Integer value) {
            addCriterion("offset =", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotEqualTo(Integer value) {
            addCriterion("offset <>", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThan(Integer value) {
            addCriterion("offset >", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset >=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThan(Integer value) {
            addCriterion("offset <", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("offset <=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetIn(List<Integer> values) {
            addCriterion("offset in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotIn(List<Integer> values) {
            addCriterion("offset not in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetBetween(Integer value1, Integer value2) {
            addCriterion("offset between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("offset not between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andMoreFragIsNull() {
            addCriterion("more_frag is null");
            return (Criteria) this;
        }

        public Criteria andMoreFragIsNotNull() {
            addCriterion("more_frag is not null");
            return (Criteria) this;
        }

        public Criteria andMoreFragEqualTo(Boolean value) {
            addCriterion("more_frag =", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragNotEqualTo(Boolean value) {
            addCriterion("more_frag <>", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragGreaterThan(Boolean value) {
            addCriterion("more_frag >", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragGreaterThanOrEqualTo(Boolean value) {
            addCriterion("more_frag >=", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragLessThan(Boolean value) {
            addCriterion("more_frag <", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragLessThanOrEqualTo(Boolean value) {
            addCriterion("more_frag <=", value, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragIn(List<Boolean> values) {
            addCriterion("more_frag in", values, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragNotIn(List<Boolean> values) {
            addCriterion("more_frag not in", values, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragBetween(Boolean value1, Boolean value2) {
            addCriterion("more_frag between", value1, value2, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andMoreFragNotBetween(Boolean value1, Boolean value2) {
            addCriterion("more_frag not between", value1, value2, "moreFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragIsNull() {
            addCriterion("dont_frag is null");
            return (Criteria) this;
        }

        public Criteria andDontFragIsNotNull() {
            addCriterion("dont_frag is not null");
            return (Criteria) this;
        }

        public Criteria andDontFragEqualTo(Boolean value) {
            addCriterion("dont_frag =", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragNotEqualTo(Boolean value) {
            addCriterion("dont_frag <>", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragGreaterThan(Boolean value) {
            addCriterion("dont_frag >", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dont_frag >=", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragLessThan(Boolean value) {
            addCriterion("dont_frag <", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragLessThanOrEqualTo(Boolean value) {
            addCriterion("dont_frag <=", value, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragIn(List<Boolean> values) {
            addCriterion("dont_frag in", values, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragNotIn(List<Boolean> values) {
            addCriterion("dont_frag not in", values, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragBetween(Boolean value1, Boolean value2) {
            addCriterion("dont_frag between", value1, value2, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andDontFragNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dont_frag not between", value1, value2, "dontFrag");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
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