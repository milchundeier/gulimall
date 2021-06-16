package com.milchundeier.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.milchundeier.common.utils.PageUtils;
import com.milchundeier.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

