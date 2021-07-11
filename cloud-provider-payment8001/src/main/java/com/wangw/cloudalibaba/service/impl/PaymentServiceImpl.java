package com.wangw.cloudalibaba.service.impl;

import com.wangw.cloudalibaba.dao.PaymentDao;
import com.wangw.cloudalibaba.entities.Payment;
import com.wangw.cloudalibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
