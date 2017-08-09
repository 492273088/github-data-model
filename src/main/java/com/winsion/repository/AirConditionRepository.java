package com.winsion.repository;

import com.winsion.entity.AirCondition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:34
 **/
public interface AirConditionRepository extends JpaRepository<AirCondition, String> {

    List<AirCondition> findAllByAreaId(String areaId);
}
