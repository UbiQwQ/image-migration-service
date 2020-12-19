package cn.wuyi.migration.mapper;

import cn.wuyi.migration.pojo.entity.ImageTemp;

public interface ImageTempMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ImageTemp record);

    int insertSelective(ImageTemp record);

    ImageTemp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImageTemp record);

    int updateByPrimaryKey(ImageTemp record);
}