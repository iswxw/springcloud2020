package com.wxw.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: wxw
 * @create: 2020-03-24-10:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = -2740161552475307160L;
    private Integer personId;
    private String name;
    private Integer age;
    private  String remark;
}
