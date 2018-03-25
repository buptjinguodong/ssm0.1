package cn.heima.dao;

import cn.heima.pojo.CmfGuestbook;
import cn.heima.pojo.CmfGuestbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfGuestbookMapper {
    int countByExample(CmfGuestbookExample example);

    int deleteByExample(CmfGuestbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfGuestbook record);

    int insertSelective(CmfGuestbook record);

    List<CmfGuestbook> selectByExampleWithBLOBs(CmfGuestbookExample example);

    List<CmfGuestbook> selectByExample(CmfGuestbookExample example);

    CmfGuestbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfGuestbook record, @Param("example") CmfGuestbookExample example);

    int updateByExampleWithBLOBs(@Param("record") CmfGuestbook record, @Param("example") CmfGuestbookExample example);

    int updateByExample(@Param("record") CmfGuestbook record, @Param("example") CmfGuestbookExample example);

    int updateByPrimaryKeySelective(CmfGuestbook record);

    int updateByPrimaryKeyWithBLOBs(CmfGuestbook record);

    int updateByPrimaryKey(CmfGuestbook record);
}