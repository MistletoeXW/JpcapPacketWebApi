package com.example.demo.service;

import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.OV.countResponse;
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
                    .andSortIdIsNotNull();
            result = ResultTool.success(ipv4Mapper.selectByExample(example));
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }

    public Result getTCP(Integer id){
        Result result = new Result();
        try{
            TCPExample example = new TCPExample();
            example.createCriteria()
                    .andSortIdEqualTo(id);
            List<TCP> list = tcpMapper.selectByExample(example);
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
            result = ResultTool.success(tcpMapper.selectByExample(example));
        }catch (Exception e){
            result = ResultTool.error("Query error!");
        }
        return result;
    }

    public Result getUDP(Integer id){
        Result result = new Result();
        try{
            UDPExample example = new UDPExample();
            example.createCriteria()
                    .andSortIdEqualTo(id);
            List<UDP> list = udpMapper.selectByExample(example);
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
            result = ResultTool.success(udpMapper.selectByExample(example));
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

    public Result getCount(){
        Result result = new Result();
        countResponse countresponse = new countResponse();
        try{
            IPV4Example ipv4Example = new IPV4Example();
            ipv4Example.createCriteria()
                    .andIdIsNotNull();
            countresponse.setIpv4(ipv4Mapper.countByExample(ipv4Example));

            TCPExample tcpExample = new TCPExample();
            tcpExample.createCriteria()
                    .andIdIsNotNull();
            countresponse.setTcp(tcpMapper.countByExample(tcpExample));

            UDPExample udpExample = new UDPExample();
            udpExample.createCriteria()
                    .andIdIsNotNull();
            countresponse.setUdp(udpMapper.countByExample(udpExample));

            ARPExample arpExample = new ARPExample();
            arpExample.createCriteria()
                    .andIdIsNotNull();
            countresponse.setArp(arpMapper.countByExample(arpExample));

            result = ResultTool.success(countresponse);
        }catch (Exception e){
            result = ResultTool.error("error!");
        }
        return result;
    }




}
