package com.kangxu.device.pojo;

import java.util.Date;

public class TDevInfo {
    private Long id;

    private String diDevNo;

    private Long diDepartId;

    private String diDevBrand;

    private String diDevType;

    private String diDevModel;

    private Date diInstallDate;

    private Date diOverDate;

    private String diRemarks;

    private String diBackup1;

    private String diBackup2;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String diStatus;

    private Short deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiDevNo() {
        return diDevNo;
    }

    public void setDiDevNo(String diDevNo) {
        this.diDevNo = diDevNo == null ? null : diDevNo.trim();
    }

    public Long getDiDepartId() {
        return diDepartId;
    }

    public void setDiDepartId(Long diDepartId) {
        this.diDepartId = diDepartId;
    }

    public String getDiDevBrand() {
        return diDevBrand;
    }

    public void setDiDevBrand(String diDevBrand) {
        this.diDevBrand = diDevBrand == null ? null : diDevBrand.trim();
    }

    public String getDiDevType() {
        return diDevType;
    }

    public void setDiDevType(String diDevType) {
        this.diDevType = diDevType == null ? null : diDevType.trim();
    }

    public String getDiDevModel() {
        return diDevModel;
    }

    public void setDiDevModel(String diDevModel) {
        this.diDevModel = diDevModel == null ? null : diDevModel.trim();
    }

    public Date getDiInstallDate() {
        return diInstallDate;
    }

    public void setDiInstallDate(Date diInstallDate) {
        this.diInstallDate = diInstallDate;
    }

    public Date getDiOverDate() {
        return diOverDate;
    }

    public void setDiOverDate(Date diOverDate) {
        this.diOverDate = diOverDate;
    }

    public String getDiRemarks() {
        return diRemarks;
    }

    public void setDiRemarks(String diRemarks) {
        this.diRemarks = diRemarks == null ? null : diRemarks.trim();
    }

    public String getDiBackup1() {
        return diBackup1;
    }

    public void setDiBackup1(String diBackup1) {
        this.diBackup1 = diBackup1 == null ? null : diBackup1.trim();
    }

    public String getDiBackup2() {
        return diBackup2;
    }

    public void setDiBackup2(String diBackup2) {
        this.diBackup2 = diBackup2 == null ? null : diBackup2.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDiStatus() {
        return diStatus;
    }

    public void setDiStatus(String diStatus) {
        this.diStatus = diStatus == null ? null : diStatus.trim();
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }
}