package cn.heima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.heima.dao.CmfNavMapper;
import cn.heima.pojo.CmfNav;

@Service("navService")
public class NavServiceImpl implements NavService {

	@Autowired
	CmfNavMapper cmfNavMapper;
	
	@Override
	public List<CmfNav> list() {
		int typeId = 1;
		return cmfNavMapper.list(typeId);
	}

}
