package com.mallshop.mallproduct.dao;

import com.mallshop.mallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:51:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
