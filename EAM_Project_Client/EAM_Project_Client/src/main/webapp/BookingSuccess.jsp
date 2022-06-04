<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
    <div class="m-3 container">
        <h1> Thank you for booking with us!</h1>
        <h4>Dear: ${room.userFName} ${room.userLName}</h4>
        <h4>Your room number is: ${room.number}</h4>
        <h4>You have: ${room.bedroom} bedrooms and ${room.bathroom} bathrooms included in your booking</h4>
        <c:if test="${sessionScope['username'] == null}">
            <h4>You may login using the email ID used to make the booking and password "EAM@123_Hotel" to edit your booking</h4>
        </c:if>
        <h4>Hope you have a nice stay with us!</h4>
    </div>
</body>
</html>
