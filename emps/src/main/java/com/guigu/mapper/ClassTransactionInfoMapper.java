package com.guigu.mapper;

import com.guigu.pojo.ClassTransactionInfo;
import com.guigu.pojo.ClassTransactionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassTransactionInfoMapper {
    int countByExample(ClassTransactionInfoExample example);

    int deleteByExample(ClassTransactionInfoExample example);

    int deleteByPrimaryKey(Integer classTransactionId);

    int insert(ClassTransactionInfo record);

    int insertSelective(ClassTransactionInfo record);

    List<ClassTransactionInfo> selectByExample(ClassTransactionInfoExample example);

    ClassTransactionInfo selectByPrimaryKey(Integer classTransactionId);

    int updateByExampleSelective(@Param("record") ClassTransactionInfo record, @Param("example") ClassTransactionInfoExample example);

    int updateByExample(@Param("record") ClassTransactionInfo record, @Param("example") ClassTransactionInfoExample example);

    int updateByPrimaryKeySelective(ClassTransactionInfo record);

    int updateByPrimaryKey(ClassTransactionInfo record);
}