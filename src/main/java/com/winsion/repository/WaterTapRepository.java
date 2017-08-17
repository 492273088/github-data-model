package com.winsion.repository;

import com.winsion.entity.WaterTap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/11/14:30
 **/
public interface WaterTapRepository extends JpaRepository<WaterTap, String> {
    List<WaterTap> findAllByAreaId(String areaId);

}
