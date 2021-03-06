package com.mallshop.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallproduct.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:51:59
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

