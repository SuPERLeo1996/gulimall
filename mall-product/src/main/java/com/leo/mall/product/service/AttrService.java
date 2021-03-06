package com.leo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leo.common.utils.PageUtils;
import com.leo.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author leo
 * @email 
 * @date 2020-06-02 22:11:01
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

