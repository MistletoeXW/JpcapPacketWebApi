package com.example.demo.service;

import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.dao.NetMapper;
import com.example.demo.entity.Net;
import com.example.demo.entity.NetExample;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NetWorkInfoService {

    @Resource
    private NetMapper netMapper;

    public Result getNetWorkInfo(){

        Net net = new Net();
        Result result = new Result();
        try{
            netMapper.deleteAll();
            netMapper.auto();
            //获取本机上的网络接口对象数组
            final NetworkInterface[] devices = JpcapCaptor.getDeviceList();
            for(int i=1;i<=devices.length;i++){
                NetworkInterface nc=devices[i-1];
                net.setName(nc.name);
                if(nc.addresses.length>=2){
                    //一块卡上可能有多个地址:
                    String address = nc.addresses[0].address.getHostAddress();
                    String otherAddress = nc.addresses[1].address.getHostAddress();
                    net.setAddress(address);
                    net.setOtherAddress(otherAddress);
                }else if(nc.addresses.length==1){
                    String address = nc.addresses[0].address.getHostAddress();
                    net.setAddress(address);
                    net.setOtherAddress(null);
                }else {
                    net.setAddress(null);
                    net.setOtherAddress(null);
                }
                netMapper.insertSelective(net);
            }

            NetExample example = new NetExample();
            example.createCriteria()
                    .andIdIsNotNull();
            List<Net> netList = netMapper.selectByExample(example);
            result = ResultTool.success(netList);

        }catch(Exception ef){
            ef.printStackTrace();
            result = ResultTool.error("显示网络接口数据失败:  "+ef);
        }
        return result;
    }

}
