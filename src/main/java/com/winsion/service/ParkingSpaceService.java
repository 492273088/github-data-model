package com.winsion.service;

import com.winsion.common.Message;
import com.winsion.entity.Carparking;
import com.winsion.entity.ParkingSpace;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:31
 **/
public interface ParkingSpaceService {
    Message remove(String parkingSpaceId);

    Message get(String parkingSpaceId);

    Message findAll();

    Message findAllByCaeparkingId(String carparkingId);

    /**
     * 更新停车位信息
     * @param parkingSpaceId
     * @param carno
     * @param spacestate
     * @return
     */
    Message updateParkingSpaceInfo(String parkingSpaceId, String carno, Integer spacestate);
}
