<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<tiles:insertAttribute name="head"/>

<body>
	<div class="topBar">
		<div class="topBarContainer">
			<div style="witdh: 100px; float: left;">
				Wassup!!!
			</div>
			<div class="loginContainer">
				<span class="topBarLinks">
					<sec:authorize var="loggedIn" access="isAuthenticated()" />
					<c:choose>
						<c:when test="${loggedIn}">
							<sec:authentication  property="principal.username" /> | 
							<a href="${pageContext.request.contextPath}/logout.do">Logout</a>
						</c:when>
						<c:otherwise>
							<a href="${pageContext.request.contextPath}/signup.do">Signup</a>  |  
							<a href="${pageContext.request.contextPath}/login.do">Login</a>
						</c:otherwise>
					</c:choose>
				</span>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="header">
			<div class="headerLogo">
				<a href="${pageContext.request.contextPath}/home.do">
					<img src="${pageContext.request.contextPath}/resources/images/sajhasiteLogo.png" />
				</a>
			</div>
			<div class="headerMenu">
			<a href="${pageContext.request.contextPath}/posts.do">Posts</a>  |  
			<a href="${pageContext.request.contextPath}/categories.do">Categories</a>  |  
			<a href="${pageContext.request.contextPath}/locations.do">Locations</a>  |  
			<a href="${pageContext.request.contextPath}/users.do">Users</a>  |  
			<a href="${pageContext.request.contextPath}/createpost.do"> >> Create Post << </a>
			</div>
		</div>	
		<div class="content">
			<div class="contentTitleContainer">
				<span style="font-weight: bold;"><tiles:getAsString name="contentTitle" /></span>
				<hr />
			</div>
			<div class="contentBody">
				<tiles:insertAttribute name="content" />
			</div>
		</div>		
	</div>
	<div class="bottomBar">
		<div class="footerTop"></div>
		<div class="footer">
			<div style="width: 200px; float: left;">
				<span style="font-weight: regular;">ShitIsUnderConstruction<sup>TM</sup></span>
			</div>
			<div style="width: 400px; float: right; text-align: right;">
				<span style="font-weight: regular;">
				${pageContext.servletContext.serverInfo}
				</span>
			</div>
		</div>
	</div>
</body>
</html>