package com.winsion.service;

import com.winsion.common.Message;
import com.winsion.entity.Carparking;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:18
 **/
public interface CarparkService {

    /**
     * 根据停车场id删除停车场信息
     * @param carparkId
     * @return
     */
    Message remove(String carparkId);

    /**
     * 根据停车场id获取单个停车场信息
     * @param carparkId
     * @return
     */
    Message get(String carparkId);

    /**
     * 获取所有停车场信息
     * @return
     */
    Message findAll();

    /**
     * 创建停车场信息
     * @param areaid
     * @param parkingname
     * @return
     */
    Message save(String areaid, String parkingname);
}
