package com.example.demo.controller;


import com.example.demo.OV.Result;
import com.example.demo.OV.ResultTool;
import com.example.demo.service.StartPacket;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/thread")
public class TaskHelperController {
    @Resource
    private StartPacket startPacket;

    public static boolean stopFlag = false;

    @GetMapping("/begin")
    @ApiOperation(value = "启动数据抓取",httpMethod = "GET")
    public Result begin(){
        Result result = new Result();
        TaskHelperController.stopFlag = false;
        try{
            startPacket.startCapThread();
            result = ResultTool.success();
        }catch (Exception e){
            result = ResultTool.error("启动失败");
        }

        return result;
    }

    @GetMapping("/stop")
    @ApiOperation(value = "停止数据抓取",httpMethod = "GET")
    public Result stop() {
        TaskHelperController.stopFlag = true;
        Result result = new Result();
        result = ResultTool.success();
        return result;
    }

}
