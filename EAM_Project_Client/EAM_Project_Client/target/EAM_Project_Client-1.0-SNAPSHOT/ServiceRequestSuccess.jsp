<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(request.getSession().getAttribute("username") == null) {
	response.sendRedirect(request.getContextPath() + "/login");
    }
%>
<jsp:include page="header.jsp"></jsp:include>
    <div class="container m-3">
        <h3>Your request has been successfully submitted!</h3>
    </div>
</body>
</html>
