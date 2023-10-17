<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!--  AJAX JQUERY 원본 -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>join</title>
</head>
<body>
	<div class="container">
		<h1> 회원 정보 추가</h1>
			<div class="form-group">
				<label for="name"><b>이름</b></label>
				<div class="d-flex">
					<input type="text" id="name" name="name" class="form-control col-3" placeholder="이름을 입력하세요">
					<button type="button" id="nameCheckButton">중복 확인</button>
				</div>
				<small id="nameStatusArea">중복된 이름입니다.</small>
			</div>
			
			<input type="button" id="joinBtn" class="btn btn-success" value="버튼">
	
	</div>
	
	<script>
		$(document).ready(function() {
			$('#nameCheckButton').on('click', function() {
				// 중복확인 클릭 시 nameCheckBtn 안쪽 태그들을 초기화
				// 하나만 띄우기 위해
				$("#nameStatusArea").empty();
				
				
				let name = $('#name').val().trim();
				
				// validation
				
				//이름이 비었는지
				if(name == "") {
					$('#nameStatusArea').append('<span class="text-danger">이름이 뭐죠?</span>');
					return;
				}
				
				// 이름 중복 확인 => 서버에서 조회
				$.ajax({
					// request
					type:"GET" // 기본이 GET 방식, 아이디는 노출되어도 됨
					, url:"/lesson06/ex01/is-duplication"
					, data: {"name":name}
					
					// response
					, success: function(data) { // string이거나 JSON=> dictionary
							// {"code":200, "is_duplication": true}
						if(data.is_duplication) {
							$('#nameStatusArea').append('<span class="text-danger">중복된 이름입니다</span>');
							
						}
						
					}
					,error : function(request, status, error) {
						alert("");
					}
				});
			});	
		
			$('#joinBtn').on('click', function() {
				console.log($('#nameStatusArea').children().length);
				
				// nameStatusArea에 아무 자식 노드(태그)가 없으면 서브밋을 한다.
				if ($('#nameStatusArea').children().length == 0) {
					alert("가입 가능");
					return;
				} else {
					alert("가입 불가");
				}
			})
			
		});
	</script>
</body>
</html>