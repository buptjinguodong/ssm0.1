package cn.heima.dao;

import cn.heima.pojo.CmfCommonActionLog;
import cn.heima.pojo.CmfCommonActionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfCommonActionLogMapper {
    int countByExample(CmfCommonActionLogExample example);

    int deleteByExample(CmfCommonActionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfCommonActionLog record);

    int insertSelective(CmfCommonActionLog record);

    List<CmfCommonActionLog> selectByExample(CmfCommonActionLogExample example);

    CmfCommonActionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfCommonActionLog record, @Param("example") CmfCommonActionLogExample example);

    int updateByExample(@Param("record") CmfCommonActionLog record, @Param("example") CmfCommonActionLogExample example);

    int updateByPrimaryKeySelective(CmfCommonActionLog record);

    int updateByPrimaryKey(CmfCommonActionLog record);
}