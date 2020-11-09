package com.tju.bianyuan.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tju.common.utils.PageUtils;
import com.tju.bianyuan.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author xgh
 * @email 794707072@qq.com
 * @date 2020-11-06 18:58:35
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

