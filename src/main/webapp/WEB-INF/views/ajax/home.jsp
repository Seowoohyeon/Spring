<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	response.setCharacterEncoding("EUC-KR");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ajax home</title>
</head>
<body>

<h3># Ajax�� ����� ���ô�</h3>

<ul>
	<li>�������� ��� �ε�ǰ� �� �Ŀ� ������ �����͸� ��û�� �� �ֽ��ϴ�!</li>
	<li>�������� �ٽ� �ε��� �ʿ���� ������Ʈ �� �� �ֽ��ϴ�!</li>
	<li>��׶���� ������ �����͸� ������ �� �ֽ��ϴ�!</li>
</ul>

<hr />

<div id="test">
	<h4>�޾ƿ� �����͸� �̰��� ����� ����</h4>
</div>

<ul id="testlist">
	<li>������ ����ִ� ����Ʈ</li>
</ul>

<button onclick="loadStr()">getStr()���� ������ ��������</button> <br /><br />
<button id="sampleAsyncBtn">getsamle()���� ������ ��������</button> <br /><br />
<button id="asyncJsonDataBtn">JSON �����Ϳ� �Բ� �񵿱� ��û ������</button> <br /><br />


<!-- ������ �ڿ��� ����� ���� servlet-context�� �ڿ� ��θ� ����ؾ� �Ѵ� -->
<script src="<%=request.getContextPath() %>/resources/js/ajax_home.js"></script>

</body>
</html>