package com.winsion.service.impl;

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
    public Boolean add() {
        Carparking carparking = new Carparking();



        carparking = carparkRepository.save(carparking);
        if(carparking == null){
            return false;
        }
        return true;
    }

    @Override
    public Carparking addEntity() {
        Carparking carparking = new Carparking();



        return carparkRepository.save(carparking);
    }

    @Override
    public Boolean remove(String carparkingId) {
        carparkRepository.delete(carparkingId);
        if(carparkRepository.exists(carparkingId)){
            return false;
        }
        return true;
    }

    @Override
    public Carparking get(String carparkingId) {
        return carparkRepository.findOne(carparkingId);
    }

    @Override
    public List<Carparking> findAll() {
        return carparkRepository.findAll();
    }

    @Override
    public Boolean changeObject() {
        return null;
    }
}
