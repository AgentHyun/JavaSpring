<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "resources/css/input.css">
<script type = "text/javascript" src ="resources/js/index.js"></script>
</head>
<body>
  View (V) - <br>
      JSP : .html or .jsp <br>
      Spring Legacy : .jsp <br>
      Spring Boot : .html <br>
      
      Spring 내에서 쓰는 자원 파일들 (css,js, 그림, ...)
      webapp - resources / ... (경로)
      <hr>
      input 3개 => 이름, x, y <br>
      button 하나를 <br>
      form에 담기
      <form action = "calculate.do" method = "post">
  <table>
    <tr>
      <td>이름: <input name="n" placeholder = "name" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td>X: <input name="x" placeholder = "X" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td>Y: <input name="y" placeholder = "Y" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td><button>버튼</button></td>
    </tr>
  </table>
</form>
</body>
</html>