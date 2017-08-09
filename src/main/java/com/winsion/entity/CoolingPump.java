package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 空调冷却水泵
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:37
 **/
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_coolingpump")
public class CoolingPump extends BaseEntity {

    /**
     * 设备编号
     * */
    @Column(name = "deviceno")
    private String deviceno;

    /**
     * 区域id
     * */
    @Column(name = "areaid")
    private String areaid;

    /**
     * 运行状态
     * 0 正常  1警告 2故障  3停止
     * */
    @Column(name = "runstate")
    private Integer runstate;

    public String getDeviceno() {
        return deviceno;
    }

    public void setDeviceno(String deviceno) {
        this.deviceno = deviceno;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public Integer getRunstate() {
        return runstate;
    }

    public void setRunstate(Integer runstate) {
        this.runstate = runstate;
    }

    @Override
    public String toString() {
        return "CoolingPump{" + "deviceno='" + deviceno + '\'' + ", areaid='" + areaid + '\'' + ", runstate=" + runstate + '}';
    }
}
