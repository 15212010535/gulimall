package com.ahcz.coupon.dao;

import com.ahcz.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 15:54:48
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
