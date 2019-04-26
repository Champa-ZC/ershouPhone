package com.qianfeng.recycle.vo;

public class PhoneBrandVO {

    private String brandName;
    private String type;
    private String phoneImg;
    private Long price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(String phoneImg) {
        this.phoneImg = phoneImg;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhoneBrandVO{" +
                "brandName='" + brandName + '\'' +
                ", type='" + type + '\'' +
                ", phoneImg='" + phoneImg + '\'' +
                ", price=" + price +
                '}';
    }
}
