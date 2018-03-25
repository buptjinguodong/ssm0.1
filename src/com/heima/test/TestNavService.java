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

import cn.heima.pojo.CmfNav;
import cn.heima.pojo.Items;
import cn.heima.service.ItemsService;
import cn.heima.service.NavService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ApplicationContext-dao.xml","classpath:ApplicationContext-service.xml","classpath:ApplicationContext-trans.xml"})
public class TestNavService {
	@Autowired
	private NavService navService;
	
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@Test
	public void testList(){
		List<CmfNav> navList = navService.list();
		System.out.println(gson.toJson(navList));
		
		assertTrue(navList.size() > 0);
	}
}
