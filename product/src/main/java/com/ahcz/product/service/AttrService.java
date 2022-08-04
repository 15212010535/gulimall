package com.ahcz.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 11:04:32
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

