<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(request.getSession().getAttribute("username") == null) {
	response.sendRedirect(request.getContextPath() + "/login");
    }
%>
<jsp:include page="header.jsp"></jsp:include>
    <div class="container mt-3 text-center">
        <h1> Choose what you wish to do today:</h1>
        <h3>
            <a href="manageRooms">Manage Rooms</a>&nbsp;&nbsp;&nbsp;
            <a href="manageServices">Manage Services</a>&nbsp;&nbsp;&nbsp;
            <a href="manageFeedback">Manage Feedback</a>&nbsp;&nbsp;&nbsp;
        </h3>
    </div>
</body>
</html>