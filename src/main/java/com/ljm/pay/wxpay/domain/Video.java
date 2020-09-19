package com.ljm.pay.wxpay.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 视频表
 */
public class Video implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    private String title;
    private String summary;
    private String converImg;
    private Integer viewNum;
    private double price;
    private java.sql.Timestamp createTime;
    private Integer online;
    private double point;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public String getConverImg() {
        return converImg;
    }

    public void setConverImg(String converImg) {
        this.converImg = converImg;
    }


    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public java.sql.Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }


    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

}
