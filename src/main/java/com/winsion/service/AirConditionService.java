package com.winsion.service;

import com.winsion.common.Message;
import com.winsion.entity.AirCondition;
import com.winsion.entity.CoolingPump;
import com.winsion.entity.CoolingTower;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/11:06
 **/
public interface AirConditionService {

    /**
     * 获取空调列表
     */
    Message findAll();

    /**
     * 根据区域ID获取该区域下所有空调信息
     * @param areaId
     * @return
     */
    Message findAllByAreaId(String areaId);

    /**
     * 获取所有冷却水泵信息
     */
    Message findAllCoolingPump();

    /**
     * 通过区域ID获取所有冷却水泵信息
     */
    Message findAllCoolingPump(String areaId);

    /**
     * 冷却水泵开关接口
     */
    Message switchCoolingPump(String coolingPumpId, Integer state);

    /**
     * 获取所有冷却塔信息
     */
    Message findAllCoolingTower(String areaId);

    /**
     * 根据空调id设置空调的运行状态
     */
    Message setAirConditionRunState(String airConditionId, Integer state);

    /**
     * 根据空调id设置空调的运行模式
     */
    Message setAirConditionPattern(String airConditionId, Integer pattern);

    /**
     * 根据空调id设置空调风速
     */
    Message setAirSpeed(String airConditionId, Integer speed);

    /**
     * 根据空调id设置空调温度
     * @param airConditionId
     * @param temperature
     * @return
     */
    Message setAirTemperature(String airConditionId, Double temperature);

    /**
     * 获取所有处理机信息
     */
    Message findAllAirHanding(String areaId);

    /**
     *  获取所有冷却塔信息
     * @return
     */
    Message findAllCoolingTower();

    /**
     * 获取所有空调处理机信息
     * @return
     */
    Message findAllAirHanding();

    /**
     * 根据冷却塔编号和状态信息开关冷却塔
     * @param coolingTowerId
     * @param state
     * @return
     */
    Message switchCoolingTower(String coolingTowerId, Integer state);

    /**
     * 根据处理机编号和状态信息开关处理机
     * @param airHandingId
     * @param state
     * @return
     */
    Message switchAirHanding(String airHandingId, Integer state);

    /**
     * 根据空调id设置空调当前室内温度
     * @param airConditionId
     * @param indoorTemp
     * @return
     */
    Message setAirIndoorTemp(String airConditionId, Double indoorTemp);

    /**
     * 处理机入水口温度
     * @param airHandingId
     * @param inairtemp
     * @return
     */
    Message setInairtemp(String airHandingId, Double inairtemp);

    /**
     * 处理机出水口温度
     * @param airHandingId
     * @param outairtemp
     * @return
     */
    Message setOutairtemp(String airHandingId, Double outairtemp);
}
