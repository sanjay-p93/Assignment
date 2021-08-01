<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Bank</title>
</head>
<body>
<div style="padding: 26px;">
<form:form action="/wihtdraw" method="post" modelAttribute="transactionObj">
	Account ID : <form:input id="accountId" type="number" name="accountId" path="accountId"/>
	<form:errors  path="accountId" class="text-danger"></form:errors><br><br>
	Amount : <form:input id="amount" type="number" name="amount" path="amount"/>
	<form:errors  path="amount"  class="text-danger"/><br><br>
	<input type="submit" value="Withdraw">
</form:form>
</div>
</body>
</html>