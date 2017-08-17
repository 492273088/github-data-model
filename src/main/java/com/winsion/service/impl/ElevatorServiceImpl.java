package com.winsion.service.impl;

import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.Elevator;
import com.winsion.repository.ElevatorRepository;
import com.winsion.service.ElevatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/10:17
 **/
@Service
public class ElevatorServiceImpl implements ElevatorService {

    @Autowired
    ElevatorRepository elevatorRepository;

    @Override
    public Message findAllByAreaId(String areaId) {
        List<Elevator> list = elevatorRepository.findAllByAreaId(areaId);
        return Message.create(RequestCode.SUCCESS,"",list);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public Message updateElevatorState(String elevatorId,Integer runState) {
        Elevator elevator = elevatorRepository.findOne(elevatorId);
        elevator.setRunState(runState);
//        elevatorRepository.save(elevator);
        return Message.create(RequestCode.SUCCESS,"",null);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public Message setElevatorFloor(String elevatorId, Integer targetfloor) {
        Elevator elevator = elevatorRepository.findOne(elevatorId);
        elevator.setTargetfloor(targetfloor);
        return Message.create(RequestCode.SUCCESS,"",null);
    }

    @Override
    public Message findAll() {
        List<Elevator> list = elevatorRepository.findAll();
        return Message.create(RequestCode.SUCCESS,"",list);
    }
}
