package com.example.demo.dao;

import com.example.demo.entity.TCP;
import com.example.demo.entity.TCPExample;
import com.example.demo.entity.TCPWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCPMapper {
    int countByExample(TCPExample example);

    int deleteByExample(TCPExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCPWithBLOBs record);

    int insertSelective(TCPWithBLOBs record);

    List<TCPWithBLOBs> selectByExampleWithBLOBs(TCPExample example);

    List<TCP> selectByExample(TCPExample example);

    TCPWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCPWithBLOBs record, @Param("example") TCPExample example);

    int updateByExampleWithBLOBs(@Param("record") TCPWithBLOBs record, @Param("example") TCPExample example);

    int updateByExample(@Param("record") TCP record, @Param("example") TCPExample example);

    int updateByPrimaryKeySelective(TCPWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TCPWithBLOBs record);

    int updateByPrimaryKey(TCP record);
}