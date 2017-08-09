package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 空调实体类
 * @Author XiaoLei-Guo
 * @Date 2017/8/9/10:10
 **/
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_airconditioning")
public class AirCondition extends BaseEntity {

    /**
     * 设备编号
     * */
    @Column(name = "deviceno")
    private String deviceNo;

    /**
     * 区域id
     * */
    @Column(name = "areaid")
    private String areaId;

    /**
     * 运行状态
     * 0 正常  1故障 2停機  3斷網 4運行中但故障
     * */
    @Column(name = "runstate")
    private Integer runState;

    /**
     *  工作模式
     *  0 制冷 1制热  2  自动  3 通风
     * */
    @Column(name = "model")
    private Integer model;

    /**
     * 当前温度设置
     * */
    @Column(name = "settemperature")
    private Double setTemperature;

    /**
     * 当前区域室内温度
     * */
    @Column(name = "indoortemp")
    private Double indoorTemp;

    /**
     * 风速等级
     * */
    @Column(name = "windlevel")
    private Integer windLevel;

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Double getSetTemperature() {
        return setTemperature;
    }

    public void setSetTemperature(Double setTemperature) {
        this.setTemperature = setTemperature;
    }

    public Double getIndoorTemp() {
        return indoorTemp;
    }

    public void setIndoorTemp(Double indoorTemp) {
        this.indoorTemp = indoorTemp;
    }

    public Integer getWindLevel() {
        return windLevel;
    }

    public void setWindLevel(Integer windLevel) {
        this.windLevel = windLevel;
    }

    @Override
    public String toString() {
        return "AirCondition{" + "deviceNo='" + deviceNo + '\'' + ", areaId='" + areaId + '\'' + ", runState=" + runState + ", model=" + model + ", setTemperature=" + setTemperature + ", indoorTemp=" + indoorTemp + ", windLevel=" + windLevel + '}';
    }
}
