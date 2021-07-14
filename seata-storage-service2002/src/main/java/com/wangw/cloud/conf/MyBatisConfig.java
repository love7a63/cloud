package com.wangw.cloud.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 19:19
 */
@Configuration
@MapperScan({"com.wangw.cloud.dao"})
public class MyBatisConfig {
}
