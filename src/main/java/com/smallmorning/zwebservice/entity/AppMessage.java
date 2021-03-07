package com.smallmorning.zwebservice.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
*@Author zzsxzc
*@Date 20:47 2021/3/4
*@Description 产品类
**/
@Component
public class AppMessage implements Serializable {
    private int id;
    private String name;
    private String kind;
    private int isOpenSource;//是否开源
    private int isShow;//是否展示
    private String version;//版本号
    private int downloudCount;//下载量
    private int isNeedDownload;//是否需要下载 webapp不需要下载
    private String shorDescription;//简单描述
    private String imageUrl;//文件描述图片、图标地址
    private String appUrl;//安装包地址 webAPP的话是访问地址
    private String onlineDesUrl;//在线描述Url 指向gitee md文件

    public AppMessage() {
    }

    public AppMessage(int id, String name, String kind, int isOpenSource, int isShow, String version, int downloudCount, int isNeedDownload, String shorDescription, String imageUrl, String appUrl, String onlineDesUrl) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.isOpenSource = isOpenSource;
        this.isShow = isShow;
        this.version = version;
        this.downloudCount = downloudCount;
        this.isNeedDownload = isNeedDownload;
        this.shorDescription = shorDescription;
        this.imageUrl = imageUrl;
        this.appUrl = appUrl;
        this.onlineDesUrl = onlineDesUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int isOpenSource() {
        return isOpenSource;
    }

    public void setOpenSource(int openSource) {
        isOpenSource = openSource;
    }

    public int isShow() {
        return isShow;
    }

    public void setShow(int show) {
        isShow = show;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getdownloudCount() {
        return downloudCount;
    }

    public void setdownloudCount(int downloudCount) {
        this.downloudCount = downloudCount;
    }

    public int isNeedDownload() {
        return isNeedDownload;
    }

    public void setNeedDownload(int needDownload) {
        isNeedDownload = needDownload;
    }

    public String getShorDescription() {
        return shorDescription;
    }

    public void setShorDescription(String shorDescription) {
        this.shorDescription = shorDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getappUrl() {
        return appUrl;
    }

    public void setappUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getOnlineDesUrl() {
        return onlineDesUrl;
    }

    public void setOnlineDesUrl(String onlineDesUrl) {
        this.onlineDesUrl = onlineDesUrl;
    }

    @Override
    public String toString() {
        return "AppMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", isOpenSource=" + isOpenSource +
                ", isShow=" + isShow +
                ", version='" + version + '\'' +
                ", downloudCount=" + downloudCount +
                ", isNeedDownload=" + isNeedDownload +
                ", shorDescription='" + shorDescription + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", appUrl='" + appUrl + '\'' +
                ", onlineDesUrl='" + onlineDesUrl + '\'' +
                '}';
    }
}
