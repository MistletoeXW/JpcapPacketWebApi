package com.example.demo.dao;

import com.example.demo.entity.Net;
import com.example.demo.entity.NetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetMapper {
    int countByExample(NetExample example);

    int deleteByExample(NetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Net record);

    int insertSelective(Net record);

    List<Net> selectByExample(NetExample example);

    Net selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Net record, @Param("example") NetExample example);

    int updateByExample(@Param("record") Net record, @Param("example") NetExample example);

    int updateByPrimaryKeySelective(Net record);

    int updateByPrimaryKey(Net record);
}