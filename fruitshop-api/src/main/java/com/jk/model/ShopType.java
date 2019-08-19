package com.jk.model;

import java.io.Serializable;

public class ShopType implements Serializable {
    private Integer id;

    private String typename;

    private Integer pid;

    private Integer typestate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTypestate() {
        return typestate;
    }

    public void setTypestate(Integer typestate) {
        this.typestate = typestate;
    }
}