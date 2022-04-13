<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 대결 리스트</title>
</head>
<body>
	<div>
		<h1>개인</h1>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>제목</th>
						<th>작성자</th>
						<th>클랜</th>
						<th>티어</th>
						<th>삭제</th>	
					</tr>
				</thead>
				
				<tbody>
					<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">등록 된 개인 대결이 없습니다</td>
						</tr>
					</c:if>
					<c:forEach items="${list}" var="item" varStatus="status">
						<tr>
							<td>${item.title}</td>
							<td>${item.name}</td>
							<td>${item.clan}</td>
							<td>${item.tier}</td>
							<td>
								<c:if test="${sessionScope.member != null}">
									<a href="delete/${item.i_code}" style="text-decoration:none">삭제</a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="add">등록</a>
		</div>
	</div>
</body>
</html>