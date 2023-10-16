<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!--  AJAX JQUERY 원본 -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>
		
	<%-- 	<form method="post" action="/lesson06/ex01/add-user">--%>
			<div class="form-group">
				<label for="name"><b>이름</b></label>
				<input type="text" id="name" name="name" class="form-control col-3" placeholder="이름을 입력하세요">
			</div>
			<div class="form-group">
				<label for="yyyymmdd"><b>생년월일</b></label>
				<input type="text" id="yyyymmdd" name="yyyymmdd" class="form-control col-3" placeholder="예)20190101">
			</div>
			<div class="form-group">
				<label for="email"><b>이메일</b></label>
				<input type="text" id="email" name="email" class="form-control col-3" placeholder="이메일주소를 입력하세요">
			</div>
			<div class="form-group">
				<label for="introduce"><b>자기소개</b></label>
				<textarea id="introduce" name="introduce" class="form-control col-5" rows="10"></textarea>
			</div>
			
			<%--<input type="submit" class="btn btn-success" value="추가"> --%>
			<%-- AJAX 통신일 때는 반드시 button 타입으로 지정한다!! --%>
			<input type="button" id="joinBtn" class="btn btn-success" value="버튼">
	<%-- 	</form>--%>
	</div>
	
	<script>
		$(document).ready(function() {

			// 2) jquery의 AJAX 통신 이용하기
			$('#joinBtn').on('click', function() {
				//alert("버튼 클릭");
				
				// validation check
				let name = $("#name").val().trim();
				if (name == "") {
					alert("이름을 입력하세요");
					return; 
				}
				
				let yyyymmdd = $('#yyyymmdd').val().trim();
				if (yyyymmdd.length < 1) {
					alert("생년월일을 입력하세요");
					return; 
				}
				
				let email = $('input[name=email]').val().trim();
				if (!email) {
					alert("이메일을 입력하세요");
					return; 
				}
				
				let introduce = $('#introduce').val();
				
				console.log(name);
				console.log(yyyymmdd);
				console.log(email);
				console.log(introduce);
				
				$.ajax({
					// request
					type:"POST"
					, url:"http://localhost/lesson06/ex01/add-user"
					, data: {"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce}
				
						
					// response
					
					// call back 함수
					, success: function(data) {
						alert(data);
					}
					, complete : function(data) {
						// 성공이든 실패든 무조건 불려짐 => 안씀!
					}
					, error: function(request, status, error) {
						alert(request);
						alert(status);
						alert(error);
						
					}
				});

		});
		
	</script>
</body>
</html>