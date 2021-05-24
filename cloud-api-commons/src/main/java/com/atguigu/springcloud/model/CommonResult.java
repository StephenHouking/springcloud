package com.atguigu.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author houjing
 * @create 2021/5/13 13:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer     code;

    private String   message;

    private T           data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
