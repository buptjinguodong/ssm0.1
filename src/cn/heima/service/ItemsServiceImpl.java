package cn.heima.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.heima.dao.ItemsMapper;
import cn.heima.pojo.Items;
import cn.heima.pojo.ItemsExample;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	ItemsMapper itemsMapper;
	
	@Override
	public List<Items> list() {
		// TODO Auto-generated method stub
		ItemsExample example = new ItemsExample();
		List<Items> itemsList = itemsMapper.selectByExampleWithBLOBs(example);
		return itemsList;
	}

	@Override
	public Items getItemById(int id) {
		ItemsExample example = new ItemsExample();
		Items item = itemsMapper.selectByPrimaryKey(id);
		return item;
	}

	@Override
	public Integer update(Items item) {
		return itemsMapper.updateByPrimaryKeyWithBLOBs(item);
	}

	@Override
	public void updateAll(List<Items> itemList) {
		for(int i=0; i<itemList.size(); i++){
			itemsMapper.updateByPrimaryKeyWithBLOBs(itemList.get(i));
		}
		
	}
	
}
