package cn.heima.dao;

import cn.heima.pojo.CmfAsset;
import cn.heima.pojo.CmfAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfAssetMapper {
    int countByExample(CmfAssetExample example);

    int deleteByExample(CmfAssetExample example);

    int deleteByPrimaryKey(Long aid);

    int insert(CmfAsset record);

    int insertSelective(CmfAsset record);

    List<CmfAsset> selectByExampleWithBLOBs(CmfAssetExample example);

    List<CmfAsset> selectByExample(CmfAssetExample example);

    CmfAsset selectByPrimaryKey(Long aid);

    int updateByExampleSelective(@Param("record") CmfAsset record, @Param("example") CmfAssetExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfAsset record, @Param("example") CmfAssetExample example);

    int updateByExample(@Param("record") CmfAsset record, @Param("example") CmfAssetExample example);

    int updateByPrimaryKeySelective(CmfAsset record);

    int updateByPrimaryKeyWithBLOBs(CmfAsset record);

    int updateByPrimaryKey(CmfAsset record);
}