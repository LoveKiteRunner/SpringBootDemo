package com.chinabeacon.demo.mbg.mapper;

import com.chinabeacon.demo.mbg.model.Syspermission;
import com.chinabeacon.demo.mbg.model.SyspermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyspermissionMapper {
    long countByExample(SyspermissionExample example);

    int deleteByExample(SyspermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Syspermission record);

    int insertSelective(Syspermission record);

    List<Syspermission> selectByExample(SyspermissionExample example);

    Syspermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Syspermission record, @Param("example") SyspermissionExample example);

    int updateByExample(@Param("record") Syspermission record, @Param("example") SyspermissionExample example);

    int updateByPrimaryKeySelective(Syspermission record);

    int updateByPrimaryKey(Syspermission record);
}