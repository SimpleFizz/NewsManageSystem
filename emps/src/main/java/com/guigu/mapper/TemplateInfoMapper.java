package com.guigu.mapper;

import com.guigu.pojo.TemplateInfo;
import com.guigu.pojo.TemplateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateInfoMapper {
    int countByExample(TemplateInfoExample example);

    int deleteByExample(TemplateInfoExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(TemplateInfo record);

    int insertSelective(TemplateInfo record);

    List<TemplateInfo> selectByExample(TemplateInfoExample example);

    TemplateInfo selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") TemplateInfo record, @Param("example") TemplateInfoExample example);

    int updateByExample(@Param("record") TemplateInfo record, @Param("example") TemplateInfoExample example);

    int updateByPrimaryKeySelective(TemplateInfo record);

    int updateByPrimaryKey(TemplateInfo record);
}