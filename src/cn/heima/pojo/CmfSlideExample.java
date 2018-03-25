package cn.heima.pojo;

import java.util.ArrayList;
import java.util.List;

public class CmfSlideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmfSlideExample() {
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

        public Criteria andSlideIdIsNull() {
            addCriterion("slide_id is null");
            return (Criteria) this;
        }

        public Criteria andSlideIdIsNotNull() {
            addCriterion("slide_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlideIdEqualTo(Long value) {
            addCriterion("slide_id =", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotEqualTo(Long value) {
            addCriterion("slide_id <>", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThan(Long value) {
            addCriterion("slide_id >", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThanOrEqualTo(Long value) {
            addCriterion("slide_id >=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThan(Long value) {
            addCriterion("slide_id <", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThanOrEqualTo(Long value) {
            addCriterion("slide_id <=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdIn(List<Long> values) {
            addCriterion("slide_id in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotIn(List<Long> values) {
            addCriterion("slide_id not in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdBetween(Long value1, Long value2) {
            addCriterion("slide_id between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotBetween(Long value1, Long value2) {
            addCriterion("slide_id not between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideCidIsNull() {
            addCriterion("slide_cid is null");
            return (Criteria) this;
        }

        public Criteria andSlideCidIsNotNull() {
            addCriterion("slide_cid is not null");
            return (Criteria) this;
        }

        public Criteria andSlideCidEqualTo(Integer value) {
            addCriterion("slide_cid =", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidNotEqualTo(Integer value) {
            addCriterion("slide_cid <>", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidGreaterThan(Integer value) {
            addCriterion("slide_cid >", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("slide_cid >=", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidLessThan(Integer value) {
            addCriterion("slide_cid <", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidLessThanOrEqualTo(Integer value) {
            addCriterion("slide_cid <=", value, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidIn(List<Integer> values) {
            addCriterion("slide_cid in", values, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidNotIn(List<Integer> values) {
            addCriterion("slide_cid not in", values, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidBetween(Integer value1, Integer value2) {
            addCriterion("slide_cid between", value1, value2, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideCidNotBetween(Integer value1, Integer value2) {
            addCriterion("slide_cid not between", value1, value2, "slideCid");
            return (Criteria) this;
        }

        public Criteria andSlideNameIsNull() {
            addCriterion("slide_name is null");
            return (Criteria) this;
        }

        public Criteria andSlideNameIsNotNull() {
            addCriterion("slide_name is not null");
            return (Criteria) this;
        }

        public Criteria andSlideNameEqualTo(String value) {
            addCriterion("slide_name =", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameNotEqualTo(String value) {
            addCriterion("slide_name <>", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameGreaterThan(String value) {
            addCriterion("slide_name >", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameGreaterThanOrEqualTo(String value) {
            addCriterion("slide_name >=", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameLessThan(String value) {
            addCriterion("slide_name <", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameLessThanOrEqualTo(String value) {
            addCriterion("slide_name <=", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameLike(String value) {
            addCriterion("slide_name like", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameNotLike(String value) {
            addCriterion("slide_name not like", value, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameIn(List<String> values) {
            addCriterion("slide_name in", values, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameNotIn(List<String> values) {
            addCriterion("slide_name not in", values, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameBetween(String value1, String value2) {
            addCriterion("slide_name between", value1, value2, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlideNameNotBetween(String value1, String value2) {
            addCriterion("slide_name not between", value1, value2, "slideName");
            return (Criteria) this;
        }

        public Criteria andSlidePicIsNull() {
            addCriterion("slide_pic is null");
            return (Criteria) this;
        }

        public Criteria andSlidePicIsNotNull() {
            addCriterion("slide_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSlidePicEqualTo(String value) {
            addCriterion("slide_pic =", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicNotEqualTo(String value) {
            addCriterion("slide_pic <>", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicGreaterThan(String value) {
            addCriterion("slide_pic >", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicGreaterThanOrEqualTo(String value) {
            addCriterion("slide_pic >=", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicLessThan(String value) {
            addCriterion("slide_pic <", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicLessThanOrEqualTo(String value) {
            addCriterion("slide_pic <=", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicLike(String value) {
            addCriterion("slide_pic like", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicNotLike(String value) {
            addCriterion("slide_pic not like", value, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicIn(List<String> values) {
            addCriterion("slide_pic in", values, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicNotIn(List<String> values) {
            addCriterion("slide_pic not in", values, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicBetween(String value1, String value2) {
            addCriterion("slide_pic between", value1, value2, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlidePicNotBetween(String value1, String value2) {
            addCriterion("slide_pic not between", value1, value2, "slidePic");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIsNull() {
            addCriterion("slide_url is null");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIsNotNull() {
            addCriterion("slide_url is not null");
            return (Criteria) this;
        }

        public Criteria andSlideUrlEqualTo(String value) {
            addCriterion("slide_url =", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotEqualTo(String value) {
            addCriterion("slide_url <>", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlGreaterThan(String value) {
            addCriterion("slide_url >", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlGreaterThanOrEqualTo(String value) {
            addCriterion("slide_url >=", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLessThan(String value) {
            addCriterion("slide_url <", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLessThanOrEqualTo(String value) {
            addCriterion("slide_url <=", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLike(String value) {
            addCriterion("slide_url like", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotLike(String value) {
            addCriterion("slide_url not like", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIn(List<String> values) {
            addCriterion("slide_url in", values, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotIn(List<String> values) {
            addCriterion("slide_url not in", values, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlBetween(String value1, String value2) {
            addCriterion("slide_url between", value1, value2, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotBetween(String value1, String value2) {
            addCriterion("slide_url not between", value1, value2, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideDesIsNull() {
            addCriterion("slide_des is null");
            return (Criteria) this;
        }

        public Criteria andSlideDesIsNotNull() {
            addCriterion("slide_des is not null");
            return (Criteria) this;
        }

        public Criteria andSlideDesEqualTo(String value) {
            addCriterion("slide_des =", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesNotEqualTo(String value) {
            addCriterion("slide_des <>", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesGreaterThan(String value) {
            addCriterion("slide_des >", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesGreaterThanOrEqualTo(String value) {
            addCriterion("slide_des >=", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesLessThan(String value) {
            addCriterion("slide_des <", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesLessThanOrEqualTo(String value) {
            addCriterion("slide_des <=", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesLike(String value) {
            addCriterion("slide_des like", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesNotLike(String value) {
            addCriterion("slide_des not like", value, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesIn(List<String> values) {
            addCriterion("slide_des in", values, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesNotIn(List<String> values) {
            addCriterion("slide_des not in", values, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesBetween(String value1, String value2) {
            addCriterion("slide_des between", value1, value2, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideDesNotBetween(String value1, String value2) {
            addCriterion("slide_des not between", value1, value2, "slideDes");
            return (Criteria) this;
        }

        public Criteria andSlideStatusIsNull() {
            addCriterion("slide_status is null");
            return (Criteria) this;
        }

        public Criteria andSlideStatusIsNotNull() {
            addCriterion("slide_status is not null");
            return (Criteria) this;
        }

        public Criteria andSlideStatusEqualTo(Integer value) {
            addCriterion("slide_status =", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusNotEqualTo(Integer value) {
            addCriterion("slide_status <>", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusGreaterThan(Integer value) {
            addCriterion("slide_status >", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("slide_status >=", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusLessThan(Integer value) {
            addCriterion("slide_status <", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusLessThanOrEqualTo(Integer value) {
            addCriterion("slide_status <=", value, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusIn(List<Integer> values) {
            addCriterion("slide_status in", values, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusNotIn(List<Integer> values) {
            addCriterion("slide_status not in", values, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusBetween(Integer value1, Integer value2) {
            addCriterion("slide_status between", value1, value2, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andSlideStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("slide_status not between", value1, value2, "slideStatus");
            return (Criteria) this;
        }

        public Criteria andListorderIsNull() {
            addCriterion("listorder is null");
            return (Criteria) this;
        }

        public Criteria andListorderIsNotNull() {
            addCriterion("listorder is not null");
            return (Criteria) this;
        }

        public Criteria andListorderEqualTo(Integer value) {
            addCriterion("listorder =", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotEqualTo(Integer value) {
            addCriterion("listorder <>", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThan(Integer value) {
            addCriterion("listorder >", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("listorder >=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThan(Integer value) {
            addCriterion("listorder <", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderLessThanOrEqualTo(Integer value) {
            addCriterion("listorder <=", value, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderIn(List<Integer> values) {
            addCriterion("listorder in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotIn(List<Integer> values) {
            addCriterion("listorder not in", values, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderBetween(Integer value1, Integer value2) {
            addCriterion("listorder between", value1, value2, "listorder");
            return (Criteria) this;
        }

        public Criteria andListorderNotBetween(Integer value1, Integer value2) {
            addCriterion("listorder not between", value1, value2, "listorder");
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