package cn.heima.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import cn.heima.dao.ItemsMapper;
import cn.heima.pojo.ActivityAbstractInfo;
import cn.heima.pojo.Items;
import cn.heima.service.ActivityService;
import cn.heima.service.ItemsService;
import cn.heima.vo.ActivityListVo;
import cn.heima.vo.ActivityVo;
import cn.heima.vo.QueryVo;

@Controller
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired
	ActivityService activityService;
	
	@RequestMapping("/editRecordJson")
	@ResponseBody
	public ActivityAbstractInfo editItemRequestJson(@RequestBody ActivityVo record){
		System.out.println("开始执行： record");
		ActivityAbstractInfo result = (ActivityAbstractInfo) record;
		if(record.getSvrTpcd().equalsIgnoreCase("01")){
			// 查询
			System.out.println("开始执行： record-查询");
			if("".equals(record.getId())){
				throw new RuntimeException("record-查询中 id 不可为空");
			}
			result = activityService.getActivityById(record.getId());
			System.out.println("结束执行： record-查询");
		}else if(record.getSvrTpcd().equalsIgnoreCase("02")){
			// 新增
			System.out.println("开始执行： record-新增");
			activityService.addActivity(result);
			System.out.println("执行结束： record-新增");
		}else if(record.getSvrTpcd().equalsIgnoreCase("03")){
			// 修改
			System.out.println("开始执行： record-修改");
			activityService.updateActivity(result);
			System.out.println("执行结束： record-修改");
		}else if(record.getSvrTpcd().equalsIgnoreCase("04")){
			// 删除
			System.out.println("开始执行： record-删除");
			activityService.deleteActivity(result);
			System.out.println("执行结束： record-删除");
		}
		result.setActiName(record.getSvrTpcd());
		return result;
	}
	
	@RequestMapping("/listRecordJson")
	@ResponseBody
	public ActivityListVo listItemRequestJson(@RequestBody ActivityVo record){
		System.out.println("开始执行： listRecord");
		ActivityAbstractInfo result = (ActivityAbstractInfo) record;
		ActivityListVo resultVo = new ActivityListVo();
		
		List<ActivityAbstractInfo> listRecord = activityService.list(record);
		resultVo.setList1(listRecord);
		resultVo.setTotal(listRecord.size());
		return resultVo;
	}
}
