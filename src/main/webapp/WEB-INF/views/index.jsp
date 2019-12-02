<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
</head>
<body>

// You will need to add a User_Agent to your header for this API??
${User_Agent }

<div class="container">
<h1>Coffee Breweries</h1>

	<table class="table">
		<tr>
			<th>name</th>
			<th>type</th>
		</tr>
		<c:forEach var="b" items="${brewery_type.value }">
			<tr>
				<td>${b.name }</td> <!-- Each brewery name is a hyperlink to /details page -->
				<td>${b.type}</td>
			</tr>
			</c:forEach>
	</table>

</div>

</body>
</html>