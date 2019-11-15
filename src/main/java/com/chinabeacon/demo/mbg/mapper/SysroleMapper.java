package com.chinabeacon.demo.mbg.mapper;

import com.chinabeacon.demo.mbg.model.Sysrole;
import com.chinabeacon.demo.mbg.model.SysroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysroleMapper {
    long countByExample(SysroleExample example);

    int deleteByExample(SysroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    List<Sysrole> selectByExample(SysroleExample example);

    Sysrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExample(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}