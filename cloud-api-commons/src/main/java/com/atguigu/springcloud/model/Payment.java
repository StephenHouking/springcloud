package com.atguigu.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author houjing
 * @create 2021/5/12 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 主键
     */
    private Long id;
    /**
     * 关联用户
     */
    private String name;
}
