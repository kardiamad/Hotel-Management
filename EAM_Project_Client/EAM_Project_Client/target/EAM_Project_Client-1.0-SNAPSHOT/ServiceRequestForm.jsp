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
        <h2>Room Number: ${room.number} </h2>
        <h3>You may order extra services here:</h3>
        <c:forEach var="room" items="${requestScope['rooms']}">
            <div class="card">
                <div class="card-body">
                    <h2>Services for Room <c:out value="${room.getNumber()}"></c:out></h2>
                    <c:if test="${room.getAdditionalServices() == 'Requested' || room.getAdditionalServices() == 'Approved'}">
                        <h3>It seems you have already submitted a request and its status is: <c:out value="${room.additionalServices}"></c:out></h3>
                    </c:if>
                    <c:if test="${room.getAdditionalServices() == 'None'}">
                    <form action="submitServiceRequest" method="post">
                        <input type="hidden" class="form-control" name="id" value="${sessionScope['id']}"/>
                        <input type="hidden" class="form-control" name="room" value="${room.getNumber()}"/>
                        <div class="form-row">
                            <div class="col-sm-2">
                                <label for="flower">Flower Bouquet</label>
                                <input type="number" class="form-control" name="flower" placeholder="0" value="0"/>
                            </div>
                            <div class="col-sm-2">
                                <label for="towel"> Towels</label>
                                <input type="number" class="form-control" name="towel" placeholder="0" value="0"/>
                            </div>
                        </div>
                        <div class="form-row mt-3 mb-3">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="1" name="scent">
                                <label class="form-check-label" for="scent"> Scented Candles</label>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit Order</button>
                    </form>
                    </c:if>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
