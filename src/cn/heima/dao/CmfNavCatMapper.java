package cn.heima.dao;

import cn.heima.pojo.CmfNavCat;
import cn.heima.pojo.CmfNavCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfNavCatMapper {
    int countByExample(CmfNavCatExample example);

    int deleteByExample(CmfNavCatExample example);

    int deleteByPrimaryKey(Integer navcid);

    int insert(CmfNavCat record);

    int insertSelective(CmfNavCat record);

    List<CmfNavCat> selectByExampleWithBLOBs(CmfNavCatExample example);

    List<CmfNavCat> selectByExample(CmfNavCatExample example);

    CmfNavCat selectByPrimaryKey(Integer navcid);

    int updateByExampleSelective(@Param("record") CmfNavCat record, @Param("example") CmfNavCatExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfNavCat record, @Param("example") CmfNavCatExample example);

    int updateByExample(@Param("record") CmfNavCat record, @Param("example") CmfNavCatExample example);

    int updateByPrimaryKeySelective(CmfNavCat record);

    int updateByPrimaryKeyWithBLOBs(CmfNavCat record);

    int updateByPrimaryKey(CmfNavCat record);
}