package com.chinabeacon.demo.service.impl;

import com.chinabeacon.demo.mbg.mapper.SysuserMapper;
import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.mbg.model.SysuserExample;
import com.chinabeacon.demo.service.SysuserService;
import com.chinabeacon.demo.util.ListHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysuserServiceImpl implements SysuserService {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Override
    public Sysuser findByUserName(String userName) {
        SysuserExample example=new SysuserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<Sysuser> sysusers= sysuserMapper.selectByExample(example);
        return ListHelper.firstOrDefault(sysusers,m->true);
    }
    @Override
    public Sysuser findByUserId(String userId){
        return sysuserMapper.selectByPrimaryKey(userId);
    }

}
