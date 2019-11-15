package com.chinabeacon.demo.mbg.mapper;

import com.chinabeacon.demo.mbg.model.SysrolePermission;
import com.chinabeacon.demo.mbg.model.SysrolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysrolePermissionMapper {
    long countByExample(SysrolePermissionExample example);

    int deleteByExample(SysrolePermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysrolePermission record);

    int insertSelective(SysrolePermission record);

    List<SysrolePermission> selectByExample(SysrolePermissionExample example);

    SysrolePermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysrolePermission record, @Param("example") SysrolePermissionExample example);

    int updateByExample(@Param("record") SysrolePermission record, @Param("example") SysrolePermissionExample example);

    int updateByPrimaryKeySelective(SysrolePermission record);

    int updateByPrimaryKey(SysrolePermission record);
}