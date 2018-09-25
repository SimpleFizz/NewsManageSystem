package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffSalaryExample() {
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

        public Criteria andStaffSalaryIdIsNull() {
            addCriterion("staff_salary_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdIsNotNull() {
            addCriterion("staff_salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdEqualTo(Integer value) {
            addCriterion("staff_salary_id =", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotEqualTo(Integer value) {
            addCriterion("staff_salary_id <>", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdGreaterThan(Integer value) {
            addCriterion("staff_salary_id >", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_salary_id >=", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdLessThan(Integer value) {
            addCriterion("staff_salary_id <", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_salary_id <=", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdIn(List<Integer> values) {
            addCriterion("staff_salary_id in", values, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotIn(List<Integer> values) {
            addCriterion("staff_salary_id not in", values, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_salary_id between", value1, value2, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_salary_id not between", value1, value2, "staffSalaryId");
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

        public Criteria andStaStaffIdIsNull() {
            addCriterion("sta_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdIsNotNull() {
            addCriterion("sta_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdEqualTo(Integer value) {
            addCriterion("sta_staff_id =", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotEqualTo(Integer value) {
            addCriterion("sta_staff_id <>", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdGreaterThan(Integer value) {
            addCriterion("sta_staff_id >", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sta_staff_id >=", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdLessThan(Integer value) {
            addCriterion("sta_staff_id <", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("sta_staff_id <=", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdIn(List<Integer> values) {
            addCriterion("sta_staff_id in", values, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotIn(List<Integer> values) {
            addCriterion("sta_staff_id not in", values, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("sta_staff_id between", value1, value2, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sta_staff_id not between", value1, value2, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIsNull() {
            addCriterion("total_salary is null");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIsNotNull() {
            addCriterion("total_salary is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryEqualTo(Double value) {
            addCriterion("total_salary =", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotEqualTo(Double value) {
            addCriterion("total_salary <>", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryGreaterThan(Double value) {
            addCriterion("total_salary >", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("total_salary >=", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryLessThan(Double value) {
            addCriterion("total_salary <", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryLessThanOrEqualTo(Double value) {
            addCriterion("total_salary <=", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIn(List<Double> values) {
            addCriterion("total_salary in", values, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotIn(List<Double> values) {
            addCriterion("total_salary not in", values, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryBetween(Double value1, Double value2) {
            addCriterion("total_salary between", value1, value2, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotBetween(Double value1, Double value2) {
            addCriterion("total_salary not between", value1, value2, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryIsNull() {
            addCriterion("deduct_salary is null");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryIsNotNull() {
            addCriterion("deduct_salary is not null");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryEqualTo(Double value) {
            addCriterion("deduct_salary =", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryNotEqualTo(Double value) {
            addCriterion("deduct_salary <>", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryGreaterThan(Double value) {
            addCriterion("deduct_salary >", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_salary >=", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryLessThan(Double value) {
            addCriterion("deduct_salary <", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryLessThanOrEqualTo(Double value) {
            addCriterion("deduct_salary <=", value, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryIn(List<Double> values) {
            addCriterion("deduct_salary in", values, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryNotIn(List<Double> values) {
            addCriterion("deduct_salary not in", values, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryBetween(Double value1, Double value2) {
            addCriterion("deduct_salary between", value1, value2, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andDeductSalaryNotBetween(Double value1, Double value2) {
            addCriterion("deduct_salary not between", value1, value2, "deductSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNull() {
            addCriterion("real_salary is null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNotNull() {
            addCriterion("real_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryEqualTo(Double value) {
            addCriterion("real_salary =", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotEqualTo(Double value) {
            addCriterion("real_salary <>", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThan(Double value) {
            addCriterion("real_salary >", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("real_salary >=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThan(Double value) {
            addCriterion("real_salary <", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThanOrEqualTo(Double value) {
            addCriterion("real_salary <=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIn(List<Double> values) {
            addCriterion("real_salary in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotIn(List<Double> values) {
            addCriterion("real_salary not in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryBetween(Double value1, Double value2) {
            addCriterion("real_salary between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotBetween(Double value1, Double value2) {
            addCriterion("real_salary not between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andIsUesdIsNull() {
            addCriterion("is_uesd is null");
            return (Criteria) this;
        }

        public Criteria andIsUesdIsNotNull() {
            addCriterion("is_uesd is not null");
            return (Criteria) this;
        }

        public Criteria andIsUesdEqualTo(String value) {
            addCriterion("is_uesd =", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdNotEqualTo(String value) {
            addCriterion("is_uesd <>", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdGreaterThan(String value) {
            addCriterion("is_uesd >", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdGreaterThanOrEqualTo(String value) {
            addCriterion("is_uesd >=", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdLessThan(String value) {
            addCriterion("is_uesd <", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdLessThanOrEqualTo(String value) {
            addCriterion("is_uesd <=", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdLike(String value) {
            addCriterion("is_uesd like", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdNotLike(String value) {
            addCriterion("is_uesd not like", value, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdIn(List<String> values) {
            addCriterion("is_uesd in", values, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdNotIn(List<String> values) {
            addCriterion("is_uesd not in", values, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdBetween(String value1, String value2) {
            addCriterion("is_uesd between", value1, value2, "isUesd");
            return (Criteria) this;
        }

        public Criteria andIsUesdNotBetween(String value1, String value2) {
            addCriterion("is_uesd not between", value1, value2, "isUesd");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIsNull() {
            addCriterion("staff_salary_time is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIsNotNull() {
            addCriterion("staff_salary_time is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeEqualTo(Date value) {
            addCriterion("staff_salary_time =", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotEqualTo(Date value) {
            addCriterion("staff_salary_time <>", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeGreaterThan(Date value) {
            addCriterion("staff_salary_time >", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_salary_time >=", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeLessThan(Date value) {
            addCriterion("staff_salary_time <", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeLessThanOrEqualTo(Date value) {
            addCriterion("staff_salary_time <=", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIn(List<Date> values) {
            addCriterion("staff_salary_time in", values, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotIn(List<Date> values) {
            addCriterion("staff_salary_time not in", values, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeBetween(Date value1, Date value2) {
            addCriterion("staff_salary_time between", value1, value2, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotBetween(Date value1, Date value2) {
            addCriterion("staff_salary_time not between", value1, value2, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNull() {
            addCriterion("staff_remark is null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIsNotNull() {
            addCriterion("staff_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkEqualTo(String value) {
            addCriterion("staff_remark =", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotEqualTo(String value) {
            addCriterion("staff_remark <>", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThan(String value) {
            addCriterion("staff_remark >", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("staff_remark >=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThan(String value) {
            addCriterion("staff_remark <", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLessThanOrEqualTo(String value) {
            addCriterion("staff_remark <=", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkLike(String value) {
            addCriterion("staff_remark like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotLike(String value) {
            addCriterion("staff_remark not like", value, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkIn(List<String> values) {
            addCriterion("staff_remark in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotIn(List<String> values) {
            addCriterion("staff_remark not in", values, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkBetween(String value1, String value2) {
            addCriterion("staff_remark between", value1, value2, "staffRemark");
            return (Criteria) this;
        }

        public Criteria andStaffRemarkNotBetween(String value1, String value2) {
            addCriterion("staff_remark not between", value1, value2, "staffRemark");
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