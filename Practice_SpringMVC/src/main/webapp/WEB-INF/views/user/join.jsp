<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 페이지</title>
</head>
<body>

<h3># 연습문제</h3>
<ul>
	<li>다양한 회원 정보를 입력받는다</li>
	<li>post방식으로 회원정보와 함께 요청하면
		전달한 회원 정보를 서버의 /data/user에 파일 형태로 저장한다</li>
	<li>파일 이름은 중복이 생기지 않도록 조심해야한다</li>
	<li>누락된 정보가 있는경우 회원가입 실패 페이지로 넘어가야 한다</li>
	<li>회원가입에 성공하면 회원가입 성공페이지를 5초간 보여준 후 다시 홈으로 이동한다</li>
</ul>

<hr />

이곳에서 회원 정보를 입력하세여

	<form role="form" method="post" autocomplete="off">
		<p>
			<label for="userId">아이디</label> <input type="text" id="userId"
				name="userId" />
		</p>
		<p>
			<label for="userPass">비밀번호</label> <input type="password"
				id="userPass" name="userPass" />
		</p>
		<p>
			<button type="submit">로그인</button>
		</p>
	</form>

</body>
</html>