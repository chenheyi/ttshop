package com.dhc.common.dto;

/**
 *  专门用于easyui的datagrid通用分页类(请求参数)
 * User: chenbo
 * Date: 2017/10/22
 * Time: 17:34
 * Version:V1.0
 */
public class Page {
    private int page;
    private int rows;
    //private int offSet;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOffset() {
        return (page-1)*rows;
    }


    public int getRows() {

        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
