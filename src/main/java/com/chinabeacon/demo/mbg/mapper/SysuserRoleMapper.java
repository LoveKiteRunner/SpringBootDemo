package com.chinabeacon.demo.mbg.mapper;

import com.chinabeacon.demo.mbg.model.SysuserRole;
import com.chinabeacon.demo.mbg.model.SysuserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysuserRoleMapper {
    long countByExample(SysuserRoleExample example);

    int deleteByExample(SysuserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysuserRole record);

    int insertSelective(SysuserRole record);

    List<SysuserRole> selectByExample(SysuserRoleExample example);

    SysuserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysuserRole record, @Param("example") SysuserRoleExample example);

    int updateByExample(@Param("record") SysuserRole record, @Param("example") SysuserRoleExample example);

    int updateByPrimaryKeySelective(SysuserRole record);

    int updateByPrimaryKey(SysuserRole record);
}