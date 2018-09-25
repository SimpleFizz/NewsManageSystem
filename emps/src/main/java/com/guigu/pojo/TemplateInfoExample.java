package com.guigu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TemplateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemplateInfoExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNull() {
            addCriterion("template_title is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNotNull() {
            addCriterion("template_title is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleEqualTo(String value) {
            addCriterion("template_title =", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotEqualTo(String value) {
            addCriterion("template_title <>", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThan(String value) {
            addCriterion("template_title >", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("template_title >=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThan(String value) {
            addCriterion("template_title <", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThanOrEqualTo(String value) {
            addCriterion("template_title <=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLike(String value) {
            addCriterion("template_title like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotLike(String value) {
            addCriterion("template_title not like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIn(List<String> values) {
            addCriterion("template_title in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotIn(List<String> values) {
            addCriterion("template_title not in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleBetween(String value1, String value2) {
            addCriterion("template_title between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotBetween(String value1, String value2) {
            addCriterion("template_title not between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNull() {
            addCriterion("template_content is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNotNull() {
            addCriterion("template_content is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentEqualTo(String value) {
            addCriterion("template_content =", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotEqualTo(String value) {
            addCriterion("template_content <>", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThan(String value) {
            addCriterion("template_content >", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThanOrEqualTo(String value) {
            addCriterion("template_content >=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThan(String value) {
            addCriterion("template_content <", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThanOrEqualTo(String value) {
            addCriterion("template_content <=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLike(String value) {
            addCriterion("template_content like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotLike(String value) {
            addCriterion("template_content not like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIn(List<String> values) {
            addCriterion("template_content in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotIn(List<String> values) {
            addCriterion("template_content not in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentBetween(String value1, String value2) {
            addCriterion("template_content between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotBetween(String value1, String value2) {
            addCriterion("template_content not between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNull() {
            addCriterion("template_type is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("template_type is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeEqualTo(String value) {
            addCriterion("template_type =", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotEqualTo(String value) {
            addCriterion("template_type <>", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThan(String value) {
            addCriterion("template_type >", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("template_type >=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThan(String value) {
            addCriterion("template_type <", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(String value) {
            addCriterion("template_type <=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLike(String value) {
            addCriterion("template_type like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotLike(String value) {
            addCriterion("template_type not like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIn(List<String> values) {
            addCriterion("template_type in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotIn(List<String> values) {
            addCriterion("template_type not in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeBetween(String value1, String value2) {
            addCriterion("template_type between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotBetween(String value1, String value2) {
            addCriterion("template_type not between", value1, value2, "templateType");
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