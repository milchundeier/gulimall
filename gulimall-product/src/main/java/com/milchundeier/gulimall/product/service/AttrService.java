package com.milchundeier.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milchundeier.common.utils.PageUtils;
import com.milchundeier.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

