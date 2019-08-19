package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Send implements Serializable {
    private Integer id;

    private Integer orderid;

    private Date sendtime;

    private Integer sendstate;

    private Integer senduser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getSendstate() {
        return sendstate;
    }

    public void setSendstate(Integer sendstate) {
        this.sendstate = sendstate;
    }

    public Integer getSenduser() {
        return senduser;
    }

    public void setSenduser(Integer senduser) {
        this.senduser = senduser;
    }
}