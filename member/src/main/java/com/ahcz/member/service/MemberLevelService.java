package com.ahcz.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:11:10
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

