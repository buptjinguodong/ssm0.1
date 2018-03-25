package cn.heima.dao;

import cn.heima.pojo.CmfTerms;
import cn.heima.pojo.CmfTermsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfTermsMapper {
    int countByExample(CmfTermsExample example);

    int deleteByExample(CmfTermsExample example);

    int deleteByPrimaryKey(Long termId);

    int insert(CmfTerms record);

    int insertSelective(CmfTerms record);

    List<CmfTerms> selectByExampleWithBLOBs(CmfTermsExample example);

    List<CmfTerms> selectByExample(CmfTermsExample example);

    CmfTerms selectByPrimaryKey(Long termId);

    int updateByExampleSelective(@Param("record") CmfTerms record, @Param("example") CmfTermsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfTerms record, @Param("example") CmfTermsExample example);

    int updateByExample(@Param("record") CmfTerms record, @Param("example") CmfTermsExample example);

    int updateByPrimaryKeySelective(CmfTerms record);

    int updateByPrimaryKeyWithBLOBs(CmfTerms record);

    int updateByPrimaryKey(CmfTerms record);
}