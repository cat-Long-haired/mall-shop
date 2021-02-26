package com.mallshop.mallorder.dao;

import com.mallshop.mallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:53:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
