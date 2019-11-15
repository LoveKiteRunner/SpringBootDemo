package com.chinabeacon.demo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysrolePermission implements Serializable {
    private String id;

    private String syspermissionId;

    private String sysroleId;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSyspermissionId() {
        return syspermissionId;
    }

    public void setSyspermissionId(String syspermissionId) {
        this.syspermissionId = syspermissionId;
    }

    public String getSysroleId() {
        return sysroleId;
    }

    public void setSysroleId(String sysroleId) {
        this.sysroleId = sysroleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", syspermissionId=").append(syspermissionId);
        sb.append(", sysroleId=").append(sysroleId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}