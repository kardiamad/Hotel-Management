<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(request.getSession().getAttribute("username") == null) {
	response.sendRedirect(request.getContextPath() + "/login");
    }
%>
<% String error = (String) request.getAttribute("error");%>
<jsp:include page="header.jsp"></jsp:include>
    <div class="container m-3">
         <h2>Oops! Something went wrong</h2>
         <h3><%= error %></h3>
    </div>
</body>
</html>
