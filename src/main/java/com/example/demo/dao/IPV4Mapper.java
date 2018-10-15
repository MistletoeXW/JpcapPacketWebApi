package com.example.demo.dao;

import com.example.demo.entity.IPV4;
import com.example.demo.entity.IPV4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IPV4Mapper {
    int countByExample(IPV4Example example);

    int deleteByExample(IPV4Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(IPV4 record);

    int insertSelective(IPV4 record);

    List<IPV4> selectByExample(IPV4Example example);

    IPV4 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IPV4 record, @Param("example") IPV4Example example);

    int updateByExample(@Param("record") IPV4 record, @Param("example") IPV4Example example);

    int updateByPrimaryKeySelective(IPV4 record);

    int updateByPrimaryKey(IPV4 record);
}