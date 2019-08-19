package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

    private   Integer  id;
    private   String  commname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private   Date    commdate;
    private   String  commcontent;
    private   String  shopname;
    private   Integer commstr;

    public Integer getCommstr() {
        return commstr;
    }

    public void setCommstr(Integer commstr) {
        this.commstr = commstr;
    }

    public Integer getId() {
        return id;
    }

    public String getCommname() {
        return commname;
    }

    public Date getCommdate() {
        return commdate;
    }

    public String getCommcontent() {
        return commcontent;
    }

    public String getShopname() {
        return shopname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCommname(String commname) {
        this.commname = commname;
    }

    public void setCommdate(Date commdate) {
        this.commdate = commdate;
    }

    public void setCommcontent(String commcontent) {
        this.commcontent = commcontent;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commname='" + commname + '\'' +
                ", commdate=" + commdate +
                ", commcontent='" + commcontent + '\'' +
                ", shopname='" + shopname + '\'' +
                '}';
    }
}
