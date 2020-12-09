package com.wang.entity;

import java.util.Date;

public class WfeProcInstTaskNodeHistory {
    private Long id;

    private String instNo;

    private String defNo;

    private String relativeDefNo;

    private String taskNo;

    private Integer sortOrder;

    private String prevTaskNo;

    private String nextTaskNo;

    private String createBy;

    private Date createTime;

    private String comment;

    private Byte status;

    private Byte deleteFlag;

    private Date upateTime;

    private String tenantNo;

    private String bizNo;

    private String procDefName;

    private String updateBy;

    private String creatorName;

    private String updatorName;

    private String stepname;

    private String nextApprovalName;

    private Byte defType;

    private String invalidName;

    private String invalidType;

    private String bizCreateName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo == null ? null : instNo.trim();
    }

    public String getDefNo() {
        return defNo;
    }

    public void setDefNo(String defNo) {
        this.defNo = defNo == null ? null : defNo.trim();
    }

    public String getRelativeDefNo() {
        return relativeDefNo;
    }

    public void setRelativeDefNo(String relativeDefNo) {
        this.relativeDefNo = relativeDefNo == null ? null : relativeDefNo.trim();
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getPrevTaskNo() {
        return prevTaskNo;
    }

    public void setPrevTaskNo(String prevTaskNo) {
        this.prevTaskNo = prevTaskNo == null ? null : prevTaskNo.trim();
    }

    public String getNextTaskNo() {
        return nextTaskNo;
    }

    public void setNextTaskNo(String nextTaskNo) {
        this.nextTaskNo = nextTaskNo == null ? null : nextTaskNo.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getUpateTime() {
        return upateTime;
    }

    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }

    public String getTenantNo() {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo == null ? null : tenantNo.trim();
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getProcDefName() {
        return procDefName;
    }

    public void setProcDefName(String procDefName) {
        this.procDefName = procDefName == null ? null : procDefName.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName == null ? null : updatorName.trim();
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public String getNextApprovalName() {
        return nextApprovalName;
    }

    public void setNextApprovalName(String nextApprovalName) {
        this.nextApprovalName = nextApprovalName == null ? null : nextApprovalName.trim();
    }

    public Byte getDefType() {
        return defType;
    }

    public void setDefType(Byte defType) {
        this.defType = defType;
    }

    public String getInvalidName() {
        return invalidName;
    }

    public void setInvalidName(String invalidName) {
        this.invalidName = invalidName == null ? null : invalidName.trim();
    }

    public String getInvalidType() {
        return invalidType;
    }

    public void setInvalidType(String invalidType) {
        this.invalidType = invalidType == null ? null : invalidType.trim();
    }

    public String getBizCreateName() {
        return bizCreateName;
    }

    public void setBizCreateName(String bizCreateName) {
        this.bizCreateName = bizCreateName == null ? null : bizCreateName.trim();
    }
}