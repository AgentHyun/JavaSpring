package com.puft.feb122.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//StudentDAO를 싱글톤으로 만들고 다른곳에서 사용하기 위함
//XML에서 Autowired로 StudentDAO를 Autowired로 끌고 오려면 Service
//어노테이션을 사용해야함
@Service                   
public class StudentDAO {

	@Autowired
	private SqlSession ss;
	
	
	
	
	//연결객체는 sqlSession과 연결되어있음
	//이것은 sqlSessionTemplate 클래스를 사용하고 있음
	//sqlSession의 하위클래스
	// (public class SqlSessionTemplate implements SqlSession)의 구조
	// => SqlSession의 기능은 다 들어있고 뭔가 더 추가됨
	// => 자동연결 / 자동해제 / 자동 commit
	
	public void regStudent(Student s, HttpServletRequest req) {
		try {
			// 연결 - 자동(SqlSessionTemplate 때문에)
			//    - connect, close 필요 X
			// 값을 받아오기 & 객체로 만들기 - Spring이 해결을 자동으로 해줌
			
		    // 내용 출력
			
//			System.out.println(s.getS_name());
//			System.out.println(s.getS_nickname());
			
			//SQL 수행 - MyBatis를 활용
			
			//interface를 가져온다!
		   StudentMapper sm = ss.getMapper(StudentMapper.class);
		   
		   // interface에 있는 abstract method(추상메소드) 호출

		   // -자동-> 연결이 되어있는 mapper.xml의 해당부분이 실행
			if(sm.regStudent(s) == 1) {
				req.setAttribute("r", "학생 등록 성공");
				//ss.commit(); => commit이 자동!
			}
		   
		   
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "학생 등록 실패");
		}
		
		
		
		
		
		
	}
	
	public void getAllStudent(HttpServletRequest req) {
		
		try {
			List<Student> students = ss.getMapper(StudentMapper.class).getAllStudent();
			req.setAttribute("students", students);
			
			//req.setAttribute("students", ss.getMapper(StudentMapper.class).getAllStudent(););
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
}
