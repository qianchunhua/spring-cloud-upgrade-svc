package cn.itspring.cloud.controller;


import cn.itspring.cloud.entity.po.PaymentPO;
import cn.itspring.cloud.entity.vo.PayResultVO;
import cn.itspring.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * (Payment)表控制层
 * @author qianchunhua
 * @since 2020-03-07 20:24:57
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payMent/create")
    public PayResultVO create(PaymentPO paymentPO) {
        int result = paymentService.create(paymentPO);
        log.info("*****插入结果："+result);
        if (result > 0) {
            return new PayResultVO(200, "插入数据库成功,serverPort: ",result);
        } else {
            return new PayResultVO(444, "插入数据库失败" ,null);
        }

    }


    @GetMapping(value = "/payMent/get/{id}")
    public PayResultVO getPaymentById(@PathVariable("id") Long id) {
        PaymentPO payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：" + payment);
        if (payment != null) {
            return new PayResultVO(200,"查询成功,serverPort:  ", payment);
        } else {
            return new PayResultVO(444,"没有对应记录,查询ID: " + id, null);
        }

    }



}
