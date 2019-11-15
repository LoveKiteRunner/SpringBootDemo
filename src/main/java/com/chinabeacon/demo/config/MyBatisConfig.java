package com.chinabeacon.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.chinabeacon.demo.mbg.mapper","com.chinabeacon.demo.dao"})
public class MyBatisConfig {
}
