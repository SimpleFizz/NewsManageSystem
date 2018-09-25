package com.guigu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentPaymentExample() {
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andPaymentSituationIsNull() {
            addCriterion("payment_situation is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationIsNotNull() {
            addCriterion("payment_situation is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationEqualTo(String value) {
            addCriterion("payment_situation =", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationNotEqualTo(String value) {
            addCriterion("payment_situation <>", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationGreaterThan(String value) {
            addCriterion("payment_situation >", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationGreaterThanOrEqualTo(String value) {
            addCriterion("payment_situation >=", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationLessThan(String value) {
            addCriterion("payment_situation <", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationLessThanOrEqualTo(String value) {
            addCriterion("payment_situation <=", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationLike(String value) {
            addCriterion("payment_situation like", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationNotLike(String value) {
            addCriterion("payment_situation not like", value, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationIn(List<String> values) {
            addCriterion("payment_situation in", values, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationNotIn(List<String> values) {
            addCriterion("payment_situation not in", values, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationBetween(String value1, String value2) {
            addCriterion("payment_situation between", value1, value2, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentSituationNotBetween(String value1, String value2) {
            addCriterion("payment_situation not between", value1, value2, "paymentSituation");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(Integer value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(Integer value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(Integer value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(Integer value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(Integer value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<Integer> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<Integer> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(Integer value1, Integer value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(Double value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(Double value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(Double value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(Double value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(Double value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<Double> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<Double> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(Double value1, Double value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(Double value1, Double value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNull() {
            addCriterion("should_amount is null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNotNull() {
            addCriterion("should_amount is not null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountEqualTo(Double value) {
            addCriterion("should_amount =", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotEqualTo(Double value) {
            addCriterion("should_amount <>", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThan(Double value) {
            addCriterion("should_amount >", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("should_amount >=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThan(Double value) {
            addCriterion("should_amount <", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThanOrEqualTo(Double value) {
            addCriterion("should_amount <=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIn(List<Double> values) {
            addCriterion("should_amount in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotIn(List<Double> values) {
            addCriterion("should_amount not in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountBetween(Double value1, Double value2) {
            addCriterion("should_amount between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotBetween(Double value1, Double value2) {
            addCriterion("should_amount not between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(Double value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(Double value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(Double value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(Double value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(Double value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<Double> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<Double> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(Double value1, Double value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(Double value1, Double value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountIsNull() {
            addCriterion("debt_amount is null");
            return (Criteria) this;
        }

        public Criteria andDebtAmountIsNotNull() {
            addCriterion("debt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDebtAmountEqualTo(Double value) {
            addCriterion("debt_amount =", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountNotEqualTo(Double value) {
            addCriterion("debt_amount <>", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountGreaterThan(Double value) {
            addCriterion("debt_amount >", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("debt_amount >=", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountLessThan(Double value) {
            addCriterion("debt_amount <", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountLessThanOrEqualTo(Double value) {
            addCriterion("debt_amount <=", value, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountIn(List<Double> values) {
            addCriterion("debt_amount in", values, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountNotIn(List<Double> values) {
            addCriterion("debt_amount not in", values, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountBetween(Double value1, Double value2) {
            addCriterion("debt_amount between", value1, value2, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andDebtAmountNotBetween(Double value1, Double value2) {
            addCriterion("debt_amount not between", value1, value2, "debtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIsNull() {
            addCriterion("payment_remark is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIsNotNull() {
            addCriterion("payment_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkEqualTo(String value) {
            addCriterion("payment_remark =", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotEqualTo(String value) {
            addCriterion("payment_remark <>", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkGreaterThan(String value) {
            addCriterion("payment_remark >", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("payment_remark >=", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLessThan(String value) {
            addCriterion("payment_remark <", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLessThanOrEqualTo(String value) {
            addCriterion("payment_remark <=", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLike(String value) {
            addCriterion("payment_remark like", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotLike(String value) {
            addCriterion("payment_remark not like", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIn(List<String> values) {
            addCriterion("payment_remark in", values, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotIn(List<String> values) {
            addCriterion("payment_remark not in", values, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkBetween(String value1, String value2) {
            addCriterion("payment_remark between", value1, value2, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotBetween(String value1, String value2) {
            addCriterion("payment_remark not between", value1, value2, "paymentRemark");
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