package com.chen.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cgh
 * @create 2021-11-09 17:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    /*T代表一些对象，可以用data传递*/
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
