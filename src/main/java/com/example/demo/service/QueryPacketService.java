package com.example.demo.service;

import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.dao.ARPMapper;
import com.example.demo.dao.IPV4Mapper;
import com.example.demo.dao.TCPMapper;
import com.example.demo.dao.UDPMapper;
import com.example.demo.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueryPacketService {
    @Resource
    protected IPV4Mapper ipv4Mapper;
    @Resource
    private TCPMapper tcpMapper;
    @Resource
    private UDPMapper udpMapper;
    @Resource
    private ARPMapper arpMapper;

    public Result getIPV4List(){
        Result result = new Result();
        try{
            IPV4Example example = new IPV4Example();
            example.createCriteria()
                    .andIdIsNotNull();
            List<IPV4> list = ipv4Mapper.selectByExample(example);
            result = ResultTool.success(list);
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }

    public Result getTCPList(){
        Result result = new Result();
        try{
            TCPExample example = new TCPExample();
            example.createCriteria()
                    .andIdIsNotNull();
            List<TCP> list = tcpMapper.selectByExample(example);
            result = ResultTool.success(list);
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }

    public Result getUDPList(){
        Result result = new Result();
        try{
            UDPExample example = new UDPExample();
            example.createCriteria()
                    .andIdIsNotNull();
            List<UDP> list = udpMapper.selectByExample(example);
            result = ResultTool.success(list);
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }

    public Result getARPList(){
        Result result = new Result();
        try{
            ARPExample example = new ARPExample();
            example.createCriteria()
                    .andIdIsNotNull();
            List<ARP> list = arpMapper.selectByExample(example);
            result = ResultTool.success(list);
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }




}
