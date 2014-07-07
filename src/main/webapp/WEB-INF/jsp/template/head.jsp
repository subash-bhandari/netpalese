<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tiles:importAttribute name="cssList"/>
<tiles:importAttribute name="jsList"/>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    
    <c:forEach items="${cssList}" var="cssValue">
        <link href="<c:url value="${cssValue}"/>" rel="stylesheet" type="text/css">
    </c:forEach>
    
    <c:forEach items="${jsList}" var="jsValue">
        <script src="<c:url value="${jsValue}"/>"></script>
    </c:forEach>
    
    <title><tiles:insertAttribute name="title" defaultValue="no title"/></title>
    
    <style type="text/css">
			
	</style>

</head>