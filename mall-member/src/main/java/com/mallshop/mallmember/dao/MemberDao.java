package com.mallshop.mallmember.dao;

import com.mallshop.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:57:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
