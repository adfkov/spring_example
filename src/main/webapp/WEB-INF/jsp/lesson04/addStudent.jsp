<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 추가</title>
</head>
<body>
	<div class="container"> <!--  가운데 정렬, 가로 값 -->
		<h1>회원가입</h1>
		<form method="post" action="/lesson04/ex02/add-student"> <!--  서버 처리를 하는 컨트롤러 signUp으로 보낼것 -->
			<div class="form-group"> <!--  항목들을 묶어주는 bootstrap class -->
				<label for="name">이름</label>
				<input type="text" id="name" name="name" class="form-control col-3"> <!--  form name submit -->
			</div>
			
			<div class="form-group"> <!--  항목들을 묶어주는 bootstrap class -->
				<label for="phoneNumber">휴대폰번호</label>
				<input type="text" id="phoneNumber" name="phoneNumber" class="form-control col-3"> <!--  form name submit -->
			</div>
			
			<div class="form-group"> <!--  항목들을 묶어주는 bootstrap class -->
				<label for="email">이메일</label>
				<input type="text" id="email" name="email" class="form-control col-3"> <!--  form name submit -->
			</div>
			
			<div class="form-group"> <!--  항목들을 묶어주는 bootstrap class -->
				<label for="dreamJob">장래희망</label>
				<input type="text" id="dreamJob" name="dreamJob" class="form-control col-3"> <!--  form name submit -->
			</div>
			
			<input type="submit" class="btn btn-info" value="회원가입"> <!--  button은 value -->
		</form>
	</div>
</body>
</html>