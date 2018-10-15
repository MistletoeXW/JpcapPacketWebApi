package com.example.demo.service;

import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;

public class DisplayPacket {

    private PackReceiverService packReceiverService = new PackReceiverService();

    public Result startPocketThread(Integer num){
        Result result = new Result();
        try{
            final  NetworkInterface[] devices = JpcapCaptor.getDeviceList();
            NetworkInterface nc= devices[num];
            //创建某个卡口上的抓取对象,最大为2000个
            JpcapCaptor jpcap = JpcapCaptor.openDevice(nc, 2000, true, 20);
            //使用接包处理器循环抓包
            jpcap.loopPacket(-1, packReceiverService);
            result = ResultTool.success(packReceiverService.packetInfo);
        }catch (Exception e){
            result = ResultTool.error("获取数据包失败" + e);
        }
        return result;
    }

}
