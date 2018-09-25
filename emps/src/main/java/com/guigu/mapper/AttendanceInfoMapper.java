package com.guigu.mapper;

import com.guigu.pojo.AttendanceInfo;
import com.guigu.pojo.AttendanceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceInfoMapper {
    int countByExample(AttendanceInfoExample example);

    int deleteByExample(AttendanceInfoExample example);

    int deleteByPrimaryKey(Integer attendanceId);

    int insert(AttendanceInfo record);

    int insertSelective(AttendanceInfo record);

    List<AttendanceInfo> selectByExample(AttendanceInfoExample example);

    AttendanceInfo selectByPrimaryKey(Integer attendanceId);

    int updateByExampleSelective(@Param("record") AttendanceInfo record, @Param("example") AttendanceInfoExample example);

    int updateByExample(@Param("record") AttendanceInfo record, @Param("example") AttendanceInfoExample example);

    int updateByPrimaryKeySelective(AttendanceInfo record);

    int updateByPrimaryKey(AttendanceInfo record);
}