package com.winsion.service;

import com.winsion.common.Message;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/11/14:33
 **/
public interface WaterTapService {

    /**
     * 获取所有上水阀门信息
     * @return
     */
    Message findAll();

    /**
     * 通过区域ID获取所有上水阀门列表
     * @param areaId
     * @return
     */
    Message findAllByAreaId(String areaId);

    /**
     * 更新水阀信息
     * @param waterTapId
     * @param runState
     * @param discharge
     * @return
     */
    Message updateWaterTap(String waterTapId, Integer runState, Double discharge);
}
