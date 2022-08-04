package com.ahcz.product.dao;

import com.ahcz.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 11:04:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
