package cn.heima.dao;

import cn.heima.pojo.CmfNav;
import cn.heima.pojo.CmfNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfNavMapper {
    int countByExample(CmfNavExample example);

    int deleteByExample(CmfNavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfNav record);

    int insertSelective(CmfNav record);

    List<CmfNav> selectByExample(CmfNavExample example);

    CmfNav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfNav record, @Param("example") CmfNavExample example);

    int updateByExample(@Param("record") CmfNav record, @Param("example") CmfNavExample example);

    int updateByPrimaryKeySelective(CmfNav record);

    int updateByPrimaryKey(CmfNav record);

    List<CmfNav> list(Integer typeId);
}