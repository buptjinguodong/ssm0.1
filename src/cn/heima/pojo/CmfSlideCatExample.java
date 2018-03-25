package cn.heima.pojo;

import java.util.ArrayList;
import java.util.List;

public class CmfSlideCatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmfSlideCatExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatIdnameIsNull() {
            addCriterion("cat_idname is null");
            return (Criteria) this;
        }

        public Criteria andCatIdnameIsNotNull() {
            addCriterion("cat_idname is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdnameEqualTo(String value) {
            addCriterion("cat_idname =", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameNotEqualTo(String value) {
            addCriterion("cat_idname <>", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameGreaterThan(String value) {
            addCriterion("cat_idname >", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_idname >=", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameLessThan(String value) {
            addCriterion("cat_idname <", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameLessThanOrEqualTo(String value) {
            addCriterion("cat_idname <=", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameLike(String value) {
            addCriterion("cat_idname like", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameNotLike(String value) {
            addCriterion("cat_idname not like", value, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameIn(List<String> values) {
            addCriterion("cat_idname in", values, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameNotIn(List<String> values) {
            addCriterion("cat_idname not in", values, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameBetween(String value1, String value2) {
            addCriterion("cat_idname between", value1, value2, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatIdnameNotBetween(String value1, String value2) {
            addCriterion("cat_idname not between", value1, value2, "catIdname");
            return (Criteria) this;
        }

        public Criteria andCatStatusIsNull() {
            addCriterion("cat_status is null");
            return (Criteria) this;
        }

        public Criteria andCatStatusIsNotNull() {
            addCriterion("cat_status is not null");
            return (Criteria) this;
        }

        public Criteria andCatStatusEqualTo(Integer value) {
            addCriterion("cat_status =", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusNotEqualTo(Integer value) {
            addCriterion("cat_status <>", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusGreaterThan(Integer value) {
            addCriterion("cat_status >", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_status >=", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusLessThan(Integer value) {
            addCriterion("cat_status <", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cat_status <=", value, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusIn(List<Integer> values) {
            addCriterion("cat_status in", values, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusNotIn(List<Integer> values) {
            addCriterion("cat_status not in", values, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusBetween(Integer value1, Integer value2) {
            addCriterion("cat_status between", value1, value2, "catStatus");
            return (Criteria) this;
        }

        public Criteria andCatStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_status not between", value1, value2, "catStatus");
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