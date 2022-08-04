package com.ahcz.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:17:14
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

