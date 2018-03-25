package cn.heima.dao;

import cn.heima.pojo.CmfLinks;
import cn.heima.pojo.CmfLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfLinksMapper {
    int countByExample(CmfLinksExample example);

    int deleteByExample(CmfLinksExample example);

    int deleteByPrimaryKey(Long linkId);

    int insert(CmfLinks record);

    int insertSelective(CmfLinks record);

    List<CmfLinks> selectByExampleWithBLOBs(CmfLinksExample example);

    List<CmfLinks> selectByExample(CmfLinksExample example);

    CmfLinks selectByPrimaryKey(Long linkId);

    int updateByExampleSelective(@Param("record") CmfLinks record, @Param("example") CmfLinksExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfLinks record, @Param("example") CmfLinksExample example);

    int updateByExample(@Param("record") CmfLinks record, @Param("example") CmfLinksExample example);

    int updateByPrimaryKeySelective(CmfLinks record);

    int updateByPrimaryKeyWithBLOBs(CmfLinks record);

    int updateByPrimaryKey(CmfLinks record);
}