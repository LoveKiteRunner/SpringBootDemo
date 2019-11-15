package com.chinabeacon.demo.util.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "分页查询请求体")
public class PageRequest {
    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    @ApiModelProperty(value="页码",required=true)
    private  int pageNum;
    @ApiModelProperty(value="每页数量",required=true)
    private int pageSize;
}
