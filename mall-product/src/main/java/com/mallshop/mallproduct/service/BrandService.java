package com.mallshop.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:51:59
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

