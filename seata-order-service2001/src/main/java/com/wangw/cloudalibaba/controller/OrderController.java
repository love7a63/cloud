package com.wangw.cloudalibaba.controller;

import com.wangw.cloudalibaba.entities.CommonResult;
import com.wangw.cloudalibaba.entities.Order;
import com.wangw.cloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 19:18
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
