package com.milchundeier.gulimall.coupon.dao;

import com.milchundeier.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:02:26
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
