package cn.heima.pojo;

import java.util.ArrayList;
import java.util.List;

public class CmfLinksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmfLinksExample() {
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

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(Long value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(Long value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(Long value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(Long value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(Long value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<Long> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<Long> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(Long value1, Long value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(Long value1, Long value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkImageIsNull() {
            addCriterion("link_image is null");
            return (Criteria) this;
        }

        public Criteria andLinkImageIsNotNull() {
            addCriterion("link_image is not null");
            return (Criteria) this;
        }

        public Criteria andLinkImageEqualTo(String value) {
            addCriterion("link_image =", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotEqualTo(String value) {
            addCriterion("link_image <>", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageGreaterThan(String value) {
            addCriterion("link_image >", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageGreaterThanOrEqualTo(String value) {
            addCriterion("link_image >=", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLessThan(String value) {
            addCriterion("link_image <", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLessThanOrEqualTo(String value) {
            addCriterion("link_image <=", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLike(String value) {
            addCriterion("link_image like", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotLike(String value) {
            addCriterion("link_image not like", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageIn(List<String> values) {
            addCriterion("link_image in", values, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotIn(List<String> values) {
            addCriterion("link_image not in", values, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageBetween(String value1, String value2) {
            addCriterion("link_image between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotBetween(String value1, String value2) {
            addCriterion("link_image not between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkTargetIsNull() {
            addCriterion("link_target is null");
            return (Criteria) this;
        }

        public Criteria andLinkTargetIsNotNull() {
            addCriterion("link_target is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTargetEqualTo(String value) {
            addCriterion("link_target =", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetNotEqualTo(String value) {
            addCriterion("link_target <>", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetGreaterThan(String value) {
            addCriterion("link_target >", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetGreaterThanOrEqualTo(String value) {
            addCriterion("link_target >=", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetLessThan(String value) {
            addCriterion("link_target <", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetLessThanOrEqualTo(String value) {
            addCriterion("link_target <=", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetLike(String value) {
            addCriterion("link_target like", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetNotLike(String value) {
            addCriterion("link_target not like", value, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetIn(List<String> values) {
            addCriterion("link_target in", values, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetNotIn(List<String> values) {
            addCriterion("link_target not in", values, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetBetween(String value1, String value2) {
            addCriterion("link_target between", value1, value2, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkTargetNotBetween(String value1, String value2) {
            addCriterion("link_target not between", value1, value2, "linkTarget");
            return (Criteria) this;
        }

        public Criteria andLinkStatusIsNull() {
            addCriterion("link_status is null");
            return (Criteria) this;
        }

        public Criteria andLinkStatusIsNotNull() {
            addCriterion("link_status is not null");
            return (Criteria) this;
        }

        public Criteria andLinkStatusEqualTo(Integer value) {
            addCriterion("link_status =", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusNotEqualTo(Integer value) {
            addCriterion("link_status <>", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusGreaterThan(Integer value) {
            addCriterion("link_status >", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_status >=", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusLessThan(Integer value) {
            addCriterion("link_status <", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusLessThanOrEqualTo(Integer value) {
            addCriterion("link_status <=", value, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusIn(List<Integer> values) {
            addCriterion("link_status in", values, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusNotIn(List<Integer> values) {
            addCriterion("link_status not in", values, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusBetween(Integer value1, Integer value2) {
            addCriterion("link_status between", value1, value2, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("link_status not between", value1, value2, "linkStatus");
            return (Criteria) this;
        }

        public Criteria andLinkRatingIsNull() {
            addCriterion("link_rating is null");
            return (Criteria) this;
        }

        public Criteria andLinkRatingIsNotNull() {
            addCriterion("link_rating is not null");
            return (Criteria) this;
        }

        public Criteria andLinkRatingEqualTo(Integer value) {
            addCriterion("link_rating =", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingNotEqualTo(Integer value) {
            addCriterion("link_rating <>", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingGreaterThan(Integer value) {
            addCriterion("link_rating >", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_rating >=", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingLessThan(Integer value) {
            addCriterion("link_rating <", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingLessThanOrEqualTo(Integer value) {
            addCriterion("link_rating <=", value, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingIn(List<Integer> values) {
            addCriterion("link_rating in", values, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingNotIn(List<Integer> values) {
            addCriterion("link_rating not in", values, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingBetween(Integer value1, Integer value2) {
            addCriterion("link_rating between", value1, value2, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("link_rating not between", value1, value2, "linkRating");
            return (Criteria) this;
        }

        public Criteria andLinkRelIsNull() {
            addCriterion("link_rel is null");
            return (Criteria) this;
        }

        public Criteria andLinkRelIsNotNull() {
            addCriterion("link_rel is not null");
            return (Criteria) this;
        }

        public Criteria andLinkRelEqualTo(String value) {
            addCriterion("link_rel =", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelNotEqualTo(String value) {
            addCriterion("link_rel <>", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelGreaterThan(String value) {
            addCriterion("link_rel >", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelGreaterThanOrEqualTo(String value) {
            addCriterion("link_rel >=", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelLessThan(String value) {
            addCriterion("link_rel <", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelLessThanOrEqualTo(String value) {
            addCriterion("link_rel <=", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelLike(String value) {
            addCriterion("link_rel like", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelNotLike(String value) {
            addCriterion("link_rel not like", value, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelIn(List<String> values) {
            addCriterion("link_rel in", values, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelNotIn(List<String> values) {
            addCriterion("link_rel not in", values, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelBetween(String value1, String value2) {
            addCriterion("link_rel between", value1, value2, "linkRel");
            return (Criteria) this;
        }

        public Criteria andLinkRelNotBetween(String value1, String value2) {
            addCriterion("link_rel not between", value1, value2, "linkRel");
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