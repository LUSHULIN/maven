package com.aia.test;

import com.aia.dao.ItemsDao;
import com.aia.domain.Items;
import com.aia.service.ItemsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
//        Items items = itemsDao.findById(3);
//        System.out.println(items);

        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(2);
        System.out.println(items);
    }

}
