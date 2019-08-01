<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function () {
		$("#get-scripttag").click(function(event) {
			console.log("get");
			event.preventDefault();
			$.ajax({
				url : "${pageContext.request.contextPath}/api/scripttag",
				type : "GET",
				dataType : "json",
				success : function(result) {
					console.log(result);
				}
			})
		});
		
		$("#post-scripttag").click(function(event) {
			
			var display_location = $("#display_location").val();

			var postData = {
				    "shop_no": 1,
				    "request": {
				        "src": $("#src").val(),
				        "display_location": [
				            "ORDER_BASKET"
				        ]
				    }
				};
			
			event.preventDefault();
			$.ajax({
				url : "${pageContext.request.contextPath}/api/scripttag",
				type : "POST",
				dataType: "json",
				contentType:"application/json;charset=UTF-8",
				data : JSON.stringify(postData),
				success : function(result) {
					console.log(result);
				}
			})
		});
		
		
		$("#delete-scripttag").click(function(event) {
			console.log("delete");
			event.preventDefault();
			
			$.ajax({
				url : "${pageContext.request.contextPath}/api/scripttag/"+$("#deleteNo").val(),
				type : "DELETE",
				dataType : "json",
				success : function(result) {
					console.log(result);
				}
			})
		});
		
	});
</script>
</head>
<body>
	<input type="text" id="src" placeholder="src" value="https://saleapp.cafe24.com/commons3.js"> 
	<input type="text" id="display_location">
	<input type="text" id="deleteNo" placeholder="deleteNo">
	<button id="get-scripttag">리스트 가져오기</button>
	<button id="post-scripttag">리스트 추가</button>
	<button id="delete-scripttag">리스트 삭제</button>
</body>
</html>