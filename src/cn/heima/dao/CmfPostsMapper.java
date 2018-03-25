package cn.heima.dao;

import cn.heima.pojo.CmfPosts;
import cn.heima.pojo.CmfPostsExample;
import cn.heima.pojo.CmfPostsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfPostsMapper {
    int countByExample(CmfPostsExample example);

    int deleteByExample(CmfPostsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmfPostsWithBLOBs record);

    int insertSelective(CmfPostsWithBLOBs record);

    List<CmfPostsWithBLOBs> selectByExampleWithBLOBs(CmfPostsExample example);

    List<CmfPosts> selectByExample(CmfPostsExample example);

    CmfPostsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmfPostsWithBLOBs record, @Param("example") CmfPostsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfPostsWithBLOBs record, @Param("example") CmfPostsExample example);

    int updateByExample(@Param("record") CmfPosts record, @Param("example") CmfPostsExample example);

    int updateByPrimaryKeySelective(CmfPostsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmfPostsWithBLOBs record);

    int updateByPrimaryKey(CmfPosts record);
}