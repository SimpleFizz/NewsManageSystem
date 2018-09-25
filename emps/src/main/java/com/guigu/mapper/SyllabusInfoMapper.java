package com.guigu.mapper;

import com.guigu.pojo.SyllabusInfo;
import com.guigu.pojo.SyllabusInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyllabusInfoMapper {
    int countByExample(SyllabusInfoExample example);

    int deleteByExample(SyllabusInfoExample example);

    int deleteByPrimaryKey(Integer syllabusId);

    int insert(SyllabusInfo record);

    int insertSelective(SyllabusInfo record);

    List<SyllabusInfo> selectByExample(SyllabusInfoExample example);

    SyllabusInfo selectByPrimaryKey(Integer syllabusId);

    int updateByExampleSelective(@Param("record") SyllabusInfo record, @Param("example") SyllabusInfoExample example);

    int updateByExample(@Param("record") SyllabusInfo record, @Param("example") SyllabusInfoExample example);

    int updateByPrimaryKeySelective(SyllabusInfo record);

    int updateByPrimaryKey(SyllabusInfo record);
}