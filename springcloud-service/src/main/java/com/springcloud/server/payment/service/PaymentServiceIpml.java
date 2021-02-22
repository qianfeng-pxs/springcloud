package com.springcloud.server.payment.service;

import com.springcloud.common.Payment;
import com.springcloud.server.payment.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceIpml implements PaymentService {

    @Autowired   //@Autowired也可以
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
