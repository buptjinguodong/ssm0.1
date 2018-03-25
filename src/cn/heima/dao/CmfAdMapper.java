package cn.heima.dao;

import cn.heima.pojo.CmfAd;
import cn.heima.pojo.CmfAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfAdMapper {
    int countByExample(CmfAdExample example);

    int deleteByExample(CmfAdExample example);

    int deleteByPrimaryKey(Long adId);

    int insert(CmfAd record);

    int insertSelective(CmfAd record);

    List<CmfAd> selectByExampleWithBLOBs(CmfAdExample example);

    List<CmfAd> selectByExample(CmfAdExample example);

    CmfAd selectByPrimaryKey(Long adId);

    int updateByExampleSelective(@Param("record") CmfAd record, @Param("example") CmfAdExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfAd record, @Param("example") CmfAdExample example);

    int updateByExample(@Param("record") CmfAd record, @Param("example") CmfAdExample example);

    int updateByPrimaryKeySelective(CmfAd record);

    int updateByPrimaryKeyWithBLOBs(CmfAd record);

    int updateByPrimaryKey(CmfAd record);
}