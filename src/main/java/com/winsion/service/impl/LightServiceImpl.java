package com.winsion.service.impl;

import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.Light;
import com.winsion.repository.LightRepository;
import com.winsion.service.LightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:18
 **/
@Service
public class LightServiceImpl implements LightService {

    @Autowired
    LightRepository lightRepository;

    @Override
    public Message findAllByAreaId(String areaId) {
        List<Light> list = lightRepository.findAllByAreaId(areaId);
        return Message.create(RequestCode.SUCCESS, "", list);
    }

    @Override
    public Message findAll() {
        List<Light> list = lightRepository.findAll();
        return Message.create(RequestCode.SUCCESS, "", list);
    }

    @Override
    @Transactional
    public Message updateLight(String lightId, Integer runState, Double voltage, Double current, Double sensorValue) {
        Light light = lightRepository.findOne(lightId);
        if (runState != null) {
            light.setRunState(runState);
        }
        if (voltage != null) {
            light.setVoltage(light.getVoltage() + voltage);
        }
        if (current != null) {
            light.setCurrent(light.getCurrent() + current);
        }
        if (sensorValue != null) {
            light.setSensorValue(sensorValue);
        }
//        lightRepository.save(light);
        return Message.create(RequestCode.SUCCESS, "", null);
    }

}
