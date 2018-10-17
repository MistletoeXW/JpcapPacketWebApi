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
@RequestMapping(value = "/udp")
@Api(description = "udp")
public class UDPController {

    @Resource
    private QueryPacketService queryPacketService;

    @GetMapping("/list")
    @ApiOperation(value = "获取udp数据列表", httpMethod = "GET")
    public Result getUDPList(){
        return queryPacketService.getUDPList();
    }
}
