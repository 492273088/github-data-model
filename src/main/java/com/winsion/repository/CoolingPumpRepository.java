package com.winsion.repository;

import com.winsion.entity.CoolingPump;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:40
 **/
public interface CoolingPumpRepository extends JpaRepository<CoolingPump, String> {
    List<CoolingPump> findAllByAreaid(String areaId);
}
