package com.ahcz.coupon.dao;

import com.ahcz.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 15:54:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
