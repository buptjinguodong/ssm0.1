package cn.heima.dao;

import cn.heima.pojo.CmfUserFavorites;
import cn.heima.pojo.CmfUserFavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmfUserFavoritesMapper {
    int countByExample(CmfUserFavoritesExample example);

    int deleteByExample(CmfUserFavoritesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmfUserFavorites record);

    int insertSelective(CmfUserFavorites record);

    List<CmfUserFavorites> selectByExample(CmfUserFavoritesExample example);

    CmfUserFavorites selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmfUserFavorites record, @Param("example") CmfUserFavoritesExample example);

    int updateByExample(@Param("record") CmfUserFavorites record, @Param("example") CmfUserFavoritesExample example);

    int updateByPrimaryKeySelective(CmfUserFavorites record);

    int updateByPrimaryKey(CmfUserFavorites record);
}