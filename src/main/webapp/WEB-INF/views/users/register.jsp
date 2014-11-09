<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="container">
	<c:if test='${(not empty message)}'>
	        <div id="message" class="${message.type}">${message.message}</div>
	    </c:if>
	<form:form commandName="user">
		<div class="form-group">
			<label for="username">Хэрэглэгчийн нэр:</label>
			<form:input path="username" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="email">Цахим шуудан:</label>
			<form:input path="email" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="phone">Утас:</label>
			<form:input path="phone" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="password">Нууц үг:</label>
			<form:password path="password" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="roles">Груп</label>
			<form:select path="roles" items="${roles}"/>
		</div>
		<button type="submit" class="btn btn-default">Бүртгүүлэх</button>
	</form:form>
</div>
