package cn.heima.dao;

import cn.heima.pojo.CmfAuthRule;
import cn.heima.pojo.CmfAuthRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfAuthRuleMapper {
    int countByExample(CmfAuthRuleExample example);

    int deleteByExample(CmfAuthRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfAuthRule record);

    int insertSelective(CmfAuthRule record);

    List<CmfAuthRule> selectByExample(CmfAuthRuleExample example);

    CmfAuthRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfAuthRule record, @Param("example") CmfAuthRuleExample example);

    int updateByExample(@Param("record") CmfAuthRule record, @Param("example") CmfAuthRuleExample example);

    int updateByPrimaryKeySelective(CmfAuthRule record);

    int updateByPrimaryKey(CmfAuthRule record);
}