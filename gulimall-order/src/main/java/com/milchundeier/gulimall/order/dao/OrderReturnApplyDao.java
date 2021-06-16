package com.milchundeier.gulimall.order.dao;

import com.milchundeier.gulimall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:19:16
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
