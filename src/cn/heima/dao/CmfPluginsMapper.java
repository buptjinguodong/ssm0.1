package cn.heima.dao;

import cn.heima.pojo.CmfPlugins;
import cn.heima.pojo.CmfPluginsExample;
import cn.heima.pojo.CmfPluginsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfPluginsMapper {
    int countByExample(CmfPluginsExample example);

    int deleteByExample(CmfPluginsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfPluginsWithBLOBs record);

    int insertSelective(CmfPluginsWithBLOBs record);

    List<CmfPluginsWithBLOBs> selectByExampleWithBLOBs(CmfPluginsExample example);

    List<CmfPlugins> selectByExample(CmfPluginsExample example);

    CmfPluginsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfPluginsWithBLOBs record, @Param("example") CmfPluginsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfPluginsWithBLOBs record, @Param("example") CmfPluginsExample example);

    int updateByExample(@Param("record") CmfPlugins record, @Param("example") CmfPluginsExample example);

    int updateByPrimaryKeySelective(CmfPluginsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmfPluginsWithBLOBs record);

    int updateByPrimaryKey(CmfPlugins record);
}