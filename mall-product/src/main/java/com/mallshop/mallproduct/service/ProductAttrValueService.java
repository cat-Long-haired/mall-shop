package com.mallshop.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:51:58
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

