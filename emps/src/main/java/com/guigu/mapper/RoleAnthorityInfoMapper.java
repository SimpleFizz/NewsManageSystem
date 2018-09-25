package com.guigu.mapper;

import com.guigu.pojo.RoleAnthorityInfo;
import com.guigu.pojo.RoleAnthorityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAnthorityInfoMapper {
    int countByExample(RoleAnthorityInfoExample example);

    int deleteByExample(RoleAnthorityInfoExample example);

    int deleteByPrimaryKey(Integer roleAnthorityId);

    int insert(RoleAnthorityInfo record);

    int insertSelective(RoleAnthorityInfo record);

    List<RoleAnthorityInfo> selectByExample(RoleAnthorityInfoExample example);

    RoleAnthorityInfo selectByPrimaryKey(Integer roleAnthorityId);

    int updateByExampleSelective(@Param("record") RoleAnthorityInfo record, @Param("example") RoleAnthorityInfoExample example);

    int updateByExample(@Param("record") RoleAnthorityInfo record, @Param("example") RoleAnthorityInfoExample example);

    int updateByPrimaryKeySelective(RoleAnthorityInfo record);

    int updateByPrimaryKey(RoleAnthorityInfo record);
}