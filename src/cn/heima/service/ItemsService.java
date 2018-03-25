package cn.heima.service;

import java.util.List;

import cn.heima.pojo.Items;


public interface ItemsService {

	List<Items> list();
	
	Items getItemById(int id);
	
	Integer update(Items item);

	void updateAll(List<Items> itemList);
}
