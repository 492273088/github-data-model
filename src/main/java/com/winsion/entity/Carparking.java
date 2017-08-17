package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 停车场实体
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_carparking")
public class Carparking extends BaseEntity {

    /**
     * 地区id
     * */
    @Column(name = "areaid")
    private String areaId;

    /**
     * 停车场名称
     * */
    @Column(name = "parkingname")
    private String parkingName;

    /**
     * 车位总数量
     * */
    @Column(name = "spacenum")
    private Integer spaceNum;

    /**
     * 车位使用数量
     * */
    @Column(name = "usednum")
    private Integer usedNum;

    public Carparking(){}

    public Carparking(String areaid, String parkingname) {
        Carparking carparking = new Carparking();
        carparking.setAreaId(areaid);
        carparking.setParkingName(parkingname);
        carparking.setCtime(new Timestamp(System.currentTimeMillis()));
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public Integer getSpaceNum() {
        return spaceNum;
    }

    public void setSpaceNum(Integer spaceNum) {
        this.spaceNum = spaceNum;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    @Override
    public String toString() {
        return "Carparking{" + "areaId='" + areaId + '\'' + ", parkingName='" + parkingName + '\'' + ", spaceNum=" + spaceNum + ", usedNum=" + usedNum + '}';
    }
}
