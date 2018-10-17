package com.example.demo.controller;

import com.example.demo.OV.Result;
import com.example.demo.service.QueryPacketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@Api(description = "count")
public class CountController {

    @Resource
    private QueryPacketService queryPacketService;

    @GetMapping("/count")
    @ApiOperation(value = "获取各数据包的数量",httpMethod = "GET")
    public Result getCount(){
        return queryPacketService.getCount();
    }
}
