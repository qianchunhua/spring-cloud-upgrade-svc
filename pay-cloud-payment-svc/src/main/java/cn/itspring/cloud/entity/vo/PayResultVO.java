package cn.itspring.cloud.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayResultVO<T>  {

    // 404 Not found

    private Integer code;
    private String message;
    private T      data;


    public PayResultVO(Integer code,String message){
        this(code,message,null);
    }

}
