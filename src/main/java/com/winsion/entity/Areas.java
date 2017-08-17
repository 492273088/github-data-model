package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:51
 **/
@Entity
@Table(name = "areas")
@DynamicInsert
@DynamicUpdate
public class Areas{

    @Id
    @Column(nullable = false, unique = true, name = "areaid")
    private String areaid = UUID.randomUUID().toString().replace("-", "");

    @Version
    @Column(name = "ver")
    private int ver;

    @Column(name = "ctime")
    private Timestamp ctime;

    @Column(name = "utime")
    private Timestamp utime;

    @Column(name = "number")
    private String number;

    @Column(name = "delflag")
    private String delflag;

    @Column(name = "distinction")
    private String distinction;

    @Column(name = "level")
    private String level;

    @Column(name = "areaname")
    private String areaname;

    @Column(name = "ssid")
    private String ssid;

    @Column(name = "parentid")
    private String parentId;

    @Column(name = "areatypeid")
    private String areaTypeId;

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

    public String getDistinction() {
        return distinction;
    }

    public void setDistinction(String distinction) {
        this.distinction = distinction;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAreaTypeId() {
        return areaTypeId;
    }

    public void setAreaTypeId(String areaTypeId) {
        this.areaTypeId = areaTypeId;
    }

    @Override
    public String toString() {
        return "Areas{" + "areaid='" + areaid + '\'' + ", ver=" + ver + ", ctime=" + ctime + ", utime=" + utime + ", number='" + number + '\'' + ", delflag='" + delflag + '\'' + ", distinction='" + distinction + '\'' + ", level='" + level + '\'' + ", areaname='" + areaname + '\'' + ", ssid='" + ssid + '\'' + ", parentId='" + parentId + '\'' + ", areaTypeId='" + areaTypeId + '\'' + '}';
    }
}
