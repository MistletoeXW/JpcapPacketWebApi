package com.example.demo.service;

import com.example.demo.OV.resonpse.Network;
import com.example.demo.OV.resonpse.NetworkList;
import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;


public class NetWorkInfoService {

    public Result getNetWorkInfo(){
        NetworkList networkList = new NetworkList();
        Result result = new Result();
        try{
            //获取本机上的网络接口对象数组
            final NetworkInterface[] devices = JpcapCaptor.getDeviceList();
            for(int i=1;i<=devices.length;i++){
                Network network = new Network();
                NetworkInterface nc=devices[i-1];
                if(nc.addresses.length>=2){
                    //一块卡上可能有多个地址:
                    String address = nc.addresses[0].address.getHostAddress();
                    String otherAddress = nc.addresses[1].address.getHostAddress();
                    network.setNetwork(nc.name,address,otherAddress);
                }else if(nc.addresses.length==1){
                    String address = nc.addresses[0].address.getHostAddress();
                    network.setNetwork(nc.name,address,null);
                }else{
                    network.setNetwork(nc.name,null,null);
                }

                networkList.setNetworkList(network);
            }
            result = ResultTool.success(networkList.getNetworkList());

        }catch(Exception ef){
            ef.printStackTrace();
            result = ResultTool.error("显示网络接口数据失败:  "+ef);
        }
        return result;
    }

}
