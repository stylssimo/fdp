<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Add Record to Entry Table</h1>
    <form:form commandName="entryModel" method="post">
      Book Title: <form:input path="entryWord"/><br/>
      Book Description:<br/>
      <form:textarea path="entryDescription" rows="20"/><br/>
      <input type="reset"/>
      <input type="submit"/>
    </form:form>