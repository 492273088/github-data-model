package com.winsion.repository;

import com.winsion.entity.Carparking;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/7/18:16
 **/
public interface CarparkRepository extends JpaRepository<Carparking, String> {
}
