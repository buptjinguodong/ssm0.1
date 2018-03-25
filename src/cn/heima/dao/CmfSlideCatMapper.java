package cn.heima.dao;

import cn.heima.pojo.CmfSlideCat;
import cn.heima.pojo.CmfSlideCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfSlideCatMapper {
    int countByExample(CmfSlideCatExample example);

    int deleteByExample(CmfSlideCatExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(CmfSlideCat record);

    int insertSelective(CmfSlideCat record);

    List<CmfSlideCat> selectByExampleWithBLOBs(CmfSlideCatExample example);

    List<CmfSlideCat> selectByExample(CmfSlideCatExample example);

    CmfSlideCat selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") CmfSlideCat record, @Param("example") CmfSlideCatExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfSlideCat record, @Param("example") CmfSlideCatExample example);

    int updateByExample(@Param("record") CmfSlideCat record, @Param("example") CmfSlideCatExample example);

    int updateByPrimaryKeySelective(CmfSlideCat record);

    int updateByPrimaryKeyWithBLOBs(CmfSlideCat record);

    int updateByPrimaryKey(CmfSlideCat record);
}