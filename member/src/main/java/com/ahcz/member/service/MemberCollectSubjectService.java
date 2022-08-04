package com.ahcz.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ahcz.common.utils.PageUtils;
import com.ahcz.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author qiu
 * @email qiujinxian1108@gmail.com
 * @date 2022-08-04 16:11:10
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

