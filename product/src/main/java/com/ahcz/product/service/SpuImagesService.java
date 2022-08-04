package com.ahcz.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 11:04:32
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

