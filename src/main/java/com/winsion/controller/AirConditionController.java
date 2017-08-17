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
@Api(value = "/airCondition", description = "空调管理")
public class AirConditionController {

    @Autowired
    AirConditionService airConditionService;

    /**
     * 获取空调列表
     */
    @ApiOperation("获取所有空调列表")
    @RequestMapping(value = "findAllAirCondition", method = RequestMethod.POST)
    public Message findAllAirCondition() {
        return airConditionService.findAll();
    }

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
     * 根据空调id设置空调设置温度
     */
    @ApiOperation("根据空调id设置空调设置温度")
    @RequestMapping(value = "setAirTemperature", method = RequestMethod.POST)
    public Message setAirTemperature(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("temperature") Double temperature) {
        return airConditionService.setAirTemperature(AirConditionId, temperature);
    }

    /**
     * 根据空调id设置空调当前室内温度
     */
    @ApiOperation("根据空调id设置空调当前室内温度")
    @RequestMapping(value = "setAirIndoorTemp", method = RequestMethod.POST)
    public Message setAirIndoorTemp(
            @RequestParam("AirConditionId") String AirConditionId,
            @RequestParam("indoorTemp") Double indoorTemp) {
        return airConditionService.setAirIndoorTemp(AirConditionId, indoorTemp);
    }

    /**
     * 获取所有冷却水泵信息
     */
    @ApiOperation("获取所有冷却水泵信息")
    @RequestMapping(value = "findAllCoolingPump", method = RequestMethod.POST)
    public Message findAllCoolingPump() {
        return airConditionService.findAllCoolingPump();
    }

    /**
     * 通过区域ID获取所有冷却水泵信息
     */
    @ApiOperation("通过区域ID获取所有冷却水泵信息")
    @RequestMapping(value = "findAllCoolingPumpByAreaId", method = RequestMethod.POST)
    public Message findAllCoolingPumpByAreaId(
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
    public Message findAllCoolingTower() {
        return airConditionService.findAllCoolingTower();
    }

    /**
     * 根据区域ID获取所有冷却塔信息
     */
    @ApiOperation("根据区域ID获取所有冷却塔信息")
    @RequestMapping(value = "findAllCoolingTowerByAreaId", method = RequestMethod.POST)
    public Message findAllCoolingTowerByAreaId(
            @RequestParam("areaId") String areaId) {
        return airConditionService.findAllCoolingTower(areaId);
    }

    /**
     * 冷却塔开关接口
     */
    @ApiOperation("根据冷却塔编号和状态信息开关冷却塔")
    @RequestMapping(value = "switchCoolingTower", method = RequestMethod.POST)
    public Message switchCoolingTower(
            @RequestParam("coolingTowerId") String coolingTowerId,
            @RequestParam("state") Integer state) {
        return airConditionService.switchCoolingTower(coolingTowerId, state);
    }


    /**
     * 获取所有处理机信息
     */
    @ApiOperation("获取所有处理机信息")
    @RequestMapping(value = "findAllAirHanding", method = RequestMethod.POST)
    public Message findAllAirHanding() {
        return airConditionService.findAllAirHanding();
    }

    /**
     * 根据区域ID获取所有处理机信息
     */
    @ApiOperation("根据区域ID获取所有处理机信息")
    @RequestMapping(value = "findAllAirHandingByAreaId", method = RequestMethod.POST)
    public Message findAllAirHandingByAreaId(
            @RequestParam("areaId") String areaId) {
        return airConditionService.findAllAirHanding(areaId);
    }

    /**
     * 处理机入水口温度
     */
    @ApiOperation("处理机入水口温度")
    @RequestMapping(value = "setInairtemp", method = RequestMethod.POST)
    public Message setInairtemp(
            @RequestParam("airHandingId") String airHandingId,
            @RequestParam("inairtemp") Double inairtemp) {
        return airConditionService.setInairtemp(airHandingId, inairtemp);
    }

    /**
     * 处理机出水口温度
     */
    @ApiOperation("处理机出水口温度")
    @RequestMapping(value = "setOutairtemp", method = RequestMethod.POST)
    public Message setOutairtemp(
            @RequestParam("airHandingId") String airHandingId,
            @RequestParam("outairtemp") Double outairtemp) {
        return airConditionService.setOutairtemp(airHandingId, outairtemp);
    }


    /**
     * 处理机开关接口
     */
    @ApiOperation("根据处理机编号和状态信息开关处理机")
    @RequestMapping(value = "switchAirHanding", method = RequestMethod.POST)
    public Message switchAirHanding(
            @RequestParam("airHandingId") String airHandingId,
            @RequestParam("state") Integer state) {
        return airConditionService.switchAirHanding(airHandingId, state);
    }

}
