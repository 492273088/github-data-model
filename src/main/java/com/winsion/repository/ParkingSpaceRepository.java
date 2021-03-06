package com.winsion.repository;

import com.winsion.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:18
 **/
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, String> {
    List<ParkingSpace> findAllByParkingId(String carparkingId);
}
