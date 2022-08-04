package com.ahcz.ware.dao;

import com.ahcz.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:22:11
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
