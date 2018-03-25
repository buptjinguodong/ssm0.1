package cn.heima.dao;

import cn.heima.pojo.CmfTermRelationships;
import cn.heima.pojo.CmfTermRelationshipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfTermRelationshipsMapper {
    int countByExample(CmfTermRelationshipsExample example);

    int deleteByExample(CmfTermRelationshipsExample example);

    int deleteByPrimaryKey(Long tid);

    int insert(CmfTermRelationships record);

    int insertSelective(CmfTermRelationships record);

    List<CmfTermRelationships> selectByExample(CmfTermRelationshipsExample example);

    CmfTermRelationships selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") CmfTermRelationships record, @Param("example") CmfTermRelationshipsExample example);

    int updateByExample(@Param("record") CmfTermRelationships record, @Param("example") CmfTermRelationshipsExample example);

    int updateByPrimaryKeySelective(CmfTermRelationships record);

    int updateByPrimaryKey(CmfTermRelationships record);
}