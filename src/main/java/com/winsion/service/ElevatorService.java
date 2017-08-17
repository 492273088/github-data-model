package com.winsion.service;

import com.winsion.common.Message;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/10:17
 **/
public interface ElevatorService {
    /**
     * 根据区域信息获取电梯列表
     * @param areaId
     * @return
     */
    Message findAllByAreaId(String areaId);

    /**
     * 根据电梯ID来更新电梯状态
     * @param elevatorId
     * @param runState
     * @return
     */
    Message updateElevatorState(String elevatorId,Integer runState);

    /**
     * 根据电梯ID来设置电梯目标楼层
     * @param elevatorId
     * @param targetfloor
     * @return
     */
    Message setElevatorFloor(String elevatorId, Integer targetfloor);

    /**
     * 获取电梯列表
     * @return
     */
    Message findAll();

}
