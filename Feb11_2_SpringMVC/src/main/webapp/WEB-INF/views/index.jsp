<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel = "stylesheet" href = "resources/css/input.css">
<script type = "text/javascript" src ="resources/js/index.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
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
      <form>
  <table>
    <tr>
      <td>이름: <input name="name" placeholder = "name" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td>X: <input name="X" placeholder = "X" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td>Y: <input name="Y" placeholder = "Y" autofocus = "autofocus"></td>
    </tr>
    <tr>
      <td><button>버튼</button></td>
    </tr>
  </table>
</form>

</body>
</html>