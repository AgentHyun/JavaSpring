package com.puft.feb101;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puft.feb101.human.Human;



@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		/*
		 * Dog d = new Dog("개", 3); System.out.println(d.getName());
		 * System.out.println(d.getAge());
		 원래는 이렇게 객체를 만들었다면
		 */
		//feb102beans.xml 불러오기 => xml파일에 등록해놓은 객체
		//AbstractApplicationContext : Bean 객체를 생성하고 관리하는 기능
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("feb102beans.xml");
		//aac가 없어질 때 등록해놓은 객체들을 다 없애라
		aac.registerShutdownHook();
		
		
		//aac없애기
		
		
		Dog d = aac.getBean("d1", Dog.class);
		System.out.println(d);
		Dog d2 = aac.getBean("d2", Dog.class);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println("-----------");
		
		
		Dog d3 = aac.getBean("d3", Dog.class);
		System.out.println(d3.getName());
		System.out.println(d3.getAge());
		System.out.println("-----------");
		
		
		Human h1 = aac.getBean("h1", Human.class);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		
		for(String nn : h1.getNickname()) {
			System.out.println(nn);
		}
		for(String f : h1.getFriend()) {
			System.out.println(f);
			
		}
		
		System.out.println(h1.getFamily().get("아버지"));
		System.out.println(h1.getFamily().get("어머니"));
		System.out.println(h1.getPet().getName());
		System.out.println(h1.getPet().getAge());
		System.out.println(h1.getPet2().getName());
		System.out.println(h1.getPet2().getName());
		System.out.println("----------------------------------------");
		
		aac.close();
		//DI (Dependency Injection - 의존성 주입)
		//    xml에서 객체를 만들고, 속성값 넣고
		//    java에서 가져다 쓰는
		
		
		
		
		return "home";
	}
	
	
	//servlet-context.xml의 <beans>에서
	//prefix인 "/WEB-INF/views/"와
	//메소드에서 리턴한 중간 경로인 "home"과
	//suffix인 ".jsp"가 합쳐져서
	///WEB-INF/view/home.jsp 라는 View파일 경로로 이동해서
	// 클라이언트에게 응답해주는 형태
	
	// @ : Annotation
	// 사전적 의미 : '주석'
	// 코드 사이에 주석처럼 쓰이며 기능을 수행하도록 하는 기술
	// -코드 작성 문법 에러를 체커하도록 정보를 제공
	// 이 개발 툴이 코드를 자동으로 생성할 수 있도록 도와줌
	// 실행시에 특정한 기능을 수행하도록 도와줌
	
	
	//우리 컨셉상 웹 화면에서 값들을 입력받아서 그것들 가지고
	//활욜을 해야 하는데
	//지금 이렇게 고정된 값들을 가지고는 어렵겠죠
	// 그래서 지금과 같은 방식은 특정 기능이나 고정된값으로
	// 활용하고자 할 때 의존성주입을 활용하시면 좋습니다
	
	
	
}
