package com.dhc.ttshop.web;

import com.dhc.ttshop.pojo.po.TbItem;
import com.dhc.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: chenbo
 * Date: 2017/10/20
 * Time: 20:57
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class ItemAction {
    @Autowired
    private ItemService ser;

    @ResponseBody
    @RequestMapping(value="/item/{itemId}",method= RequestMethod.GET)
    public TbItem getById(@PathVariable Long itemId) {
        return ser.getById(itemId);
    }

    @RequestMapping("/items")
    public List<TbItem> listItems() {
        return ser.listItems();
    }
}
