<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>EAM Hotel</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <!--header content -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <c:if test="${sessionScope['isAdmin'] == null}">
                  <a class="navbar-brand" href="login">EAM Hotel</a>
            </c:if>
            <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == true}">
                <a class="navbar-brand" href="admin">EAM Hotel</a>
            </c:if>
            <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == false}">
                <a class="navbar-brand" href="welcome">EAM Hotel</a>
            </c:if>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <c:if test="${sessionScope['username'] != null}">
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == true}">
                            <a class="nav-link" href="admin">Home</a>
                        </c:if>
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == false}">
                            <a class="nav-link" href="welcome">Home</a>
                        </c:if>
                    </li>
                    <li class="nav-item">
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == true}">
                            <a class="nav-link" href="manageRooms">Manage Rooms</a>
                        </c:if>
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == false}">
                            <a class="nav-link" href="book">Book a Room</a>
                        </c:if>
                    </li>
                    <li class="nav-item">
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == true}">
                            <a class="nav-link" href="manageServices">Manage Services</a>
                        </c:if>
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == false}">
                            <a class="nav-link" href="serviceRequest">Order Services</a>
                        </c:if>
                    </li>
                    <li class="nav-item">
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == true}">
                            <a class="nav-link" href="manageFeedback">Manage Feedback</a>
                        </c:if>
                        <c:if test="${sessionScope['isAdmin'] != null && sessionScope['isAdmin'] == false}">
                            <a class="nav-link" href="feedback">Feedback</a>
                        </c:if>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout">Logout</a>
                    </li>
                </ul>
            </div>
            </c:if>
            <c:if test="${sessionScope['username'] == null}">
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="book">Book a Room</a>
                        </li>
                    </ul>
                </div>
            </c:if>
        </div>
    </nav>