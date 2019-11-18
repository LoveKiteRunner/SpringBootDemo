package com.chinabeacon.demo.service;

import com.chinabeacon.demo.mbg.model.Sysuser;
import org.springframework.stereotype.Service;

@Service
public interface SysuserService {
    Sysuser findByUserName(String userName);
    Sysuser findByUserId(String userId);
}
