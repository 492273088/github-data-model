package com.winsion.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/8/15:39
 **/
@MappedSuperclass
public class BaseEntity implements Serializable {
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
}
