package cn.itspring.cloud.service;


import cn.itspring.cloud.entity.po.PaymentPO;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(PaymentPO paymentPO);

    public PaymentPO getPaymentById(@Param("id") Long id);

}
