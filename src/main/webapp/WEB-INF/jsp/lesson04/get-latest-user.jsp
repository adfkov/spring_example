<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>
	<div class="container">
		<h1>학생 추가 정보</h1>
		
		<table class="table table-striped">
			<tr>
			<%-- ${} EL(Expression Language) --%>
				<th>번호</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>이름</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>생년월일</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>이메일</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>자기소개</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>생성일</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
			<tr>
				<th>수정일</th> <!--  제목  -->
				<td></td> <!--  일반 칸 -->
			</tr>
		</table>
	</div>
</body>
</html>