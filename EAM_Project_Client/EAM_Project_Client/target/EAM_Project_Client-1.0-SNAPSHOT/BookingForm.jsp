<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="m-3 container">
        <h2>We have the following room styles available: </h2>
        <ul>
            <li>Room Numbers (1, 4, 7, 10, ....): 1 bedroom</li>
            <li>Room Numbers (2, 5, 8, 11, ....): 2 bedroom</li>
            <li>Room Numbers (3, 6, 9, 12, ....): 3 bedroom</li> 
        </ul>
        <div class="row">
            <div class="col-6">
                <div class="card mt-3 p-3">
                    <div class="card-body">
                        <form action="bookingConfirmation" method="post">
                            <input type="hidden" name="id" value="${sessionScope['id']}"/>
                            <c:if test="${requestScope['error'] != null}">
                                <div class="alert alert-danger">${requestScope['error']}</div>
                            </c:if>
                            <div class="form-group">
                                <label for="rnumber">Available Room Numbers:</label>
                                <select class="form-select" name="rnumber" >
                                    <c:forEach items="${rooms}" var="room">
                                        <option value="${room.number}" > ${room.number}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="fname">First Name:</label>
                                <div>
                                    <input type="text" class="form-control" name="fname" placeholder="Enter First Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="lname">Last Name:</label>
                                <div>
                                    <input type="text" class="form-control" name="lname" placeholder="Enter Last Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone Number:</label>
                                <div>
                                    <input type="tel" maxlength="10" class="form-control" name="phone" placeholder="Enter Phone Number">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <div>
                                    <input type="email" class="form-control" name="email" placeholder="Enter Email ID">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary">Book Room</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>