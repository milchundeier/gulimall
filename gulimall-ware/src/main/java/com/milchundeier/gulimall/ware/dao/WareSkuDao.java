package com.milchundeier.gulimall.ware.dao;

import com.milchundeier.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:22:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
