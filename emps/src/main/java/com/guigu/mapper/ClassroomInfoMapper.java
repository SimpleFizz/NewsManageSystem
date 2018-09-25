package com.guigu.mapper;

import com.guigu.pojo.ClassroomInfo;
import com.guigu.pojo.ClassroomInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomInfoMapper {
    int countByExample(ClassroomInfoExample example);

    int deleteByExample(ClassroomInfoExample example);

    int deleteByPrimaryKey(Integer classroomId);

    int insert(ClassroomInfo record);

    int insertSelective(ClassroomInfo record);

    List<ClassroomInfo> selectByExample(ClassroomInfoExample example);

    ClassroomInfo selectByPrimaryKey(Integer classroomId);

    int updateByExampleSelective(@Param("record") ClassroomInfo record, @Param("example") ClassroomInfoExample example);

    int updateByExample(@Param("record") ClassroomInfo record, @Param("example") ClassroomInfoExample example);

    int updateByPrimaryKeySelective(ClassroomInfo record);

    int updateByPrimaryKey(ClassroomInfo record);
}