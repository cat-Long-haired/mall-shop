package com.mallshop.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:58:53
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

