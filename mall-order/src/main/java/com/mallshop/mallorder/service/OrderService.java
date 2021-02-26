package com.mallshop.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:53:43
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

