package com.milchundeier.gulimall.product.dao;

import com.milchundeier.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 20:28:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
