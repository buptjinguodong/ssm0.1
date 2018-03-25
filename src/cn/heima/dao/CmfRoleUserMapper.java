package cn.heima.dao;

import cn.heima.pojo.CmfRoleUser;
import cn.heima.pojo.CmfRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfRoleUserMapper {
    int countByExample(CmfRoleUserExample example);

    int deleteByExample(CmfRoleUserExample example);

    int insert(CmfRoleUser record);

    int insertSelective(CmfRoleUser record);

    List<CmfRoleUser> selectByExample(CmfRoleUserExample example);

    int updateByExampleSelective(@Param("record") CmfRoleUser record, @Param("example") CmfRoleUserExample example);

    int updateByExample(@Param("record") CmfRoleUser record, @Param("example") CmfRoleUserExample example);
}