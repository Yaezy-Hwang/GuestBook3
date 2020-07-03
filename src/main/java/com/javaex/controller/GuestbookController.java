package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.BookDao;
import com.javaex.vo.GuestVo;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	private BookDao dao = new BookDao();
	
	@RequestMapping("/main")
	public String main(Model model) {
		System.out.println("/guestbook/main");
		
		List<GuestVo> gList = dao.select();

		model.addAttribute("guestlist", gList);

		return "/WEB-INF/views/main.jsp";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute GuestVo guestVo) {
		System.out.println("/guestbook/insert");
		
		dao.insert(guestVo);
		System.out.println(guestVo.toString());
		
		return "redirect: /guestbook3/guestbook/main";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(Model model, @RequestParam("no") int no) {
		System.out.println("/guestbook/deleteForm");
		
		model.addAttribute("no", no);
		
		return "/WEB-INF/views/deleteForm.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("no") int no, @RequestParam("pw") String pw) {
		
		dao.delete(no, pw);
		
		return "redirect: /guestbook3/guestbook/main";
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

}
