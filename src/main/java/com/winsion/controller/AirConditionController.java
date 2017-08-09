package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.service.AirConditionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:07
 **/
@RestController
@RequestMapping(value = "/airCondition")
@Api(value = "/airCondition", description = "空调控制器")
public class AirConditionController {

    @Autowired
    AirConditionService airConditionService;

    /**
     * 根据区域信息获取空调列表
     */
    @ApiOperation("根据区域信息获取空调列表")
    @RequestMapping(value = "findAllByAreaId", method = RequestMethod.POST)
    public Message findAllByAreaId(
            @RequestParam("areaId") String areaId) {
        return airConditionService.findAllByAreaId(areaId);
    }

    /**
     * 根据空调id设置空调的运行状态
     */
    @ApiOperation("根据空调id打开或者关闭空调")
    @RequestMapping(value = "switchAirCondition", method = RequestMethod.POST)
    public Message switchAirCondition(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("state") Integer state) {
        return airConditionService.setAirConditionRunState(AirConditionId, state);
    }

    /**
     * 根据空调id设置空调的运行模式
     */
    @ApiOperation("根据空调id设置空调的运行模式")
    @RequestMapping(value = "setAirConditionPattern", method = RequestMethod.POST)
    public Message setAirConditionPattern(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("pattern") Integer pattern) {
        return airConditionService.setAirConditionPattern(AirConditionId, pattern);
    }

    /**
     * 根据空调id设置空调风速
     */
    @ApiOperation("根据空调id设置空调风速")
    @RequestMapping(value = "setAirSpeed", method = RequestMethod.POST)
    public Message setAirSpeed(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("speed") Integer speed) {
        return airConditionService.setAirSpeed(AirConditionId, speed);
    }

    /**
     * 根据空调id设置空调温度
     */
    @ApiOperation("根据空调id设置空调温度")
    @RequestMapping(value = "setAirTemperature", method = RequestMethod.POST)
    public Message setAirTemperature(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("temperature") Double temperature) {
        return airConditionService.setAirTemperature(AirConditionId, temperature);
    }

    /**
     * 获取所有冷却水泵信息
     */
    @ApiOperation("获取所有冷却水泵信息")
    @RequestMapping(value = "findAllCoolingPump", method = RequestMethod.POST)
    public Message findAllCoolingPump(
            @RequestParam("areaId") String areaId) {
        return airConditionService.findAllCoolingPump(areaId);
    }

    /**
     * 冷却水泵开关接口
     */
    @ApiOperation("根据冷却水泵编号和状态信息开关冷却水泵")
    @RequestMapping(value = "switchCoolingPump", method = RequestMethod.POST)
    public Message switchCoolingPump(
            @RequestParam("coolingPumpId") String coolingPumpId,
            @RequestParam("state") Integer state) {
        return airConditionService.switchCoolingPump(coolingPumpId, state);
    }

    /**
     * 获取所有冷却塔信息
     */
    @ApiOperation("获取所有冷却塔信息")
    @RequestMapping(value = "findAllCoolingTower", method = RequestMethod.POST)
    public Message findAllCoolingTower(
            @RequestParam("areaId") String areaId) {
        return airConditionService.findAllCoolingTower(areaId);
    }

}
