package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Shop<date> implements Serializable {
    private Integer id;

    private String shopname;

    private Integer shoptype;

    private String shopinfo;

    private Integer shoplabel;

    private Double shopprice;

    private Integer shopnum;

    private String  shopimg;
    private Integer shopstate1;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date    shopdate;
    private  Integer shopstate;
    private  String  shopmanifest;

    public String getShopmanifest() {
        return shopmanifest;
    }

    public void setShopmanifest(String shopmanifest) {
        this.shopmanifest = shopmanifest;
    }

    public Integer getShopstate() {
        return shopstate;
    }

    public void setShopstate(Integer shopstate) {
        this.shopstate = shopstate;
    }

    public Date getShopdate() {
        return shopdate;
    }

    public void setShopdate(Date shopdate) {
        this.shopdate = shopdate;
    }

    //联查字段
    private String labelname;

    private String labelinfo;

    private  String  typename;
    private  String   pid;
    private  Integer  typestate;
    private  String   commname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private  Date     commdate;
    private  String   commcontent;

    public String getCommname() {
        return commname;
    }

    public Date getCommdate() {
        return commdate;
    }

    public String getCommcontent() {
        return commcontent;
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

    public Integer getShopstate1() {
        return shopstate1;
    }

    public void setShopstate1(Integer shopstate1) {
        this.shopstate1 = shopstate1;
    }

    public String getLabelname() {
        return labelname;
    }


    public String getLabelinfo() {
        return labelinfo;
    }

    public String getTypename() {
        return typename;
    }

    public String getPid() {
        return pid;
    }

    public Integer getTypestate() {
        return typestate;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public void setLabelinfo(String labelinfo) {
        this.labelinfo = labelinfo;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setTypestate(Integer typestate) {
        this.typestate = typestate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Integer getShoptype() {
        return shoptype;
    }

    public void setShoptype(Integer shoptype) {
        this.shoptype = shoptype;
    }

    public String getShopinfo() {
        return shopinfo;
    }

    public void setShopinfo(String shopinfo) {
        this.shopinfo = shopinfo == null ? null : shopinfo.trim();
    }

    public Integer getShoplabel() {
        return shoplabel;
    }

    public void setShoplabel(Integer shoplabel) {
        this.shoplabel = shoplabel;
    }

    public Double getShopprice() {
        return shopprice;
    }

    public void setShopprice(Double shopprice) {
        this.shopprice = shopprice;
    }

    public Integer getShopnum() {
        return shopnum;
    }

    public void setShopnum(Integer shopnum) {
        this.shopnum = shopnum;
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg == null ? null : shopimg.trim();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopname='" + shopname + '\'' +
                ", shoptype=" + shoptype +
                ", shopinfo='" + shopinfo + '\'' +
                ", shoplabel=" + shoplabel +
                ", shopprice=" + shopprice +
                ", shopnum=" + shopnum +
                ", shopimg='" + shopimg + '\'' +
                ", labelname='" + labelname + '\'' +
                ", labelinfo='" + labelinfo + '\'' +
                ", typename='" + typename + '\'' +
                ", pid='" + pid + '\'' +
                ", typestate=" + typestate +
                '}';
    }
}