package com.ahcz.order.dao;

import com.ahcz.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:17:14
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
