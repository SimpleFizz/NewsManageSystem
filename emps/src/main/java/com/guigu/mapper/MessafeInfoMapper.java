package com.guigu.mapper;

import com.guigu.pojo.MessafeInfo;
import com.guigu.pojo.MessafeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessafeInfoMapper {
    int countByExample(MessafeInfoExample example);

    int deleteByExample(MessafeInfoExample example);

    int deleteByPrimaryKey(Integer messafeId);

    int insert(MessafeInfo record);

    int insertSelective(MessafeInfo record);

    List<MessafeInfo> selectByExample(MessafeInfoExample example);

    MessafeInfo selectByPrimaryKey(Integer messafeId);

    int updateByExampleSelective(@Param("record") MessafeInfo record, @Param("example") MessafeInfoExample example);

    int updateByExample(@Param("record") MessafeInfo record, @Param("example") MessafeInfoExample example);

    int updateByPrimaryKeySelective(MessafeInfo record);

    int updateByPrimaryKey(MessafeInfo record);
}