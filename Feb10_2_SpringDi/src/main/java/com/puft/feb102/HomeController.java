package com.puft.feb102;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//Spring : Java에서 IoC로 DI해주는 Framework
//      기존 : 객체를 .java에서 만들었었음
//      Spring : 객체를 외부파일(.xml)에 만들기
//           => .java에서 불러서 사용하게끔함

// 제어의 역전 (Inversion of Control)은 디자인 패턴 중 하나
// 프로그램의 제어 흐름을 직접 제어하는 것이 아니라
// 외부 (파일)에서 관리하는 것
// 의존성 주입(Dependency Injection)은 IoC패턴을 달성하는 방법
// 객체를 직접 생성하거나 관리하지 않고 외부에서 주입받는 것



@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		

		
		return "home";
	}
	
}
