<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<h3>팀전적</h3>
		<table border="1px">
			<thead>
				<tr>
					<th>클랜명</th>
					<th>등급코드</th>
					<th>게시물코드</th>
					<th>전적</th>
					<th>승리</th>
					<th>패배</th>
					<th>점수</th>
					<th>관리</th>
				</tr>
			</thead>
			
			<tbody>
			<c:if test="${list.size() < 1 }">
				<tr>
					<td colspan="10">등록 된 팀 전적이 없습니다</td>
				</tr>
			</c:if>
			
			<c:forEach items="${list}" var="item">
				<tr>
					<td>${item.clanName }</td>
					<td>${item.tierCode }</td>
					<td>${item.clanCode }</td>
					<td>${item.clanCount }</td>
					<td>${item.clanWin }</td>
					<td>${item.clanLost }</td>
					<td>${item.clanScore }</td>
					<td><a href="detail?clanName=${item.clanName}">상세보기</a></td>
					<td><a href="update?clanName=${item.clanName}">변경</a>
					<a href="delete?clanName=${item.clanName}">삭제</a></td>
				</tr>
			</c:forEach>	
			</tbody>
		</table>
	</div>
	<div>
		<a href="add">등록</a>
	</div>
</body>
</html>