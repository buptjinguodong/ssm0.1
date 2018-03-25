package cn.heima.dao;

import cn.heima.pojo.CmfComments;
import cn.heima.pojo.CmfCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfCommentsMapper {
    int countByExample(CmfCommentsExample example);

    int deleteByExample(CmfCommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmfComments record);

    int insertSelective(CmfComments record);

    List<CmfComments> selectByExampleWithBLOBs(CmfCommentsExample example);

    List<CmfComments> selectByExample(CmfCommentsExample example);

    CmfComments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmfComments record, @Param("example") CmfCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfComments record, @Param("example") CmfCommentsExample example);

    int updateByExample(@Param("record") CmfComments record, @Param("example") CmfCommentsExample example);

    int updateByPrimaryKeySelective(CmfComments record);

    int updateByPrimaryKeyWithBLOBs(CmfComments record);

    int updateByPrimaryKey(CmfComments record);
}