package com.puft.feb122.student;

import java.util.List;

public interface StudentMapper {

	// method 리턴타입을 명시해야함
	// insert / update / delete
	//  => 영향을 받은 데이터 수 - int (리턴타입)
	//  select
	//     결과가 하나 나온다 : resultType객체 (Student)
	//     결과가 여러개 나온다 : List<resultType객체>
	//     (List<Student>)
	
	
	//     학생을 등록하기 위한 추상 메소드
	public abstract int regStudent(Student s);
	//메소드의 이름이 mapper.xml의 id와 같아야함 (중요 ★★★★★ ) 
	
	//파라미터가 들어가는 메소드라면
	// mapper.xml의 parameterType과 맞추기!!!
	
	//select는 List, 나머지는 int형
	public abstract List<Student> getAllStudent();
	//select 태그의 아이디 값과 추상메소드의 이름을 값게해야함
	
}
