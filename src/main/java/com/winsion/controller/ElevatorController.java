package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.service.ElevatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/10:15
 **/
@RestController
@RequestMapping(value = "/elevator")
@Api(value = "/elevator", description = "电梯管理")
public class ElevatorController {


    @Autowired
    ElevatorService elevatorService;

    /**
     * 获取电梯列表
     */
    @ApiOperation("获取电梯列表")
    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public Message findAll() {
        return elevatorService.findAll();
    }

    /**
     * 根据区域信息获取电梯列表
     */
    @ApiOperation("根据区域信息获取电梯列表")
    @RequestMapping(value = "findAllByAreaId", method = RequestMethod.POST)
    public Message findAllByAreaId(
            @RequestParam("areaId") String areaId) {
        return elevatorService.findAllByAreaId(areaId);
    }

    /**
     * 根据电梯ID来更新电梯状态
     */
    @ApiOperation("根据电梯ID来更新电梯状态")
    @RequestMapping(value = "updateElevatorState", method = RequestMethod.POST)
    public Message updateElevatorState(
            @RequestParam("elevatorId") String elevatorId,
            @RequestParam("runState") Integer runState) {
        return elevatorService.updateElevatorState(elevatorId,runState);
    }

    /**
     * 根据电梯ID来设置电梯目标楼层
     */
    @ApiOperation("根据电梯ID来设置电梯目标楼层")
    @RequestMapping(value = "setElevatorFloor", method = RequestMethod.POST)
    public Message setElevatorFloor(
            @RequestParam("elevatorId") String elevatorId,
            @RequestParam("tarPOSTfloor") Integer targetfloor) {
        return elevatorService.setElevatorFloor(elevatorId,targetfloor);
    }

}
