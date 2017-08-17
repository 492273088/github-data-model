package com.winsion.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.winsion.common.Message;
import com.winsion.common.ParkingCode.*;
import com.winsion.common.RequestCode;
import com.winsion.entity.Carparking;
import com.winsion.entity.ParkingSpace;
import com.winsion.repository.CarparkRepository;
import com.winsion.repository.ParkingSpaceRepository;
import com.winsion.service.ParkingSpaceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:31
 **/
@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {

    Logger logger = Logger.getLogger(ParkingSpaceServiceImpl.class);

    @Autowired
    ParkingSpaceRepository parkingSpaceRepository;
    @Autowired
    CarparkRepository carparkRepository;


    @Override
    public Message remove(String parkingSpaceId) {
         parkingSpaceRepository.delete(parkingSpaceId);
        if(!parkingSpaceRepository.exists(parkingSpaceId)){
            return Message.create(RequestCode.SUCCESS,"",null);
        }else{
            return Message.create(RequestCode.ERROR,"删除失败,请联系管理员",null);
        }
    }

    @Override
    public Message get(String parkingSpaceId) {
        ParkingSpace parkingSpace = parkingSpaceRepository.findOne(parkingSpaceId);
        return Message.create(RequestCode.SUCCESS,"",parkingSpace);
    }

    @Override
    public Message findAll() {
        List<ParkingSpace> list = parkingSpaceRepository.findAll();
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    public Message findAllByCaeparkingId(String carparkingId) {
        List<ParkingSpace> list = parkingSpaceRepository.findAllByParkingId(carparkingId);
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    @Transactional
    public Message updateParkingSpaceInfo(String parkingSpaceId, String carno, Integer spacestate)  {
        String errorMsg;
        try{
            ParkingSpace parkingSpace = parkingSpaceRepository.findOne(parkingSpaceId);
            parkingSpace.setCarNo(carno);
            parkingSpace.setSpaceState(spacestate);
            if(spacestate.equals(ParkingSpaceState.OCCUPATION.getValue())){
                parkingSpace.setLastStopTime(new Date());
            }else if(spacestate.equals(ParkingSpaceState.FREE.getValue())){
                parkingSpace.setFrequency(parkingSpace.getFrequency()+1);
                parkingSpace.setLastLeaveTime(new Date());
            }
//            parkingSpaceRepository.save(parkingSpace);

            Carparking carparking = carparkRepository.findOne(parkingSpace.getParkingId());
            if(spacestate.equals(ParkingSpaceState.FREE.getValue())){
                carparking.setUsedNum(carparking.getUsedNum()-1);
            }else{
                carparking.setUsedNum(carparking.getUsedNum()+1);
            }
//            carparkRepository.save(carparking);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("lastLeaveTime",parkingSpace.getLastLeaveTime());
            jsonObject.put("lastStopTime",parkingSpace.getLastStopTime());
            return Message.create(RequestCode.SUCCESS,"",jsonObject);
        }catch (Exception e){
            logger.error("updateParkingSpaceInfo fail!!!",e);
            errorMsg = e.getMessage();
        }
        return Message.create(RequestCode.ERROR,errorMsg,null);
    }
}
