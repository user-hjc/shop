package com.jk.model;

import java.io.Serializable;

public class UserLevel implements Serializable {
    private Integer id;

    private String levelname;

    private Integer scoremax;

    private Integer scoremin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public Integer getScoremax() {
        return scoremax;
    }

    public void setScoremax(Integer scoremax) {
        this.scoremax = scoremax;
    }

    public Integer getScoremin() {
        return scoremin;
    }

    public void setScoremin(Integer scoremin) {
        this.scoremin = scoremin;
    }
}