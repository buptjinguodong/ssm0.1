package cn.heima.dao;

import cn.heima.pojo.CmfUsers;
import cn.heima.pojo.CmfUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfUsersMapper {
    int countByExample(CmfUsersExample example);

    int deleteByExample(CmfUsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmfUsers record);

    int insertSelective(CmfUsers record);

    List<CmfUsers> selectByExample(CmfUsersExample example);

    CmfUsers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmfUsers record, @Param("example") CmfUsersExample example);

    int updateByExample(@Param("record") CmfUsers record, @Param("example") CmfUsersExample example);

    int updateByPrimaryKeySelective(CmfUsers record);

    int updateByPrimaryKey(CmfUsers record);
}