package com.milchundeier.gulimall.member.dao;

import com.milchundeier.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Eagle
 * @email lzyphil@gmail.com
 * @date 2021-06-16 22:26:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
