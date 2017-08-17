package com.winsion.repository;

import com.winsion.entity.Light;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:21
 **/
public interface LightRepository extends JpaRepository<Light, String> {
    List<Light> findAllByAreaId(String areaId);

}
