package com.milchundeier.gulimall.coupon.dao;

import com.milchundeier.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:02:26
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
