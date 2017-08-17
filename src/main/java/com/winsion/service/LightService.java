package com.winsion.service;

import com.winsion.common.Message;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:18
 **/
public interface LightService {

    /**
     * 根据区域信息获取照明列表
     */
    Message findAllByAreaId(String areaId);

    /**
     * 更新照明设备状态
     * @param runState
     * @param lightId
     * @param voltage
     *@param current
     * @param sensorValue @return
     */
    Message updateLight(String lightId, Integer runState, Double voltage, Double current, Double sensorValue);

    /**
     * 获取所有照明设备信息
     * @return
     */
    Message findAll();

}
