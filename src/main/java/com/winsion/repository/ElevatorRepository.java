package com.winsion.repository;

import com.winsion.common.Message;
import com.winsion.entity.Elevator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/10:25
 **/
public interface ElevatorRepository extends JpaRepository<Elevator, String> {
    List<Elevator> findAllByAreaId(String areaId);

}
