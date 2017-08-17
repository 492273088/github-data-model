package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.service.LightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:16
 **/
@RestController
@RequestMapping(value = "/light")
@Api(value = "/light", description = "照明管理")
public class LightController {

    @Autowired
    LightService lightService;
    /**
     * 根据区域信息获取照明列表
     */
    @ApiOperation("根据区域信息获取照明列表")
    @RequestMapping(value = "findAllByAreaId", method = RequestMethod.POST)
    public Message findAllByAreaId(
            @RequestParam("areaId") String areaId) {
        return lightService.findAllByAreaId(areaId);
    }

    /**
     * 获取照明列表
     */
    @ApiOperation("获取照明列表")
    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public Message findAll() {
        return lightService.findAll();
    }

    /**
     * 更新照明设备信息
     */
    @ApiOperation("更新照明设备信息")
    @RequestMapping(value = "updateLight", method = RequestMethod.POST)
    public Message updateLight(
            @RequestParam(value = "lightId") String lightId,
            @RequestParam(value = "runState", required = false) Integer runState,
            @RequestParam(value = "voltage", required = false) Double voltage,
            @RequestParam(value = "current", required = false) Double current,
            @RequestParam(value = "sensorValue", required = false) Double sensorValue) {
        return lightService.updateLight(lightId,runState,voltage,current,sensorValue);
    }

}
