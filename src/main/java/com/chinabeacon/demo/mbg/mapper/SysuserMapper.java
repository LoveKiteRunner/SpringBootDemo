package com.chinabeacon.demo.mbg.mapper;

import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.mbg.model.SysuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysuserMapper {
    long countByExample(SysuserExample example);

    int deleteByExample(SysuserExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    List<Sysuser> selectByExample(SysuserExample example);

    Sysuser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);
}