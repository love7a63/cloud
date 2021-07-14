package com.wangw.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/14 9:38
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
