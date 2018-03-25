package cn.heima.dao;

import cn.heima.pojo.CmfOptions;
import cn.heima.pojo.CmfOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfOptionsMapper {
    int countByExample(CmfOptionsExample example);

    int deleteByExample(CmfOptionsExample example);

    int deleteByPrimaryKey(Long optionId);

    int insert(CmfOptions record);

    int insertSelective(CmfOptions record);

    List<CmfOptions> selectByExampleWithBLOBs(CmfOptionsExample example);

    List<CmfOptions> selectByExample(CmfOptionsExample example);

    CmfOptions selectByPrimaryKey(Long optionId);

    int updateByExampleSelective(@Param("record") CmfOptions record, @Param("example") CmfOptionsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfOptions record, @Param("example") CmfOptionsExample example);

    int updateByExample(@Param("record") CmfOptions record, @Param("example") CmfOptionsExample example);

    int updateByPrimaryKeySelective(CmfOptions record);

    int updateByPrimaryKeyWithBLOBs(CmfOptions record);

    int updateByPrimaryKey(CmfOptions record);
}