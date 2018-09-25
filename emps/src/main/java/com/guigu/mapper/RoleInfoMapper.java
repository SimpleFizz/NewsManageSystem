package com.guigu.mapper;

import com.guigu.pojo.RoleInfo;
import com.guigu.pojo.RoleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoMapper {
    int countByExample(RoleInfoExample example);

    int deleteByExample(RoleInfoExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    List<RoleInfo> selectByExample(RoleInfoExample example);

    RoleInfo selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}