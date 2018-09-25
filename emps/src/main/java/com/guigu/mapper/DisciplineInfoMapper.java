package com.guigu.mapper;

import com.guigu.pojo.DisciplineInfo;
import com.guigu.pojo.DisciplineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisciplineInfoMapper {
    int countByExample(DisciplineInfoExample example);

    int deleteByExample(DisciplineInfoExample example);

    int deleteByPrimaryKey(Integer disciplineId);

    int insert(DisciplineInfo record);

    int insertSelective(DisciplineInfo record);

    List<DisciplineInfo> selectByExample(DisciplineInfoExample example);

    DisciplineInfo selectByPrimaryKey(Integer disciplineId);

    int updateByExampleSelective(@Param("record") DisciplineInfo record, @Param("example") DisciplineInfoExample example);

    int updateByExample(@Param("record") DisciplineInfo record, @Param("example") DisciplineInfoExample example);

    int updateByPrimaryKeySelective(DisciplineInfo record);

    int updateByPrimaryKey(DisciplineInfo record);
}