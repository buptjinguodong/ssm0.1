package cn.heima.dao;

import cn.heima.pojo.CmfRole;
import cn.heima.pojo.CmfRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfRoleMapper {
    int countByExample(CmfRoleExample example);

    int deleteByExample(CmfRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfRole record);

    int insertSelective(CmfRole record);

    List<CmfRole> selectByExample(CmfRoleExample example);

    CmfRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfRole record, @Param("example") CmfRoleExample example);

    int updateByExample(@Param("record") CmfRole record, @Param("example") CmfRoleExample example);

    int updateByPrimaryKeySelective(CmfRole record);

    int updateByPrimaryKey(CmfRole record);
}