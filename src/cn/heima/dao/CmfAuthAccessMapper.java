package cn.heima.dao;

import cn.heima.pojo.CmfAuthAccess;
import cn.heima.pojo.CmfAuthAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfAuthAccessMapper {
    int countByExample(CmfAuthAccessExample example);

    int deleteByExample(CmfAuthAccessExample example);

    int insert(CmfAuthAccess record);

    int insertSelective(CmfAuthAccess record);

    List<CmfAuthAccess> selectByExample(CmfAuthAccessExample example);

    int updateByExampleSelective(@Param("record") CmfAuthAccess record, @Param("example") CmfAuthAccessExample example);

    int updateByExample(@Param("record") CmfAuthAccess record, @Param("example") CmfAuthAccessExample example);
}