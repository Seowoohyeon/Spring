<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3># CRUD 연습에 사용했던 테이블을 통해 다음을 만들어주세요</h3>
<ol>
	<li>
		갱신 버튼을 누르면 페이지가 변하지 않으면서 CRUD테이블의 모든 내용을
		display 테이블에 출력한다
	</li>
	<li>
		display 테이블의 맨 윗줄에는 새로운 행을 추가할 수 있는 입력한이 존재하고
		추가 버튼을 누르면 페이지가 변하지 않으면서 추가와 함께 테이블 목록이 갱신된다
	</li>
	<li>
		display 테이블 행의 맨 오른쪽에는 삭제 버튼이 존재하며
		삭제버튼을 누르면 해당 행이 삭제되며 테이블 목록이 갱신된다
	</li>
</ol>

<button id="btn">갱신</button>

<hr />

<div id="display">
	<h4>받아온 데이터를 이곳에 출력할 예정</h4>
</div>

<script src="<%=request.getContextPath() %>/resources/js/crud_home.js"></script>

</body>
</html>