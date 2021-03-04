package com.smallmorning.zwebservice.entity;
/**
*@Author zzsxzc
*@Date 20:47 2021/3/4
*@Description 产品类
**/
public class Project {
    private int id;
    private String name;
    private String kind;
    private boolean isOpenSource;//是否开源
    private boolean isShow;//是否展示
    private String version;//版本号
    private int downloutCount;//下载量
    private boolean isNeedDownload;//是否需要下载 webapp不需要下载
    private String shorDescription;//简单描述
    private String imageUrl;//文件描述图片、图标地址
    private String appPackageUrl;//安装包地址
    private String onlineDesUrl;//在线描述Url 指向gitee md文件

    public Project() {
    }

    public Project(int id, String name, String kind, boolean isOpenSource, boolean isShow, String version, int downloutCount, boolean isNeedDownload, String shorDescription, String imageUrl, String appPackageUrl, String onlineDesUrl) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.isOpenSource = isOpenSource;
        this.isShow = isShow;
        this.version = version;
        this.downloutCount = downloutCount;
        this.isNeedDownload = isNeedDownload;
        this.shorDescription = shorDescription;
        this.imageUrl = imageUrl;
        this.appPackageUrl = appPackageUrl;
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

    public boolean isOpenSource() {
        return isOpenSource;
    }

    public void setOpenSource(boolean openSource) {
        isOpenSource = openSource;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getDownloutCount() {
        return downloutCount;
    }

    public void setDownloutCount(int downloutCount) {
        this.downloutCount = downloutCount;
    }

    public boolean isNeedDownload() {
        return isNeedDownload;
    }

    public void setNeedDownload(boolean needDownload) {
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

    public String getAppPackageUrl() {
        return appPackageUrl;
    }

    public void setAppPackageUrl(String appPackageUrl) {
        this.appPackageUrl = appPackageUrl;
    }

    public String getOnlineDesUrl() {
        return onlineDesUrl;
    }

    public void setOnlineDesUrl(String onlineDesUrl) {
        this.onlineDesUrl = onlineDesUrl;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", isOpenSource=" + isOpenSource +
                ", isShow=" + isShow +
                ", version='" + version + '\'' +
                ", downloutCount=" + downloutCount +
                ", isNeedDownload=" + isNeedDownload +
                ", shorDescription='" + shorDescription + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", appPackageUrl='" + appPackageUrl + '\'' +
                ", onlineDesUrl='" + onlineDesUrl + '\'' +
                '}';
    }
}
