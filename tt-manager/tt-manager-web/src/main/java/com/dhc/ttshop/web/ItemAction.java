package com.dhc.ttshop.web;

import com.dhc.common.dto.Page;
import com.dhc.common.dto.Result;
import com.dhc.ttshop.pojo.po.TbItem;
import com.dhc.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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


    @RequestMapping("/{page}")
    public String  page(@PathVariable String page) {
        return page;
    }

   /* @ResponseBody
    @RequestMapping("/items")
    public List<TbItem> listItems(){
        return ser.listItems();
    }*/

   @ResponseBody
   @RequestMapping("/items")
   public Result<TbItem> listTbItemByPage(Page page) {
       //System.out.println(page);
       return ser.listItemsByPage(page);
   }
}
