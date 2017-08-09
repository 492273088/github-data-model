package com.winsion.service.impl;

import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.AirCondition;
import com.winsion.entity.CoolingPump;
import com.winsion.entity.CoolingTower;
import com.winsion.repository.AirConditionRepository;
import com.winsion.repository.AirHandlingRepository;
import com.winsion.repository.CoolingPumpRepository;
import com.winsion.repository.CoolingTowerRepository;
import com.winsion.service.AirConditionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/11:11
 **/
@Service
public class AirConditionServiceImpl implements AirConditionService {

    @Autowired
    AirConditionRepository airConditionRepository;
    @Autowired
    CoolingTowerRepository coolingTowerRepository;
    @Autowired
    CoolingPumpRepository coolingPumpRepository;
    @Autowired
    AirHandlingRepository airHandlingRepository;

    Logger logger = Logger.getLogger(ParkingSpaceServiceImpl.class);

    @Override
    public Message findAllByAreaId(String areaId) {
        List<AirCondition> list = airConditionRepository.findAllByAreaId(areaId);
        return Message.create(RequestCode.SUCCESS, "", list);
    }

    @Override
    public Message findAllCoolingPump(String areaId) {
        List<CoolingPump> list = coolingPumpRepository.findAllByAreaid(areaId);
        return Message.create(RequestCode.SUCCESS, "", list);
    }

    @Override
    @Transactional
    public Message switchCoolingPump(String coolingPumpId, Integer state) {
        try {
            CoolingPump coolingPump = coolingPumpRepository.findOne(coolingPumpId);
            coolingPump.setRunstate(state);
            return Message.create(RequestCode.SUCCESS, "", null);
        } catch (Exception e) {
            logger.error("switchCoolingPump fail!!!", e);
        }
        return Message.create(RequestCode.ERROR, "更新状态失败,请联系管理员", null);
    }

    @Override
    public Message findAllCoolingTower(String areaId) {
        List<CoolingTower> list = coolingTowerRepository.findAllByAreaid(areaId);
        return Message.create(RequestCode.SUCCESS, "", list);
    }

    @Override
    @Transactional
    public Message setAirConditionRunState(String airConditionId, Integer state) {
        AirCondition airCondition = airConditionRepository.findOne(airConditionId);
        airCondition.setRunState(state);
        return Message.create(RequestCode.SUCCESS, "", null);
    }

    @Override
    @Transactional
    public Message setAirConditionPattern(String airConditionId, Integer pattern) {
        AirCondition airCondition = airConditionRepository.findOne(airConditionId);
        airCondition.setModel(pattern);
        return Message.create(RequestCode.SUCCESS, "", null);
    }

    @Override
    public Message setAirSpeed(String airConditionId, Integer speed) {
        AirCondition airCondition = airConditionRepository.findOne(airConditionId);
        airCondition.setWindLevel(airCondition.getWindLevel()+speed);
        return Message.create(RequestCode.SUCCESS, "", null);
    }

    @Override
    public Message setAirTemperature(String airConditionId, Double temperature) {
        AirCondition airCondition = airConditionRepository.findOne(airConditionId);
        airCondition.setSetTemperature(airCondition.getSetTemperature()+temperature);
        return Message.create(RequestCode.SUCCESS, "", null);
    }
}
