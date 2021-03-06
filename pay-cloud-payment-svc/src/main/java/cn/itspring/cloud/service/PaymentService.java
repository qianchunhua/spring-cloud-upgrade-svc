package cn.itspring.cloud.service;

import cn.itspring.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/***
 * PaymentService
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
