package com.wangw.cloudalibaba.service;


import com.wangw.cloudalibaba.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
