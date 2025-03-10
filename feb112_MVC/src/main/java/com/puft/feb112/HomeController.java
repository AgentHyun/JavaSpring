package com.puft.feb112;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//사이트 첫 접속시 method : GET
		//value에는 아무것도 쓰지 않은 상태
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home(Locale locale, Model model) {
	       //String 자료형이 기본
		     
			
			return "jsp/index"; // index.jsp로 포워딩
			
			
			
			
		}
		
		//lalala.test라는 주소로 GET방식 요청이 들어오면
		// '랄랄라~'라는 내용이 콘솔창에 출력되는 메소드

		/*
		 * @RequestMapping(value = "/lalala.test", method = RequestMethod.GET ) public
		 * String lalala(Locale locale, Model model) { return "jsp/lalala"; }
		 */
		
		@RequestMapping(value = "/lalala.test", method = RequestMethod.GET )
		public void testLalala() {
			System.out.println("랄랄라~~");
		}
		
		
		
	}
	

