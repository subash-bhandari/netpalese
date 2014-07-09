<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style type="text/css">
	td {
		padding: 10px;
	}
</style>

<c:forEach items="${posts}" var="post">
<div style="border: 1px solid red; overflow: auto">
	<div style="width: 100px; float: left;">
		<div style=";">
		likes
		</div>
		<div style="">
		dislikes
		</div>
		<div style="">
		views
		</div>
	</div>
	<div>
		<div>
			<div>${post.title}</div>
			<div style="border: 1px solid red; margin-left: 105px">
				<div style="border: 1px solid blue; margin-right: 105px">
					Category list
				</div>
				<div style="width: 100px; float: right;">${post.createdAt}</div>
			</div>
		</div>
	</div>
</div>
<hr />
</c:forEach>
