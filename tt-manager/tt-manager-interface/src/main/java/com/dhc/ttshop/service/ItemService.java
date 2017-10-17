package com.dhc.ttshop.service;

import com.dhc.ttshop.pojo.po.TbItem;

/**
 * User: DHC
 * Date: 2017/10/17
 * Time: 10:16
 * Version:V1.0
 * 商品实体类的业务逻辑层接口
 */
public interface ItemService {
    TbItem getById(Long itemId);
}
