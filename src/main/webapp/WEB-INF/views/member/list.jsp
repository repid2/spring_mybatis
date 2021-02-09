<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록 리스트</title>
</head>
<body>
	<div>
		<table border="1" width="700px">
			<thead>
				<tr>
					<th colspan="10">회원목록</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${dto.userId}</td>
						<td>${dto.userName}</td>
						<td>${dto.userEmail}</td>
						<td>${dto.userPhone}</td>
						<td>${dto.userGender}</td>
						<td>${dto.userRegDate}</td>
						<td>${dto.userUpdateDate}</td>
						<td><span class="user_mod">수정</span></td>
						<td><span class="user_del">삭제</span></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>