package com.example.demo.dao;

import com.example.demo.entity.TCP;
import com.example.demo.entity.TCPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCPMapper {
    int countByExample(TCPExample example);

    int deleteByExample(TCPExample example);

    int deleteAll();

    int auto();

    int insert(TCP record);

    int insertSelective(TCP record);

    List<TCP> selectByExample(TCPExample example);

    TCP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCP record, @Param("example") TCPExample example);

    int updateByExample(@Param("record") TCP record, @Param("example") TCPExample example);

    int updateByPrimaryKeySelective(TCP record);

    int updateByPrimaryKey(TCP record);
}