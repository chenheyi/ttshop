package com.dhc.ttshop.dao;

import com.dhc.common.dto.Page;
import com.dhc.ttshop.pojo.po.TbItem;

import java.util.List;

/**
 * User: chenbo
 * Date: 2017/10/22
 * Time: 19:46
 * Version:V1.0
 */
public interface TbItemCustomMapper {
   long countItems();
   List<TbItem> listItemByPage(Page page);

}
