package com.mallshop.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:58:53
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

