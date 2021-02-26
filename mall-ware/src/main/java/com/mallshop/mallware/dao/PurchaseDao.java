package com.mallshop.mallware.dao;

import com.mallshop.mallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:58:53
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
