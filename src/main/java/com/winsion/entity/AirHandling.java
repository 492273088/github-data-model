package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:52
 **/
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_airhandling")
public class AirHandling extends BaseEntity{

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
     * 设置温度
     * */
    @Column(name = "settemp")
    private Double settemp;

    /**
     *  当前室内温度
     * */
    @Column(name = "indoortemp")
    private Double indoortemp;

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

    public Double getSettemp() {
        return settemp;
    }

    public void setSettemp(Double settemp) {
        this.settemp = settemp;
    }

    public Double getIndoortemp() {
        return indoortemp;
    }

    public void setIndoortemp(Double indoortemp) {
        this.indoortemp = indoortemp;
    }

    @Override
    public String toString() {
        return "AirHandling{" + "deviceno='" + deviceno + '\'' + ", areaid='" + areaid + '\'' + ", runstate=" + runstate + ", settemp=" + settemp + ", indoortemp=" + indoortemp + '}';
    }
}
