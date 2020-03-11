package cn.itspring.cloud.mapper;

import cn.itspring.cloud.entity.po.PaymentPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public int create(PaymentPO paymentPO);

    public PaymentPO getPaymentById(@Param("id") Long id);

}
