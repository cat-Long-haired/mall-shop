package com.mallshop.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallshop.common.utils.PageUtils;
import com.mallshop.mallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author mallshop
 * @email 12138@mallshop.com
 * @date 2021-02-26 12:57:33
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

