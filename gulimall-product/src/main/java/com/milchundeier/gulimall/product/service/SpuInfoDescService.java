package com.milchundeier.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milchundeier.common.utils.PageUtils;
import com.milchundeier.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

