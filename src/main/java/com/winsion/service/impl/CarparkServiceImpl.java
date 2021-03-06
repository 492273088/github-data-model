package com.winsion.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.Carparking;
import com.winsion.repository.CarparkRepository;
import com.winsion.service.CarparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:19
 **/
@Service
public class CarparkServiceImpl implements CarparkService {

    @Autowired
    CarparkRepository carparkRepository;

    @Override
    public Message remove(String carparkingId) {
        carparkRepository.delete(carparkingId);
        if(carparkRepository.exists(carparkingId)){
            return Message.create(RequestCode.ERROR,"删除失败,请稍后重试!",null);
        }
        return Message.create(RequestCode.SUCCESS,"",null);
    }

    @Override
    public Message get(String carparkingId) {
        Carparking carparking = carparkRepository.findOne(carparkingId);
        return Message.create(RequestCode.SUCCESS,"",carparking);
    }

    @Override
    public Message findAll() {
        List<Carparking> list= carparkRepository.findAll();
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    public Message save(String areaid, String parkingname) {
        Carparking carparking = carparkRepository.save(new Carparking(areaid, parkingname));
        return Message.create(RequestCode.SUCCESS,"",carparking);
    }

}
