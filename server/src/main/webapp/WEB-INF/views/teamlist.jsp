<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Team list</title>
  </head>

  <body>

  <h2> 팀 목록 </h2>

  <div class="container">
    <table class="table table-hover">
      <tr>
        <th>Number</th>
        <th>Name</th>
      </tr>
      <c:forEach var="t" items="${teamlist}">
        <tr>
          <td>${t.id}</td>
          <td>${t.name}</td>
        </tr>
      </c:forEach>
  
    </table>
  </div>

  <%@ include file="bootstrap.jsp" %>
  </body>

  </html>