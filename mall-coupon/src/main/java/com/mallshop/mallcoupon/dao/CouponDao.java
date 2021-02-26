package com.mallshop.mallcoupon.dao;

import com.mallshop.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:55:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
