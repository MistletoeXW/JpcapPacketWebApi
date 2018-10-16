package com.example.demo.Tool;

import com.example.demo.service.NetWorkInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class NetWorkInfoServiceTest {

    @Resource
    private NetWorkInfoService netWorkInfoService;

    @Test
    public void getNetInfo() {
        System.out.print(netWorkInfoService.getNetWorkInfo());
    }
}