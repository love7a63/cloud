package com.wangw.cloudalibaba.service.impl;

import com.wangw.cloudalibaba.entities.CommonResult;
import com.wangw.cloudalibaba.entities.Payment;
import com.wangw.cloudalibaba.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: wangwei
 * @date: 2021/7/13 14:27
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
