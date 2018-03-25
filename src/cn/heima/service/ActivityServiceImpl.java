package cn.heima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.heima.dao.ActivityAbstractInfoMapper;
import cn.heima.pojo.ActivityAbstractInfo;
import cn.heima.pojo.ActivityAbstractInfoExample;
import cn.heima.pojo.ActivityAbstractInfoExample.Criteria;
import cn.heima.vo.ActivityVo;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityAbstractInfoMapper activityAbstractInfoMapper;
	
	@Override
	public List<ActivityAbstractInfo> list(ActivityVo record) {
		// TODO Auto-generated method stub
		ActivityAbstractInfoExample example = new ActivityAbstractInfoExample();
		Criteria criteria = example.createCriteria();
		
		example.setOrderByClause("tms asc");
		return activityAbstractInfoMapper.selectByExample(example);
	}

	@Override
	public ActivityAbstractInfo getActivityById(int id) {
		// TODO Auto-generated method stub
		return activityAbstractInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addActivity(
			ActivityAbstractInfo activityAbstractInfo) {
		// TODO Auto-generated method stub
		return activityAbstractInfoMapper.insert(activityAbstractInfo);
	}

	@Override
	public int updateActivity(
			ActivityAbstractInfo activityAbstractInfo) {
		// TODO Auto-generated method stub
		return activityAbstractInfoMapper.updateByPrimaryKey(activityAbstractInfo);
	}

	@Override
	public int deleteActivity(ActivityAbstractInfo activityAbstractInfo) {
		// TODO Auto-generated method stub
		return activityAbstractInfoMapper.deleteByPrimaryKey(activityAbstractInfo.getId());
	}

}
