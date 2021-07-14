package com.wangw.cloud.service.impl;

import com.wangw.cloud.entities.CommonResult;
import com.wangw.cloud.entities.Payment;
import com.wangw.cloud.service.PaymentService;
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
