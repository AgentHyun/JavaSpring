package com.puft.feb112.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;


//멤버변수 없으면 : static method 기반
// M / DAO에는 게시판 같은 기능을 구현한다면 멤버 변수가 생김
//    =>static기반 method는 포기 => 객체를 만들어서 사용해야 하는데
//    =>새로고침 or 요청 => calculate.do로 요청할 때마다 새로운 cDAO가 생성됨
//    => allCalcCount도 제대로 카운팅 X!

해결방안 : CalcDAO를 singleton처리!
Spring식의 Singleton 처리 방법

@Service // servlet-context.xml에 CalcDAO 객체 하나를 등록해 놓은 효과
public class CalcDAO {

	private int allCalcCount; // 몇 번 계산했는지
	
	//요청파라미터명과 자바빈의 객체의 변수명이 같다면 자동 맵핑
	public void calculate(CalcResult cr, HttpServletRequest req ) {
		allCalcCount++;
		System.out.println("계산횟수 : " + allCalcCount);
		int add = cr.getX() + cr.getY();
		System.out.println(add);
		
		
	}
	
	
}
