package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 冷却塔实体类
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:23
 **/
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_coolingtower")
public class CoolingTower extends BaseEntity {

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

    /**
     * 开机时间
     * */
    @Column(name = "uptime")
    private Date uptime;

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

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "CoolingTower{" + "deviceno='" + deviceno + '\'' + ", areaid='" + areaid + '\'' + ", runstate=" + runstate + ", uptime=" + uptime + '}';
    }
}
