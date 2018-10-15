package com.example.demo.Tool;

import com.example.demo.service.NetWorkInfoService;
import org.junit.Test;

public class NetWorkInfoServiceTest {



    @Test
    public void getNetInfo() {
        NetWorkInfoService netWorkInfoService = new NetWorkInfoService();
        System.out.print(netWorkInfoService.getNetWorkInfo());
    }
}