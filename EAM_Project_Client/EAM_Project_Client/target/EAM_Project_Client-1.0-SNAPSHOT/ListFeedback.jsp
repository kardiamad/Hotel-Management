<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(request.getSession().getAttribute("username") == null) {
	response.sendRedirect(request.getContextPath() + "/login");
    }
%>
<jsp:include page="header.jsp"></jsp:include>
    <div class="container-fluid mt-3 text-dark">
	<div class="row">
            <div class="col-12 text-center">
                <h2>Manage Feedback</h2>
            </div>
            <div class="col-12">
                <table class="table">
	            <tr>
	                <th>Name</th>
                        <th>Feedback</th>
                        <th>Action</th>
	            </tr>
	            <c:forEach var="feedback" items="${listFeedback}">
	                <tr>
	                    <td><c:out value="${feedback.username}" /></td>
	                    <td><c:out value="${feedback.text}" /></td>
                                <td>
                                    <a href="deleteFeedback?id=<c:out value='${feedback.id}' />">Delete</a>
                                </td>
	                </tr>
	            </c:forEach>
                </table>
	    </div>	
        </div>
    </div>
</body>
</html>
