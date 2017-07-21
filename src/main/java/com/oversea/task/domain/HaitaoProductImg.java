package com.oversea.task.domain;

import com.oversea.task.enums.Platform;

import java.io.Serializable;
import java.util.Date;

public class HaitaoProductImg implements Serializable {

    private static final long serialVersionUID = 3460598221725112543L;

    // 主键ID
    private Long id;
    // asin
    @NotNull
    private String asinCode;

    //itemId
    private String itemId;

    //cdnId
    private String cdnId;

    // 大图
    @NotNull
    private String imgUrl;

    //中图
    private String MediumImgUrl;


    @NotNull
    private Integer idx;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsinCode() {
        return asinCode;
    }

    public void setAsinCode(String asinCode) {
        this.asinCode = asinCode;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCdnId() {
        return cdnId;
    }

    public void setCdnId(String cdnId) {
        this.cdnId = cdnId;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMediumImgUrl() {
        return MediumImgUrl;
    }

    public void setMediumImgUrl(String mediumImgUrl) {
        MediumImgUrl = mediumImgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HaitaoProductImg)) return false;

        HaitaoProductImg that = (HaitaoProductImg) o;

        if (asinCode != null ? !asinCode.equals(that.asinCode) : that.asinCode != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        return imgUrl != null ? imgUrl.equals(that.imgUrl) : that.imgUrl == null;

    }

    @Override
    public int hashCode() {
        int result = asinCode != null ? asinCode.hashCode() : 0;
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HaitaoProductImg{" +
                "id=" + id +
                ", asinCode='" + asinCode + '\'' +
                ", itemId='" + itemId + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", idx=" + idx +
                '}';
    }
}