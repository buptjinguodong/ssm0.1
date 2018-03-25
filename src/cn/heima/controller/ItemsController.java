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
import cn.heima.pojo.Items;
import cn.heima.service.ItemsService;
import cn.heima.vo.QueryVo;

@Controller
@RequestMapping("/item")
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;
	
	@RequestMapping("/list")
	public ModelAndView itemList(){
		List<Items> itemsList = itemsService.list();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("itemList", itemsList);
		modelAndView.setViewName("itemList");
		
		return modelAndView;
	}
	
	@RequestMapping("/edit")
	public String itemEdit(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model){
		String id = request.getParameter("id"); //��ȡid - Get����
		int id_int = Integer.parseInt(id);
		Items item = itemsService.getItemById(id_int); //��ȡid��Ӧ��item�������
		model.addAttribute("item", item);
		
		return "editItem";
	}
	
	@RequestMapping("/updateitem")
	public String updateItem(MultipartFile pictureFile ,Items item, Model model, HttpServletRequest request){
		// ��ȡ�ļ��ϴ��洢Ŀ¼
		String path = request.getSession().getServletContext().getRealPath("pic") + "\\";
		
		System.out.println("path:" + path);
		
		// 1. ��ȡ�ļ����
		String fileName = pictureFile.getOriginalFilename();
		// 2. ʹ�����������ļ����
		String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf('.'));
		// 3. ���ļ��־û���Ӳ��
		try {
			pictureFile.transferTo(new File(path + newFileName));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4. �����ļ��������ݿ�
		item.setPic(newFileName);
		
		
		System.out.println(item.getId() + ":" + item.getName() + ":" + item.getCreatetime() + ":" + item.getDetail() + ":" + item.getPrice());
		
		
		itemsService.update(item);
		
		
		
		model.addAttribute("id", item.getId());
		
		return "redirect:edit.action";
	}
	
	@RequestMapping("/delete")
	public String deleteItems(Integer[] ids){
		System.out.println(ids);
		return "success";
	}
	
	@RequestMapping("/updateAll")
	public String updateAll(QueryVo vo){
		System.out.println(vo.getItemList());
		itemsService.updateAll(vo.getItemList());
		return "success";
	}
	
	//����jackson��jar����controller�ķ����ּ���@RequestBody����springMvc��json��ʽ�ַ�ת��Ϊjava�ֵ�pojo
	//ҳ��json��keyҪ����java�е�pojo���������
	//controller��������pojo���͵Ķ���ʹ��@ResponseBodyע�⣬springMvc���Զ���pojo����ת����json��ʽ�ַ�
	@RequestMapping("/editItem_RequestJson")
	@ResponseBody
	public Items editItemRequestJson(@RequestBody Items item){
		System.out.println(item);
		return item;
	}
	
	@RequestMapping("/itemList_RequestJson")
	@ResponseBody
	public QueryVo itemListRequestJson(@RequestBody Items item){
		List<Items> itemList = itemsService.list();
		QueryVo vo = new QueryVo();
		vo.setItemList(itemList);
		return vo;
	}
	
	@RequestMapping("/itemMnt_RequestJson")
	@ResponseBody
	public QueryVo itemMntRequestJson(@RequestBody Items item){
		List<Items> itemList = itemsService.list();
		QueryVo vo = new QueryVo();
		vo.setItemList(itemList);
		return vo;
	}
}
