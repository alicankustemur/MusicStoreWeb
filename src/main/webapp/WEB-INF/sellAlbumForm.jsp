<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sell Album Form</title>
</head>
<body>
	Müzik Dükkanı'na Hoşgeldiniz!

	<form action="sellAlbum" method="POST">
		<table>
			<tr>
				<td>Albüm Seç:</td>
				<td><select name=albumId id="">
						<c:forEach var="a" items="${albums}">
							<option value="${a.id}">${a.name}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Müşteri Adı-Soyadı:</td>
				<td><input type="text" name="name" /></td>
				<td><input type="text" name="surname" /></td>
			</tr>
		</table>


		<button>Satın Al</button>
	</form>




</body>
</html>