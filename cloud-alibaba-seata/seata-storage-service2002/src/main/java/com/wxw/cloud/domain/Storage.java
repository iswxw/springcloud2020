package com.wxw.cloud.domain;

import lombok.Data;

/**
 * @Author: wxw
 * @create: 2020-06-25-15:38
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}
