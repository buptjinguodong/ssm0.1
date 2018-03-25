package cn.heima.dao;

import cn.heima.pojo.CmfOauthUser;
import cn.heima.pojo.CmfOauthUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfOauthUserMapper {
    int countByExample(CmfOauthUserExample example);

    int deleteByExample(CmfOauthUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfOauthUser record);

    int insertSelective(CmfOauthUser record);

    List<CmfOauthUser> selectByExample(CmfOauthUserExample example);

    CmfOauthUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfOauthUser record, @Param("example") CmfOauthUserExample example);

    int updateByExample(@Param("record") CmfOauthUser record, @Param("example") CmfOauthUserExample example);

    int updateByPrimaryKeySelective(CmfOauthUser record);

    int updateByPrimaryKey(CmfOauthUser record);
}