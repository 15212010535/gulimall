package com.ahcz.order.dao;

import com.ahcz.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:17:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
