<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<h1>팀 수정</h1>
		
		<form method="post">
		<div>
			<label>팀명</label>
			<input type="text" value="${item.clanName }">
		</div>
		<div>
			<label>회원 아이디</label>
			<input name="memId" type="text" value="${item.memId }">
		</div>
		<div>
			<button>변경</button>
		</div>
		</form>
	</div>
</body>
</html>