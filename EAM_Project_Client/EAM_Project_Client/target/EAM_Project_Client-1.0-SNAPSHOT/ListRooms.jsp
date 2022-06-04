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
                <h2>Manage Rooms</h2>
            </div>
            <div class="col-12">
                <table class="table">
                    <tr>
                        <th>Room number</th>
                        <th>Bedroom</th>
                        <th>Bathroom</th>
                        <th>phone</th>
                        <th>TV</th>
                        <th>Additional Services</th>
                        <th>Vacant</th>
                        <th>User Id</th>
                        <th>User First Name</th>
                        <th>User Last Name</th>
                        <th>User Email</th>
                        <th>User Phone</th>
                        <th>Make Vacant</th>
                    </tr>
                    <c:forEach var="room" items="${listRooms}">
                        <tr>
                            <td><c:out value="${room.number}" /></td>
                            <td><c:out value="${room.bedroom}" /></td>
                            <td><c:out value="${room.bathroom}" /></td>
                            <td><c:out value="${room.phone}" /></td>
                            <td><c:out value="${room.tv}" /></td>
                            <td><c:out value="${room.additionalServices}" /></td>
                            <td>
                            <c:if test="${room.vacant == 'Y'}">
                                Yes
                            </c:if>
                            <c:if test="${room.vacant == 'N'}">
                                No
                            </c:if>
                            </td>
                            <td><c:out value="${room.userId}" /></td>
                            <td><c:out value="${room.userFName}" /></td>
                            <td><c:out value="${room.userLName}" /></td>
                            <td><c:out value="${room.userEmail}" /></td>
                            <td><c:out value="${room.userPhone}" /></td>
                            <td>
                            <c:if test="${room.vacant == 'N'}">
                                <a href="vacateRoom?room=<c:out value='${room.number}' />">Make Vacant</a>
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
