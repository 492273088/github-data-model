package com.winsion.repository;

import com.winsion.entity.CoolingTower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:33
 **/
public interface CoolingTowerRepository extends JpaRepository<CoolingTower, String> {
    List<CoolingTower> findAllByAreaid(String areaId);
}
