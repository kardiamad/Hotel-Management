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
                <h2>Manage Services</h2>
            </div>
            <div class="col-12">
                <table class="table">
                    <tr>
	                <th>Room number</th>
                        <th>Flower Bouquet</th>
                        <th>Scented Candles</th>
                        <th>Towels</th>
                        <th>Approved</th>
                        <th>Action</th>
	            </tr>
	            <c:forEach var="service" items="${listRoomServices}">
	                <tr>
	                    <td><c:out value="${service.roomNumber}" /></td>
	                    <td><c:out value="${service.flower}" /></td>
	                    <td><c:out value="${service.scent}" /></td>
	                    <td><c:out value="${service.towel}" /></td>
                            <td><c:out value="${service.approved}" /></td>
                            <td>
                            <c:if test="${service.approved == 'N'}">
                                <a href="approveService?id=<c:out value='${service.id}'></c:out>&room=<c:out value='${service.roomNumber}'></c:out>">Approve</a>
                            </c:if>
                            </td>
	                </tr>
	            </c:forEach>
	        </table>
	    </div>	
        </div>
    </div>
</body>
</html>
