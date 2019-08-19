package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;

    private Date ordertime;

    private Integer orderuser;

    private Integer ordershop;

    private Integer ordernum;

    private Double ordermoney;

    private Integer orderstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrderuser() {
        return orderuser;
    }

    public void setOrderuser(Integer orderuser) {
        this.orderuser = orderuser;
    }

    public Integer getOrdershop() {
        return ordershop;
    }

    public void setOrdershop(Integer ordershop) {
        this.ordershop = ordershop;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Double getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(Double ordermoney) {
        this.ordermoney = ordermoney;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }
}