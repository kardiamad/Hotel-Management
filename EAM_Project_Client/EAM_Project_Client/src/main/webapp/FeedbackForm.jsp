<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(request.getSession().getAttribute("username") == null) {
	response.sendRedirect(request.getContextPath() + "/login");
    }
%>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="container mt-3">
        <div class="row">
            <div class="col-6">
                <div class="card">
                    <div class="card-body">
                        <form action="feedback" method="post">
                            <input type="hidden" class="form-control" name="id" value="${sessionScope['id']}"/>
                            <c:if test="${requestScope['success'] != null}">
                                <div class="alert alert-success">${requestScope['success']}</div>
                            </c:if>
                            <c:if test="${requestScope['error'] != null}">
                                <div class="alert alert-danger">${requestScope['error']}</div>
                            </c:if>
                            <div class=" form-group">
                                <div>
                                    <label for="cname">Name</label>
                                    <input type="text" class="form-control" name="cname" placeholder="Enter Your Name"/>
                                </div>
                                <div>
                                    <label for="msg">Feedback</label>
                                    <textarea type="text" class="form-control" name="msg" placeholder="Enter Your Feedback"></textarea> 
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>