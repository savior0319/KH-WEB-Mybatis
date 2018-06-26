<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
</head>
<body>
	<h1>Mybatis 페이지</h1>
	1. <a href="/mybatistest1">mybatis를 이용한 insert 해보기</a>
</br>
</br>
<form action="/mybatistest2" method="POST">
	2. 이름값 넘겨서 insert 해보기
	<br>
	이름 : <input type="text" name="studentName" placeholder="이름 입력">
	<input type="submit"value="전송">
</form>
<br>
3. 여러개의 정보 값 넘겨줘서 insert 해보기
<form action="mybatistest3" method="POST">
	이름 : <input type="text" name="studentName" value="" placeholder="이름 입력"><br>
	전화번호 : <input type="text" name="studentTel" value="" placeholder="전화번호 입력"><br>
	이메일 : <input type="text" name="studentEmail" value="" placeholder="이메일 입력"><br>
	주소 : <input type="text" name="studentAddr" value="" placeholder="주소 입력"><br>
	<input type="submit" name="" value="전송">
</form>
</body>
</html>
