<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form method="POST" modelAttribute="postDetail">
	<form:errors path="*" cssClass="errorMsg" />

<div class="createpost-title" style="border: 0">
	<table class="wide">
		<tr>
			<td style="width: 40px;">
				<span style="font-weight: bold;">Title</span>
			</td>
			<td>
				<div class="input-border">
				<form:input path="title" cssClass="wide" />
				</div>
			</td>
		</tr>
	</table>
</div>

<div class="wmd-panel">
    <div id="wmd-button-bar"></div>
    <form:textarea path="content" id="wmd-input" cssClass="wmd-input"></form:textarea>    
</div>
<div id="wmd-preview" class="wmd-panel wmd-preview"></div>

<div class="createpost-categories">
	<table>
		<tr>
			<td style="padding-right: 5px; width: 80px;">
				<span style="font-weight: bold;">Categories</span>
			</td>
			<td>
				<table>
					<tr>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
						<td>
							<div class="input-border">
							<form:input path="categories" cssClass="wide" />
							</div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<div>
	<input type="submit" value="Submit">
</div>

</form:form>
