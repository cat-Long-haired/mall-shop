package com.mallshop.mallproduct.dao;

import com.mallshop.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:51:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
