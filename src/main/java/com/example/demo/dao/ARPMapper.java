package com.example.demo.dao;

import com.example.demo.entity.ARP;
import com.example.demo.entity.ARPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ARPMapper {
    int countByExample(ARPExample example);

    int deleteByExample(ARPExample example);

    int deleteAll();
    int auto();

    int insert(ARP record);

    int insertSelective(ARP record);

    List<ARP> selectByExample(ARPExample example);

    ARP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ARP record, @Param("example") ARPExample example);

    int updateByExample(@Param("record") ARP record, @Param("example") ARPExample example);

    int updateByPrimaryKeySelective(ARP record);

    int updateByPrimaryKey(ARP record);
}