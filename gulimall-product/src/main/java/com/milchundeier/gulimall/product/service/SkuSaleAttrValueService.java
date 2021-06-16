package com.milchundeier.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milchundeier.common.utils.PageUtils;
import com.milchundeier.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

