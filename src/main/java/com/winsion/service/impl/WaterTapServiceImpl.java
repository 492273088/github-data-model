package com.winsion.service.impl;

import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.WaterTap;
import com.winsion.repository.WaterTapRepository;
import com.winsion.service.WaterTapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/11/14:33
 **/
@Service
public class WaterTapServiceImpl implements WaterTapService {

    @Autowired
    WaterTapRepository waterTapRepository;

    @Override
    public Message findAll() {
        List<WaterTap> list = waterTapRepository.findAll();
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    public Message findAllByAreaId(String areaId) {
        List<WaterTap> list = waterTapRepository.findAllByAreaId(areaId);
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    @Transactional
    public Message updateWaterTap(String waterTapId, Integer runState, Double discharge) {
        WaterTap waterTap = waterTapRepository.findOne(waterTapId);
        if (runState !=null){
            waterTap.setRunState(runState);
        }
        if (discharge !=null){
            waterTap.setDeviceValue(waterTap.getDeviceValue()+discharge);
        }
        return Message.create(RequestCode.SUCCESS,"",null);
    }
}
