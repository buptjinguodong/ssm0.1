package cn.heima.dao;

import cn.heima.pojo.CmfRoute;
import cn.heima.pojo.CmfRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfRouteMapper {
    int countByExample(CmfRouteExample example);

    int deleteByExample(CmfRouteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfRoute record);

    int insertSelective(CmfRoute record);

    List<CmfRoute> selectByExample(CmfRouteExample example);

    CmfRoute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfRoute record, @Param("example") CmfRouteExample example);

    int updateByExample(@Param("record") CmfRoute record, @Param("example") CmfRouteExample example);

    int updateByPrimaryKeySelective(CmfRoute record);

    int updateByPrimaryKey(CmfRoute record);
}