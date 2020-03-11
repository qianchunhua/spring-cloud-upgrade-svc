package cn.itspring.cloud.service.impl;

import cn.itspring.cloud.entity.po.PaymentPO;
import cn.itspring.cloud.mapper.PaymentMapper;
import cn.itspring.cloud.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public int create(PaymentPO paymentPO) {
        return paymentMapper.create(paymentPO);
    }

    @Override
    public PaymentPO getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
