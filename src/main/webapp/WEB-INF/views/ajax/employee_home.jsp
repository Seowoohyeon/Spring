<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3># CRUD ������ ����ߴ� ���̺��� ���� ������ ������ּ���</h3>
<ol>
	<li>
		���� ��ư�� ������ �������� ������ �����鼭 CRUD���̺��� ��� ������
		display ���̺� ����Ѵ�
	</li>
	<li>
		display ���̺��� �� ���ٿ��� ���ο� ���� �߰��� �� �ִ� �Է����� �����ϰ�
		�߰� ��ư�� ������ �������� ������ �����鼭 �߰��� �Բ� ���̺� ����� ���ŵȴ�
	</li>
	<li>
		display ���̺� ���� �� �����ʿ��� ���� ��ư�� �����ϸ�
		������ư�� ������ �ش� ���� �����Ǹ� ���̺� ����� ���ŵȴ�
	</li>
</ol>

<button id="btn">����</button>

<hr />

<div id="display">
	<h4>�޾ƿ� �����͸� �̰��� ����� ����</h4>
</div>

<script src="<%=request.getContextPath() %>/resources/js/crud_home.js"></script>

</body>
</html>