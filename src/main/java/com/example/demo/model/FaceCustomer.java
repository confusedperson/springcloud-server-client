package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class FaceCustomer implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -6710336380190231852L;

	private Integer id;

    private Boolean gender;

    private Integer age;

    private Float smileValue;

    private String glass;

    private String emotion;

    private String ethnicity;

    private Float beauty;

    private String faceToken;

    private Date createTime;

    private Integer depId;

    private Integer enterpriseId;

    private String deviceMac;

    private String faceUrl;

    private Boolean isOssUrl;

    private Integer userId;

    private Date receptionTime;

    private Integer isValid;

    private Float faceQuality;

    private String skinstatus;

    private Float faceQualityThreshold;

    private String headpose;

    private Boolean isError;

    private Integer vipId;

    private Integer regType;

    private String errorReason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSmileValue() {
        return smileValue;
    }

    public void setSmileValue(Float smileValue) {
        this.smileValue = smileValue;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass == null ? null : glass.trim();
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion == null ? null : emotion.trim();
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity == null ? null : ethnicity.trim();
    }

    public Float getBeauty() {
        return beauty;
    }

    public void setBeauty(Float beauty) {
        this.beauty = beauty;
    }

    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken == null ? null : faceToken.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac == null ? null : deviceMac.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public Boolean getIsOssUrl() {
        return isOssUrl;
    }

    public void setIsOssUrl(Boolean isOssUrl) {
        this.isOssUrl = isOssUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(Date receptionTime) {
        this.receptionTime = receptionTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Float getFaceQuality() {
        return faceQuality;
    }

    public void setFaceQuality(Float faceQuality) {
        this.faceQuality = faceQuality;
    }

    public String getSkinstatus() {
        return skinstatus;
    }

    public void setSkinstatus(String skinstatus) {
        this.skinstatus = skinstatus == null ? null : skinstatus.trim();
    }

    public Float getFaceQualityThreshold() {
        return faceQualityThreshold;
    }

    public void setFaceQualityThreshold(Float faceQualityThreshold) {
        this.faceQualityThreshold = faceQualityThreshold;
    }

    public String getHeadpose() {
        return headpose;
    }

    public void setHeadpose(String headpose) {
        this.headpose = headpose == null ? null : headpose.trim();
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getRegType() {
        return regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason == null ? null : errorReason.trim();
    }
}