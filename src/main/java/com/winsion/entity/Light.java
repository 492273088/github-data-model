package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:01
 **/
@Entity
@Table(name = "c_light")
@DynamicInsert
@DynamicUpdate
public class Light extends BaseEntity{

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
     * 0 打开  1关闭
     * */
    @Column(name = "runstate")
    private Integer runState;

    /**
     * 警告信息
     * */
    @Column(name = "alarminfo")
    private String alarmInfo;

    /**
     * 照明设备类型
     * 0 灯光 1 传感器
     * */
    @Column(name = "lighttype")
    private Integer lightType;

    /**
     * 传感器数值
     * */
    @Column(name = "sensorvalue")
    private Double sensorValue;

    /**
     * 电压值
     * */
    @Column(name = "voltage")
    private Double voltage;

    /**
     * 电流值
     * */
    @Column(name = "current")
    private Double current;

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

    public String getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    public Integer getLightType() {
        return lightType;
    }

    public void setLightType(Integer lightType) {
        this.lightType = lightType;
    }

    public Double getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(Double sensorValue) {
        this.sensorValue = sensorValue;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "Light{" + "deviceNo='" + deviceNo + '\'' + ", areaId='" + areaId + '\'' + ", runState=" + runState + ", alarmInfo='" + alarmInfo + '\'' + ", lightType=" + lightType + ", sensorValue=" + sensorValue + ", voltage=" + voltage + ", current=" + current + '}';
    }
}
