package com.wangw.cloudalibaba.dao;

import com.wangw.cloudalibaba.entities.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 19:02
 */
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
