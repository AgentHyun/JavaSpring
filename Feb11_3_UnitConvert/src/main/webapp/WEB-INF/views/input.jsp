<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <!-- input 1개,
  <select> / <option> 4개
  cm -> inch
  ㎡ -> 평
  ℃ -> ℉
  mi/h -> km/h
  버튼 1개
  를 form으로 감싸기
  
  input에 숫자하나 입력하고 특정 <option> 고른 후에
  버튼을 누르면 unit.covert로 GET방식 요청 
  => 단위 변환을 해서
  
  
   -->
   <form action = "unit.convert">
    숫자 : <input name = "input"> <br>
   <select name = "option">
   
   <option value = "cm">길이 :  cm -> inch </option>
   <option value = "cel">온도  :   ℃ -> ℉</option>
   <option value = "m">넓이 :  ㎡ -> 평 </option>
   <option value = "speed">속도 : mi/h -> km/h </option>
   
   </select>
   <button>변환</button>
   </form>
</body>
</html>