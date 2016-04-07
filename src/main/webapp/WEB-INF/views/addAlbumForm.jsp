<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
		
		<form method="POST">
			<table>
			<th>Albümün;</th>
				<tr>
					<td>Adı:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Sanatçı Adı:</td>
					<td><input type="text" name="artistName" /></td>
				</tr>
				<tr>
					<td>Türü:</td>
					<td><input type="text" name="genre" /></td>
				</tr>
				<tr>
					<td>Çeşidi :</td>
					<td>
						<select name="variation" >
							<option value="1">CD</option>
							<option value="2">Kaset</option>
							<option value="3">Plak</option>
						</select>
					
					</td>
				</tr>
				<tr>
					<td>Şarkı Sayısı :</td>
					<td><input type="text" name="songNumbers" /></td>
				</tr>
				
				<tr>
					<td>
						<input type="submit" value="Kaydet" />
					</td>
				</tr>
			</table>
		</form>
</body>
</html>