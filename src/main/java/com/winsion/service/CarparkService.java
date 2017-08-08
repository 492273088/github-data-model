package com.winsion.service;

import com.winsion.entity.Carparking;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:18
 **/
public interface CarparkService {

    Boolean add();

    Carparking addEntity();

    Boolean remove(String carparkId);

    Carparking get(String carparkId);

    List<Carparking> findAll();

    Boolean changeObject();

}
