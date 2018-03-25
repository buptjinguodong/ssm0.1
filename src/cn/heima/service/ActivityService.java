package cn.heima.service;

import java.util.List;

import cn.heima.pojo.ActivityAbstractInfo;
import cn.heima.pojo.Items;
import cn.heima.vo.ActivityVo;


public interface ActivityService {

	List<ActivityAbstractInfo> list(ActivityVo activityVo);
	
	ActivityAbstractInfo getActivityById(int id);
	
	int addActivity(ActivityAbstractInfo activityAbstractInfo);
	
	int updateActivity(ActivityAbstractInfo activityAbstractInfo);
	
	int deleteActivity(ActivityAbstractInfo activityAbstractInfo);
	
}
