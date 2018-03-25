package com.heima.test;


import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cn.heima.pojo.Items;
import cn.heima.service.ItemsService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ApplicationContext-dao.xml","classpath:ApplicationContext-service.xml","classpath:ApplicationContext-trans.xml"})
public class TestItemService {
	@Autowired
	private ItemsService itemsService;
	
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@Test
	public void hasItem(){
		List<Items> listItem = itemsService.list();
		System.out.println(gson.toJson(listItem));
		
		assertTrue(listItem.size() > 0);
	}
}
