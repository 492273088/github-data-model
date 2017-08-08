package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "c_carparking")
@DynamicInsert
@DynamicUpdate
public class Carparking {

    @Id
    @Column(
            nullable = false,
            unique = true
    )
    private String id = UUID.randomUUID().toString().replace("-", "");

    @Version
    @Column
    private int ver;

    @Column
    private Timestamp ctime;

    @Column
    private Timestamp utime;

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
     * 车位数量
     * */
    @Column(name = "spacenum")
    private Integer spaceNum;

    /**
     * 车位使用数量
     * */
    @Column(name = "usednum")
    private Integer usedNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
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
        return "Carparking{" + "id='" + id + '\'' + ", ver=" + ver + ", ctime=" + ctime + ", utime=" + utime + ", areaId='" + areaId + '\'' + ", parkingName='" + parkingName + '\'' + ", spaceNum=" + spaceNum + ", usedNum=" + usedNum + '}';
    }
}
