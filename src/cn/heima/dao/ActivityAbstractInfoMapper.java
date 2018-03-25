package cn.heima.dao;

import cn.heima.pojo.ActivityAbstractInfo;
import cn.heima.pojo.ActivityAbstractInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityAbstractInfoMapper {
    int countByExample(ActivityAbstractInfoExample example);

    int deleteByExample(ActivityAbstractInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityAbstractInfo record);

    int insertSelective(ActivityAbstractInfo record);

    List<ActivityAbstractInfo> selectByExample(ActivityAbstractInfoExample example);

    ActivityAbstractInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityAbstractInfo record, @Param("example") ActivityAbstractInfoExample example);

    int updateByExample(@Param("record") ActivityAbstractInfo record, @Param("example") ActivityAbstractInfoExample example);

    int updateByPrimaryKeySelective(ActivityAbstractInfo record);

    int updateByPrimaryKey(ActivityAbstractInfo record);
}