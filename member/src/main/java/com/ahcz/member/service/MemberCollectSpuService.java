package com.ahcz.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:11:10
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

