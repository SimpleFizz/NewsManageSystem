package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class SyllabusInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyllabusInfoExample() {
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

        public Criteria andSyllabusIdIsNull() {
            addCriterion("syllabus_id is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIsNotNull() {
            addCriterion("syllabus_id is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdEqualTo(Integer value) {
            addCriterion("syllabus_id =", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotEqualTo(Integer value) {
            addCriterion("syllabus_id <>", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThan(Integer value) {
            addCriterion("syllabus_id >", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id >=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThan(Integer value) {
            addCriterion("syllabus_id <", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdLessThanOrEqualTo(Integer value) {
            addCriterion("syllabus_id <=", value, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdIn(List<Integer> values) {
            addCriterion("syllabus_id in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotIn(List<Integer> values) {
            addCriterion("syllabus_id not in", values, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id between", value1, value2, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("syllabus_id not between", value1, value2, "syllabusId");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiIsNull() {
            addCriterion("syllabus_yi is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiIsNotNull() {
            addCriterion("syllabus_yi is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiEqualTo(String value) {
            addCriterion("syllabus_yi =", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiNotEqualTo(String value) {
            addCriterion("syllabus_yi <>", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiGreaterThan(String value) {
            addCriterion("syllabus_yi >", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_yi >=", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiLessThan(String value) {
            addCriterion("syllabus_yi <", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiLessThanOrEqualTo(String value) {
            addCriterion("syllabus_yi <=", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiLike(String value) {
            addCriterion("syllabus_yi like", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiNotLike(String value) {
            addCriterion("syllabus_yi not like", value, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiIn(List<String> values) {
            addCriterion("syllabus_yi in", values, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiNotIn(List<String> values) {
            addCriterion("syllabus_yi not in", values, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiBetween(String value1, String value2) {
            addCriterion("syllabus_yi between", value1, value2, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusYiNotBetween(String value1, String value2) {
            addCriterion("syllabus_yi not between", value1, value2, "syllabusYi");
            return (Criteria) this;
        }

        public Criteria andSyllabusErIsNull() {
            addCriterion("syllabus_er is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusErIsNotNull() {
            addCriterion("syllabus_er is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusErEqualTo(String value) {
            addCriterion("syllabus_er =", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErNotEqualTo(String value) {
            addCriterion("syllabus_er <>", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErGreaterThan(String value) {
            addCriterion("syllabus_er >", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_er >=", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErLessThan(String value) {
            addCriterion("syllabus_er <", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErLessThanOrEqualTo(String value) {
            addCriterion("syllabus_er <=", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErLike(String value) {
            addCriterion("syllabus_er like", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErNotLike(String value) {
            addCriterion("syllabus_er not like", value, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErIn(List<String> values) {
            addCriterion("syllabus_er in", values, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErNotIn(List<String> values) {
            addCriterion("syllabus_er not in", values, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErBetween(String value1, String value2) {
            addCriterion("syllabus_er between", value1, value2, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusErNotBetween(String value1, String value2) {
            addCriterion("syllabus_er not between", value1, value2, "syllabusEr");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanIsNull() {
            addCriterion("syllabus_san is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanIsNotNull() {
            addCriterion("syllabus_san is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanEqualTo(String value) {
            addCriterion("syllabus_san =", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanNotEqualTo(String value) {
            addCriterion("syllabus_san <>", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanGreaterThan(String value) {
            addCriterion("syllabus_san >", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_san >=", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanLessThan(String value) {
            addCriterion("syllabus_san <", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanLessThanOrEqualTo(String value) {
            addCriterion("syllabus_san <=", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanLike(String value) {
            addCriterion("syllabus_san like", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanNotLike(String value) {
            addCriterion("syllabus_san not like", value, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanIn(List<String> values) {
            addCriterion("syllabus_san in", values, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanNotIn(List<String> values) {
            addCriterion("syllabus_san not in", values, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanBetween(String value1, String value2) {
            addCriterion("syllabus_san between", value1, value2, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSanNotBetween(String value1, String value2) {
            addCriterion("syllabus_san not between", value1, value2, "syllabusSan");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiIsNull() {
            addCriterion("syllabus_si is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiIsNotNull() {
            addCriterion("syllabus_si is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiEqualTo(String value) {
            addCriterion("syllabus_si =", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiNotEqualTo(String value) {
            addCriterion("syllabus_si <>", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiGreaterThan(String value) {
            addCriterion("syllabus_si >", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_si >=", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiLessThan(String value) {
            addCriterion("syllabus_si <", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiLessThanOrEqualTo(String value) {
            addCriterion("syllabus_si <=", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiLike(String value) {
            addCriterion("syllabus_si like", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiNotLike(String value) {
            addCriterion("syllabus_si not like", value, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiIn(List<String> values) {
            addCriterion("syllabus_si in", values, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiNotIn(List<String> values) {
            addCriterion("syllabus_si not in", values, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiBetween(String value1, String value2) {
            addCriterion("syllabus_si between", value1, value2, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusSiNotBetween(String value1, String value2) {
            addCriterion("syllabus_si not between", value1, value2, "syllabusSi");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuIsNull() {
            addCriterion("syllabus_wu is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuIsNotNull() {
            addCriterion("syllabus_wu is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuEqualTo(String value) {
            addCriterion("syllabus_wu =", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuNotEqualTo(String value) {
            addCriterion("syllabus_wu <>", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuGreaterThan(String value) {
            addCriterion("syllabus_wu >", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_wu >=", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuLessThan(String value) {
            addCriterion("syllabus_wu <", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuLessThanOrEqualTo(String value) {
            addCriterion("syllabus_wu <=", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuLike(String value) {
            addCriterion("syllabus_wu like", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuNotLike(String value) {
            addCriterion("syllabus_wu not like", value, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuIn(List<String> values) {
            addCriterion("syllabus_wu in", values, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuNotIn(List<String> values) {
            addCriterion("syllabus_wu not in", values, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuBetween(String value1, String value2) {
            addCriterion("syllabus_wu between", value1, value2, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusWuNotBetween(String value1, String value2) {
            addCriterion("syllabus_wu not between", value1, value2, "syllabusWu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuIsNull() {
            addCriterion("syllabus_liu is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuIsNotNull() {
            addCriterion("syllabus_liu is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuEqualTo(String value) {
            addCriterion("syllabus_liu =", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuNotEqualTo(String value) {
            addCriterion("syllabus_liu <>", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuGreaterThan(String value) {
            addCriterion("syllabus_liu >", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_liu >=", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuLessThan(String value) {
            addCriterion("syllabus_liu <", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuLessThanOrEqualTo(String value) {
            addCriterion("syllabus_liu <=", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuLike(String value) {
            addCriterion("syllabus_liu like", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuNotLike(String value) {
            addCriterion("syllabus_liu not like", value, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuIn(List<String> values) {
            addCriterion("syllabus_liu in", values, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuNotIn(List<String> values) {
            addCriterion("syllabus_liu not in", values, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuBetween(String value1, String value2) {
            addCriterion("syllabus_liu between", value1, value2, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusLiuNotBetween(String value1, String value2) {
            addCriterion("syllabus_liu not between", value1, value2, "syllabusLiu");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiIsNull() {
            addCriterion("syllabus_qi is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiIsNotNull() {
            addCriterion("syllabus_qi is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiEqualTo(String value) {
            addCriterion("syllabus_qi =", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiNotEqualTo(String value) {
            addCriterion("syllabus_qi <>", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiGreaterThan(String value) {
            addCriterion("syllabus_qi >", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_qi >=", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiLessThan(String value) {
            addCriterion("syllabus_qi <", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiLessThanOrEqualTo(String value) {
            addCriterion("syllabus_qi <=", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiLike(String value) {
            addCriterion("syllabus_qi like", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiNotLike(String value) {
            addCriterion("syllabus_qi not like", value, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiIn(List<String> values) {
            addCriterion("syllabus_qi in", values, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiNotIn(List<String> values) {
            addCriterion("syllabus_qi not in", values, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiBetween(String value1, String value2) {
            addCriterion("syllabus_qi between", value1, value2, "syllabusQi");
            return (Criteria) this;
        }

        public Criteria andSyllabusQiNotBetween(String value1, String value2) {
            addCriterion("syllabus_qi not between", value1, value2, "syllabusQi");
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

        public Criteria andSyllabusNameIsNull() {
            addCriterion("syllabus_name is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameIsNotNull() {
            addCriterion("syllabus_name is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameEqualTo(String value) {
            addCriterion("syllabus_name =", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameNotEqualTo(String value) {
            addCriterion("syllabus_name <>", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameGreaterThan(String value) {
            addCriterion("syllabus_name >", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameGreaterThanOrEqualTo(String value) {
            addCriterion("syllabus_name >=", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameLessThan(String value) {
            addCriterion("syllabus_name <", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameLessThanOrEqualTo(String value) {
            addCriterion("syllabus_name <=", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameLike(String value) {
            addCriterion("syllabus_name like", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameNotLike(String value) {
            addCriterion("syllabus_name not like", value, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameIn(List<String> values) {
            addCriterion("syllabus_name in", values, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameNotIn(List<String> values) {
            addCriterion("syllabus_name not in", values, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameBetween(String value1, String value2) {
            addCriterion("syllabus_name between", value1, value2, "syllabusName");
            return (Criteria) this;
        }

        public Criteria andSyllabusNameNotBetween(String value1, String value2) {
            addCriterion("syllabus_name not between", value1, value2, "syllabusName");
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