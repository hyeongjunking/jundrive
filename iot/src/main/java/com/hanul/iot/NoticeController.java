package com.hanul.iot;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	
	//공지글목록화면 요청
	@RequestMapping("/list.no")
	public String list(HttpSession session) {
		session.setAttribute("category", "no");
		//DB에서 공지글목록을 조회해와
		//화면에서 출력 할 수 있도록 
		return "notice/list";
	}

}
