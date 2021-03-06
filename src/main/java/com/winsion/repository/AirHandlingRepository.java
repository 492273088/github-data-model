package com.winsion.repository;

import com.winsion.entity.AirHandling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:52
 **/
public interface AirHandlingRepository extends JpaRepository<AirHandling, String> {
    List<AirHandling> findAllByAreaid(String areaId);
}
