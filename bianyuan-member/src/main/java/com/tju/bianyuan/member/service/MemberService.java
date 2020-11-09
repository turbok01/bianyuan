package com.tju.bianyuan.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tju.common.utils.PageUtils;
import com.tju.bianyuan.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xgh
 * @email 794707072@qq.com
 * @date 2020-11-06 19:15:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

