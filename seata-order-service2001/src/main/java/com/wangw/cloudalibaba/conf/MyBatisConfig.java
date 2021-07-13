package com.wangw.cloudalibaba.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 19:19
 */
@Configuration
@MapperScan({"com.wangw.cloudalibaba.dao"})
public class MyBatisConfig {
}
