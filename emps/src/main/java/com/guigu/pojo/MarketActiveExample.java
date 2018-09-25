package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketActiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketActiveExample() {
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

        public Criteria andActiveIdIsNull() {
            addCriterion("active_id is null");
            return (Criteria) this;
        }

        public Criteria andActiveIdIsNotNull() {
            addCriterion("active_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiveIdEqualTo(Integer value) {
            addCriterion("active_id =", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotEqualTo(Integer value) {
            addCriterion("active_id <>", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdGreaterThan(Integer value) {
            addCriterion("active_id >", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_id >=", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdLessThan(Integer value) {
            addCriterion("active_id <", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("active_id <=", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdIn(List<Integer> values) {
            addCriterion("active_id in", values, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotIn(List<Integer> values) {
            addCriterion("active_id not in", values, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdBetween(Integer value1, Integer value2) {
            addCriterion("active_id between", value1, value2, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("active_id not between", value1, value2, "activeId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andActiveNameIsNull() {
            addCriterion("active_name is null");
            return (Criteria) this;
        }

        public Criteria andActiveNameIsNotNull() {
            addCriterion("active_name is not null");
            return (Criteria) this;
        }

        public Criteria andActiveNameEqualTo(String value) {
            addCriterion("active_name =", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameNotEqualTo(String value) {
            addCriterion("active_name <>", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameGreaterThan(String value) {
            addCriterion("active_name >", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("active_name >=", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameLessThan(String value) {
            addCriterion("active_name <", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameLessThanOrEqualTo(String value) {
            addCriterion("active_name <=", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameLike(String value) {
            addCriterion("active_name like", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameNotLike(String value) {
            addCriterion("active_name not like", value, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameIn(List<String> values) {
            addCriterion("active_name in", values, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameNotIn(List<String> values) {
            addCriterion("active_name not in", values, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameBetween(String value1, String value2) {
            addCriterion("active_name between", value1, value2, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveNameNotBetween(String value1, String value2) {
            addCriterion("active_name not between", value1, value2, "activeName");
            return (Criteria) this;
        }

        public Criteria andActiveStateIsNull() {
            addCriterion("active_state is null");
            return (Criteria) this;
        }

        public Criteria andActiveStateIsNotNull() {
            addCriterion("active_state is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStateEqualTo(Integer value) {
            addCriterion("active_state =", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateNotEqualTo(Integer value) {
            addCriterion("active_state <>", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateGreaterThan(Integer value) {
            addCriterion("active_state >", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_state >=", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateLessThan(Integer value) {
            addCriterion("active_state <", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateLessThanOrEqualTo(Integer value) {
            addCriterion("active_state <=", value, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateIn(List<Integer> values) {
            addCriterion("active_state in", values, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateNotIn(List<Integer> values) {
            addCriterion("active_state not in", values, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateBetween(Integer value1, Integer value2) {
            addCriterion("active_state between", value1, value2, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("active_state not between", value1, value2, "activeState");
            return (Criteria) this;
        }

        public Criteria andActiveStartIsNull() {
            addCriterion("active_start is null");
            return (Criteria) this;
        }

        public Criteria andActiveStartIsNotNull() {
            addCriterion("active_start is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStartEqualTo(Date value) {
            addCriterion("active_start =", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartNotEqualTo(Date value) {
            addCriterion("active_start <>", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartGreaterThan(Date value) {
            addCriterion("active_start >", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartGreaterThanOrEqualTo(Date value) {
            addCriterion("active_start >=", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartLessThan(Date value) {
            addCriterion("active_start <", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartLessThanOrEqualTo(Date value) {
            addCriterion("active_start <=", value, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartIn(List<Date> values) {
            addCriterion("active_start in", values, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartNotIn(List<Date> values) {
            addCriterion("active_start not in", values, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartBetween(Date value1, Date value2) {
            addCriterion("active_start between", value1, value2, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveStartNotBetween(Date value1, Date value2) {
            addCriterion("active_start not between", value1, value2, "activeStart");
            return (Criteria) this;
        }

        public Criteria andActiveEndIsNull() {
            addCriterion("active_end is null");
            return (Criteria) this;
        }

        public Criteria andActiveEndIsNotNull() {
            addCriterion("active_end is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEndEqualTo(Date value) {
            addCriterion("active_end =", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndNotEqualTo(Date value) {
            addCriterion("active_end <>", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndGreaterThan(Date value) {
            addCriterion("active_end >", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndGreaterThanOrEqualTo(Date value) {
            addCriterion("active_end >=", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndLessThan(Date value) {
            addCriterion("active_end <", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndLessThanOrEqualTo(Date value) {
            addCriterion("active_end <=", value, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndIn(List<Date> values) {
            addCriterion("active_end in", values, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndNotIn(List<Date> values) {
            addCriterion("active_end not in", values, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndBetween(Date value1, Date value2) {
            addCriterion("active_end between", value1, value2, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveEndNotBetween(Date value1, Date value2) {
            addCriterion("active_end not between", value1, value2, "activeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNull() {
            addCriterion("active_type is null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNotNull() {
            addCriterion("active_type is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeEqualTo(Integer value) {
            addCriterion("active_type =", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotEqualTo(Integer value) {
            addCriterion("active_type <>", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThan(Integer value) {
            addCriterion("active_type >", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_type >=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThan(Integer value) {
            addCriterion("active_type <", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThanOrEqualTo(Integer value) {
            addCriterion("active_type <=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIn(List<Integer> values) {
            addCriterion("active_type in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotIn(List<Integer> values) {
            addCriterion("active_type not in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeBetween(Integer value1, Integer value2) {
            addCriterion("active_type between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("active_type not between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateIsNull() {
            addCriterion("active_coste_emtimate is null");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateIsNotNull() {
            addCriterion("active_coste_emtimate is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateEqualTo(Double value) {
            addCriterion("active_coste_emtimate =", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateNotEqualTo(Double value) {
            addCriterion("active_coste_emtimate <>", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateGreaterThan(Double value) {
            addCriterion("active_coste_emtimate >", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateGreaterThanOrEqualTo(Double value) {
            addCriterion("active_coste_emtimate >=", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateLessThan(Double value) {
            addCriterion("active_coste_emtimate <", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateLessThanOrEqualTo(Double value) {
            addCriterion("active_coste_emtimate <=", value, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateIn(List<Double> values) {
            addCriterion("active_coste_emtimate in", values, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateNotIn(List<Double> values) {
            addCriterion("active_coste_emtimate not in", values, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateBetween(Double value1, Double value2) {
            addCriterion("active_coste_emtimate between", value1, value2, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEmtimateNotBetween(Double value1, Double value2) {
            addCriterion("active_coste_emtimate not between", value1, value2, "activeCosteEmtimate");
            return (Criteria) this;
        }

        public Criteria andActiveCosteIsNull() {
            addCriterion("active_coste is null");
            return (Criteria) this;
        }

        public Criteria andActiveCosteIsNotNull() {
            addCriterion("active_coste is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCosteEqualTo(Double value) {
            addCriterion("active_coste =", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteNotEqualTo(Double value) {
            addCriterion("active_coste <>", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteGreaterThan(Double value) {
            addCriterion("active_coste >", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteGreaterThanOrEqualTo(Double value) {
            addCriterion("active_coste >=", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteLessThan(Double value) {
            addCriterion("active_coste <", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteLessThanOrEqualTo(Double value) {
            addCriterion("active_coste <=", value, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteIn(List<Double> values) {
            addCriterion("active_coste in", values, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteNotIn(List<Double> values) {
            addCriterion("active_coste not in", values, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteBetween(Double value1, Double value2) {
            addCriterion("active_coste between", value1, value2, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveCosteNotBetween(Double value1, Double value2) {
            addCriterion("active_coste not between", value1, value2, "activeCoste");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateIsNull() {
            addCriterion("active_refect_estimate is null");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateIsNotNull() {
            addCriterion("active_refect_estimate is not null");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateEqualTo(Integer value) {
            addCriterion("active_refect_estimate =", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateNotEqualTo(Integer value) {
            addCriterion("active_refect_estimate <>", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateGreaterThan(Integer value) {
            addCriterion("active_refect_estimate >", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_refect_estimate >=", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateLessThan(Integer value) {
            addCriterion("active_refect_estimate <", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateLessThanOrEqualTo(Integer value) {
            addCriterion("active_refect_estimate <=", value, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateIn(List<Integer> values) {
            addCriterion("active_refect_estimate in", values, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateNotIn(List<Integer> values) {
            addCriterion("active_refect_estimate not in", values, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateBetween(Integer value1, Integer value2) {
            addCriterion("active_refect_estimate between", value1, value2, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveRefectEstimateNotBetween(Integer value1, Integer value2) {
            addCriterion("active_refect_estimate not between", value1, value2, "activeRefectEstimate");
            return (Criteria) this;
        }

        public Criteria andActiveStudentIsNull() {
            addCriterion("active_student is null");
            return (Criteria) this;
        }

        public Criteria andActiveStudentIsNotNull() {
            addCriterion("active_student is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStudentEqualTo(String value) {
            addCriterion("active_student =", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentNotEqualTo(String value) {
            addCriterion("active_student <>", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentGreaterThan(String value) {
            addCriterion("active_student >", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentGreaterThanOrEqualTo(String value) {
            addCriterion("active_student >=", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentLessThan(String value) {
            addCriterion("active_student <", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentLessThanOrEqualTo(String value) {
            addCriterion("active_student <=", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentLike(String value) {
            addCriterion("active_student like", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentNotLike(String value) {
            addCriterion("active_student not like", value, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentIn(List<String> values) {
            addCriterion("active_student in", values, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentNotIn(List<String> values) {
            addCriterion("active_student not in", values, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentBetween(String value1, String value2) {
            addCriterion("active_student between", value1, value2, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveStudentNotBetween(String value1, String value2) {
            addCriterion("active_student not between", value1, value2, "activeStudent");
            return (Criteria) this;
        }

        public Criteria andActiveContentIsNull() {
            addCriterion("active_content is null");
            return (Criteria) this;
        }

        public Criteria andActiveContentIsNotNull() {
            addCriterion("active_content is not null");
            return (Criteria) this;
        }

        public Criteria andActiveContentEqualTo(String value) {
            addCriterion("active_content =", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentNotEqualTo(String value) {
            addCriterion("active_content <>", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentGreaterThan(String value) {
            addCriterion("active_content >", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentGreaterThanOrEqualTo(String value) {
            addCriterion("active_content >=", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentLessThan(String value) {
            addCriterion("active_content <", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentLessThanOrEqualTo(String value) {
            addCriterion("active_content <=", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentLike(String value) {
            addCriterion("active_content like", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentNotLike(String value) {
            addCriterion("active_content not like", value, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentIn(List<String> values) {
            addCriterion("active_content in", values, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentNotIn(List<String> values) {
            addCriterion("active_content not in", values, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentBetween(String value1, String value2) {
            addCriterion("active_content between", value1, value2, "activeContent");
            return (Criteria) this;
        }

        public Criteria andActiveContentNotBetween(String value1, String value2) {
            addCriterion("active_content not between", value1, value2, "activeContent");
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