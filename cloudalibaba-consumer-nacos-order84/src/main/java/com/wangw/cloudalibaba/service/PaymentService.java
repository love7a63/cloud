package com.wangw.cloudalibaba.service;

import com.wangw.cloudalibaba.entities.CommonResult;
import com.wangw.cloudalibaba.entities.Payment;
import com.wangw.cloudalibaba.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 11:57
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
