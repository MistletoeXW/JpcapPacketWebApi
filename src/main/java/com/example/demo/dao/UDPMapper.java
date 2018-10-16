package com.example.demo.dao;

import com.example.demo.entity.UDP;
import com.example.demo.entity.UDPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UDPMapper {
    int countByExample(UDPExample example);

    int deleteByExample(UDPExample example);

    int deleteAll();
    int auto();

    int insert(UDP record);

    int insertSelective(UDP record);

    List<UDP> selectByExample(UDPExample example);

    UDP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UDP record, @Param("example") UDPExample example);

    int updateByExample(@Param("record") UDP record, @Param("example") UDPExample example);

    int updateByPrimaryKeySelective(UDP record);

    int updateByPrimaryKey(UDP record);
}