package com.milchundeier.gulimall.coupon.dao;

import com.milchundeier.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:02:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
