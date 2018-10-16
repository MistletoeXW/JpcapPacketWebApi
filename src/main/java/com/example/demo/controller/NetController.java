package com.example.demo.controller;


import com.example.demo.OV.Result;
import com.example.demo.service.NetWorkInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping(value = "/network")
@Api(description = "网卡信息")
public class NetController {

    @Resource
    private NetWorkInfoService netWorkInfoService;

    @GetMapping("/list")
    @ApiOperation(value = "获取网卡信息列表",httpMethod = "GET")
    public Result getNetWorkList(){
        return netWorkInfoService.getNetWorkInfo();
    }

}
