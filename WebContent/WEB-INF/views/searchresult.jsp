<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>available list</title>
</head>
<body>

	<c:if test="${!empty status}">
		<c:out value="${status}"/>
	</c:if>
<c:if test="${empty appdata}">
		<c:out value="no record found"/>
	</c:if>
	<c:if test="${!empty appdata}">
		<table border="1" bgcolor="yellow" background="red">
				<tr>
					<td>Date And Time</td>
					<td>Purpose of appointment</td>
					<td>whom</td>
					<td>mobile number</td>
					<td>Address</td>
					<td>Start date and time</td>
					<td>End date and time</td>
				</tr>
				<c:forEach items="${appdata}" var="adata">
					<tr>
					<td>
					<c:out value="${adata.time }"/>
					</td>
					<td>
					<c:out value="${adata.purposeOfApp }"/>
					</td>
					<td>
					<c:out value="${adata.whom }"/>
					</td>
					
					<td>
					<c:out value="${adata.phoneNumber }"/>
					</td>
					<td>
					<c:out value="${adata.address }"/>
					</td>
					<td>
					<c:out value="${adata.startTime }"/>
					</td>
					<td>
					<c:out value="${adata.endTime }"/>
					</td>
					
					</tr>
				</c:forEach>
			</table>

		</c:if>
		</body>
</html>