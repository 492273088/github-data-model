package com.winsion.service;

import com.winsion.entity.Carparking;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:31
 **/
public interface ParkingSpaceService {

    Boolean add();

    Carparking addEntity();

    Boolean remove(String parkingSpaceId);

    Carparking get(String parkingSpaceId);

    List<Carparking> findAll();

    Boolean changeObject();

}
