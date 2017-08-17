package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.entity.ParkingSpace;
import com.winsion.service.CarparkService;
import com.winsion.service.ParkingSpaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/8/10:09
 **/
@RestController
@RequestMapping(value = "/parking")
@Api(value = "/parking", description = "停车厂管理")
public class ParkingController {

    @Autowired
    CarparkService carparkService;
    @Autowired
    ParkingSpaceService parkingSpaceService;

    @ApiOperation("获取停车场列表")
    @RequestMapping(value = "/findAllParking", method = RequestMethod.POST)
    public Message findAllParking() {
        return carparkService.findAll();
    }

    @ApiOperation("根据停车场ID获取停车场信息")
    @RequestMapping(value = "/findCarParkingById", method = RequestMethod.POST)
    public Message findCarParkingById(
            @RequestParam("carparkingId") String carparkingId) {
        return carparkService.get(carparkingId);
    }

    @ApiOperation("添加停车场信息")
    @RequestMapping(value = "/addParking", method = RequestMethod.POST)
    public Message addParking(
            @RequestParam("areaid") String areaid,
            @RequestParam("parkingname") String parkingname) {
        return carparkService.save(areaid, parkingname);
    }


    @ApiOperation("获取所有停车位信息")
    @RequestMapping(value = "/findAllParkingSpace", method = RequestMethod.POST)
    public Message findAllParkingSpace() {
        return parkingSpaceService.findAll();
    }

    @ApiOperation("根据停车场ID获取该停车场所有停车位信息")
    @RequestMapping(value = "findAllByCaeparkingId", method = RequestMethod.POST)
    public Message findAllByCaeparkingId(
            @RequestParam("carparkingId") String carparkingId) {
        return parkingSpaceService.findAllByCaeparkingId(carparkingId);
    }

    @ApiOperation("更新停车位信息")
    @RequestMapping(value = "updateParkingSpaceInfo", method = RequestMethod.POST)
    public Message updateParkingSpaceInfo(
            @RequestParam(value = "parkingSpaceId") String parkingSpaceId,
            @RequestParam(value = "carno", required = false) String carno,
            @RequestParam(value = "spacestate") Integer spacestate) {
        return parkingSpaceService.updateParkingSpaceInfo(parkingSpaceId, carno, spacestate);
    }


}
