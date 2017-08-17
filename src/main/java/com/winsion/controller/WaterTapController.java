package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.service.WaterTapService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/11/14:36
 **/
@RestController
@RequestMapping(value = "/waterTap")
@Api(value = "/waterTap", description = "上水管理")
public class WaterTapController {

    @Autowired
    WaterTapService waterTapService;

    @ApiOperation("获取所有上水阀门列表")
    @RequestMapping(value = "findAll",method = RequestMethod.POST)
    public Message findAll(){
        return waterTapService.findAll();
    }

    @ApiOperation("通过区域ID获取所有上水阀门列表")
    @RequestMapping(value = "findAllByAreaId",method = RequestMethod.POST)
    public Message findAllByAreaId(
            @RequestParam(value = "areaId")String areaId){
        return waterTapService.findAllByAreaId(areaId);
    }

    /**
     * 更新水阀信息
     */
    @ApiOperation("更新水阀信息")
    @RequestMapping(value = "updateWaterTap", method = RequestMethod.POST)
    public Message updateWaterTap(
            @RequestParam(value = "waterTapId") String waterTapId,
            @RequestParam(value = "runState", required = false) Integer runState,
            @RequestParam(value = "discharge", required = false) Double discharge) {
        return waterTapService.updateWaterTap(waterTapId,runState,discharge);
    }

}
