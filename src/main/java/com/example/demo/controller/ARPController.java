package com.example.demo.controller;

import com.example.demo.OV.Result;
import com.example.demo.service.QueryPacketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping(value = "/arp")
@Api(description = "arp")
public class ARPController {
    @Resource
    private QueryPacketService queryPacketService;

    @GetMapping("/list")
    @ApiOperation(value = "获取arp数据分析结果",httpMethod = "GET")
    public Result getARPList(){
        return queryPacketService.getARPList();
    }
}
