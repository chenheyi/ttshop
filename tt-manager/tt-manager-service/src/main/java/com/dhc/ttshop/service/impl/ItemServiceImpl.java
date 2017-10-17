package com.dhc.ttshop.service.impl;

import com.dhc.ttshop.dao.TbItemMapper;
import com.dhc.ttshop.pojo.po.TbItem;
import com.dhc.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: DHC
 * Date: 2017/10/17
 * Time: 10:18
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemDao;

    @Override
    public TbItem getById(Long itemId) {
        return itemDao.selectByPrimaryKey(itemId);
    }
}
