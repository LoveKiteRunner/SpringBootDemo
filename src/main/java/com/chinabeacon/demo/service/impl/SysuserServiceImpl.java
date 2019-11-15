package com.chinabeacon.demo.service.impl;

import com.chinabeacon.demo.mbg.mapper.SysuserMapper;
import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.mbg.model.SysuserExample;
import com.chinabeacon.demo.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;

public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Override
    public Sysuser findByUserName(String userName) {
//        var example=new SysuserExample();
//        example.createCriteria().andUserNameEqualTo(userName);
//        return sysuserMapper.selectByExample(example);
        return new Sysuser();
    }
}
