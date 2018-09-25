package com.guigu.mapper;

import com.guigu.pojo.EmailInfo;
import com.guigu.pojo.EmailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailInfoMapper {
    int countByExample(EmailInfoExample example);

    int deleteByExample(EmailInfoExample example);

    int deleteByPrimaryKey(Integer emailId);

    int insert(EmailInfo record);

    int insertSelective(EmailInfo record);

    List<EmailInfo> selectByExample(EmailInfoExample example);

    EmailInfo selectByPrimaryKey(Integer emailId);

    int updateByExampleSelective(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByExample(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByPrimaryKeySelective(EmailInfo record);

    int updateByPrimaryKey(EmailInfo record);
}