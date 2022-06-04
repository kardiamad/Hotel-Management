<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
<%
    if(request.getSession().getAttribute("username") != null) {
        if(request.getSession().getAttribute("isAdmin").toString() == "true") {
            response.sendRedirect(request.getContextPath() + "/admin");
        } else {
            response.sendRedirect(request.getContextPath() + "/welcome");
        }
    }
%>
    <div class="container">
        <div class="row">
            <div class="col-6">
                <div class="card mt-3 p-3">
                    <h1>Login</h1>
                    <div class="card-body">
                        <form action="login" method="post">
                            <c:if test="${requestScope['error'] != null}">
                                <div class="alert alert-danger">${requestScope['error']}</div>
                            </c:if>
                            <div class=" form-group">
                                <label for="uname">Username</label>
                                <div>
                                    <input type="text" class="form-control" name="uname" value="${user.name}" placeholder="Enter User Name">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="upassword">Password</label>
                                <div>
                                    <input type="password" class="form-control" name="upassword" value="${user.password}" placeholder="Enter Password">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
