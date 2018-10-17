package com.example.demo.controller;


import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.service.QueryPacketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping(value = "/ipv4")
@Api(description = "ipv4")
public class IPV4Controller {

    @Resource
    private QueryPacketService queryPacketService;

    @GetMapping("/list")
    @ApiOperation(value = "获取IPV4数据分析结果",httpMethod = "GET")
    public Result getIPV4List(){
        return queryPacketService.getIPV4List();
    }

    @GetMapping("/tcpudp")
    @ApiOperation(value = "获取IPV4数据对应的TCP数据或者UDP数据",httpMethod = "GET")
    public Result getTCP(@RequestParam("protocol") Integer protocol,
                         @RequestParam("sort_id") Integer sortId){
        if(protocol == 6){
            return queryPacketService.getTCP(sortId);
        }else if(protocol == 17){
            return queryPacketService.getUDP(sortId);
        }else {
            Result result = ResultTool.error("找不到对应的数据");
            return result;
        }
    }
}
