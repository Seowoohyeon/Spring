<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ ������</title>
</head>
<body>

<h3># ��������</h3>
<ul>
	<li>�پ��� ȸ�� ������ �Է¹޴´�</li>
	<li>post������� ȸ�������� �Բ� ��û�ϸ�
		������ ȸ�� ������ ������ /data/user�� ���� ���·� �����Ѵ�</li>
	<li>���� �̸��� �ߺ��� ������ �ʵ��� �����ؾ��Ѵ�</li>
	<li>������ ������ �ִ°�� ȸ������ ���� �������� �Ѿ�� �Ѵ�</li>
	<li>ȸ�����Կ� �����ϸ� ȸ������ ������������ 5�ʰ� ������ �� �ٽ� Ȩ���� �̵��Ѵ�</li>
</ul>

<hr />

�̰����� ȸ�� ������ �Է��ϼ���

	<form action="<c:url value="/hello/join"/>" method="post">
		ID : <input type="text" name="id" /> <br />
		PASSWORD : <input type="password" name="password" /><br />
		�̸� : <input type="text" name="name" /><br />
		���� : <input type="number" name="age" /><br />
		���� : <input type="date" name="birthday"  /><br />
		<input type="submit" /><br />
	</form>

</body>
</html>