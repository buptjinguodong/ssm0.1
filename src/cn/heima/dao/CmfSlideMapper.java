package cn.heima.dao;

import cn.heima.pojo.CmfSlide;
import cn.heima.pojo.CmfSlideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfSlideMapper {
    int countByExample(CmfSlideExample example);

    int deleteByExample(CmfSlideExample example);

    int deleteByPrimaryKey(Long slideId);

    int insert(CmfSlide record);

    int insertSelective(CmfSlide record);

    List<CmfSlide> selectByExampleWithBLOBs(CmfSlideExample example);

    List<CmfSlide> selectByExample(CmfSlideExample example);

    CmfSlide selectByPrimaryKey(Long slideId);

    int updateByExampleSelective(@Param("record") CmfSlide record, @Param("example") CmfSlideExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfSlide record, @Param("example") CmfSlideExample example);

    int updateByExample(@Param("record") CmfSlide record, @Param("example") CmfSlideExample example);

    int updateByPrimaryKeySelective(CmfSlide record);

    int updateByPrimaryKeyWithBLOBs(CmfSlide record);

    int updateByPrimaryKey(CmfSlide record);
}