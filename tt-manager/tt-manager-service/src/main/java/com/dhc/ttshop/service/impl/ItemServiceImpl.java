package com.dhc.ttshop.service.impl;

import com.dhc.ttshop.dao.TbItemMapper;
import com.dhc.ttshop.pojo.po.TbItem;
import com.dhc.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: chenbo
 * Date: 2017/10/20
 * Time: 21:15
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getById(Long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public List<TbItem> listItems() {
        return tbItemMapper.selectByExample(null);
    }
}
