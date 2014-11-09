<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Add Record to Entry Table</h1>
    <form:form action="/entries/search.html" method="post">
      Book Title: <input type="text" name="searchText" /><br/>
      <input type="submit"/>
    </form:form>
    
    <br/>
    Results:
    <br/>
    <c:choose>
    	<c:when test="${empty results}">
    		No Results
    	</c:when>
    	<c:otherwise>
    		<c:forEach var="result" items="${results}">
			   	<ul>
			   		<li>${result.entryWord}</li>
			   		<li>${result.entryDescription}</li>
			   	</ul>
			</c:forEach>
    	</c:otherwise>
    </c:choose>