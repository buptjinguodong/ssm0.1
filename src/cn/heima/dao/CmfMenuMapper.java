package cn.heima.dao;

import cn.heima.pojo.CmfMenu;
import cn.heima.pojo.CmfMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfMenuMapper {
    int countByExample(CmfMenuExample example);

    int deleteByExample(CmfMenuExample example);

    int deleteByPrimaryKey(Short id);

    int insert(CmfMenu record);

    int insertSelective(CmfMenu record);

    List<CmfMenu> selectByExample(CmfMenuExample example);

    CmfMenu selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") CmfMenu record, @Param("example") CmfMenuExample example);

    int updateByExample(@Param("record") CmfMenu record, @Param("example") CmfMenuExample example);

    int updateByPrimaryKeySelective(CmfMenu record);

    int updateByPrimaryKey(CmfMenu record);
}