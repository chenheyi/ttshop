package com.dhc.ttshop.service;

import com.dhc.common.dto.Page;
import com.dhc.common.dto.Result;
import com.dhc.ttshop.pojo.po.TbItem;

import java.util.List;

/**
 * User: chenbo
 * Date: 2017/10/20
 * Time: 21:12
 * Version:V1.0
 */
public interface ItemService {
    public TbItem getById(Long itemId);

    List<TbItem> listItems();

    Result<TbItem> listItemsByPage(Page page);
}
