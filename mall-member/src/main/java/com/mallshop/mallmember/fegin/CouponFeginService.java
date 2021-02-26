package com.mallshop.mallmember.fegin;

import com.mallshop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeginService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
