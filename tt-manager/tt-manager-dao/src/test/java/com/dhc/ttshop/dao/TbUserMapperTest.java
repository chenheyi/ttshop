package com.dhc.ttshop.dao;

import com.dhc.ttshop.pojo.po.TbUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: chenbo
 * Date: 2017/10/19
 * Time: 19:51
 * Version:V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TbUserMapperTest {
    @Autowired
    private TbUserMapper userdao;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
       TbUser user = userdao.selectByPrimaryKey(3L);
       System.out.print(user);
    }

}