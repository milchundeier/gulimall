package com.milchundeier.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milchundeier.common.utils.PageUtils;
import com.milchundeier.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

