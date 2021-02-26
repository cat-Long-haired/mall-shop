package com.mallshop.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallmember.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:57:33
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

