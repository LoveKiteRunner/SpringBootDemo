package com.chinabeacon.demo.service;

import com.chinabeacon.demo.mbg.model.Sysuser;

public interface SysuserService {
    Sysuser findByUserName(String userName);
}
