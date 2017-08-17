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
    /**
     * 根据停车位ID移除停车位信息
     * @param parkingSpaceId
     * @return
     */
    Message remove(String parkingSpaceId);

    /**
     * 根据停车位ID获取停车位信息
     * @param parkingSpaceId
     * @return
     */
    Message get(String parkingSpaceId);

    /**
     * 获取所有停车位信息
     * @return
     */
    Message findAll();

    /**
     * 根据停车场id获取该停车场内所有的停车位信息
     * @param carparkingId
     * @return
     */
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
