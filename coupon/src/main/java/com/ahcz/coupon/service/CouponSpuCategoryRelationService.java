package com.ahcz.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 15:54:48
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

