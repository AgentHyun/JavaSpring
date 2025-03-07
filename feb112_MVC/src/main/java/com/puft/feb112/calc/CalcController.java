package com.puft.feb112.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 새 패키지를 만들때는 top-level-package 뒤에 추가!

@Controller
public class CalcController {

	// 1.jsp 스타일 - 파일업로드, 날짜, .... => spring을 사용한다고 거르기 x
	
	// 요청 파라미터 : String => 필요하다면 형변환해서 사용
	
//	@RequestMapping(value = "/calculate.do", method = RequestMethod.GET)
//	public String calcXY(HttpServletRequest req) {
//		int x = Integer.parseInt(req.getParameter("x"));
//		int y = Integer.parseInt(req.getParameter("y"));
//		System.out.println(x);
//		System.out.println(y);
//		return "jsp/index";
//	}
	
	//GET방식 요청파라미터에(주소에...) 한글처리
	//       : Tomcat 설정 (server.xml)
	//       자동으로 인코딩할 때 어떤 방식을 쓸지(65번줄)
	//       UROIEncoding="UTF-8"
	
	// POST방식 요청파라미터에(서버내부로...) 한글처리
	//      : 프로젝트 설정
	//       JSP : 파라미터값 읽기 전에 req.setCharacterEncoding("UTF-8");
	//       Spring : web.xml에 설정
	
	
    // 2. Spring 스타일(한글 넣으면 안나옴)
//	@RequestMapping(value = "calculate.do", method = RequestMethod.POST)
//	public String calcXY(@RequestParam(value="n") String n,
//			@RequestParam(value="x") int x,
//			@RequestParam(value="y") int y) {
//		System.out.println(n);
//		System.out.println(x);
//		System.out.println(y);
//		return "jsp/index";
//		
//	}
	
	
//3. Spring 스타일 2
	
	
	//servlet-context.xml에 등록된
	//CalcDAO객체와 자동으로 연결!
	@Autowired
	private CalcDAO cDAO;
	
	@RequestMapping(value = "calculate.do", method = RequestMethod.POST)
	public String calcXY(CalcResult cr, HttpServletRequest req) {
		
		cDAO.calculate(cr, req);
		
		
		return "jsp/index";
	}
	
	
	
	
	
}
