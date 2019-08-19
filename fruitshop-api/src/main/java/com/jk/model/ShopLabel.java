package com.jk.model;

import java.io.Serializable;

public class ShopLabel implements Serializable {
    private Integer id;

    private String labelname;

    private String labelinfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname == null ? null : labelname.trim();
    }

    public String getLabelinfo() {
        return labelinfo;
    }

    public void setLabelinfo(String labelinfo) {
        this.labelinfo = labelinfo == null ? null : labelinfo.trim();
    }
}