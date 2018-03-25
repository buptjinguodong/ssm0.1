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
import cn.heima.pojo.CmfNav;
import cn.heima.pojo.Items;
import cn.heima.service.ItemsService;
import cn.heima.service.NavService;
import cn.heima.vo.QueryVo;

@Controller
@RequestMapping("/cmfnav")
public class CmfnavController {
	
	@Autowired
	NavService navService;
	
	@RequestMapping("/navQuery")
	@ResponseBody
	public List<CmfNav> navQuery(@RequestBody CmfNav nav){
		List<CmfNav> navList = navService.list();
		return navList;
	}
}
