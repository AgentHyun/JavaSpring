<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action = "student.reg">
 이름 : <input name = "s_name"> <p>
 별명 : <input name = "s_nickname"> <p>
 <button>등록</button>
 
 </form>
 
 <hr>
 <c:forEach var = "s" items = "${students }">
  ${s.s_name } - ${s.s_nickname } <p>
 
 </c:forEach>
 <hr>
 
 <!-- 과목명 input 
 
 시험 날짜 연월일
 select option
 button누르면  db등록
 시험관련 내용 출력
 -->
 <form action = "score.reg">
 과목명 : <input name = "s_name"> <p>

<select name="s_year">
   <c:forEach var="year" begin="2025" end="2035">
        <option value="${year}">${year}</option>
    </c:forEach>
</select>
<select name="s_month">
   <c:forEach var="month" begin="1" end="12">
        <option value="${month}">${month}</option>
    </c:forEach>
</select>
<select name="s_date">
   <c:forEach var="date" begin="1" end="31">
        <option value="${date}">${date}</option>
    </c:forEach>
</select>

 <button> 과목 등록 </button>
 </form>
 
 <hr>
 
  <c:forEach var = "s" items = "${scores }">
  ${s.s_name } - ${s.s_year }년 ${s.s_month }월 ${s.s_date }일  <p>
 
 </c:forEach>
 <hr>
 ${r }
 
</body>
</html>