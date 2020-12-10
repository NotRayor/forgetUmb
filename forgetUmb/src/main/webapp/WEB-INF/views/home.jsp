<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>날씨 위치 입력폼</title>
</head>
<body>

	<form action="/weatherRequest">
		<select name="str1">
		    <option value="">시도</option>
		    <option value="경기도">경기도</option>
		</select>
		<select name="str2">
		    <option value="">시구군</option>
		    <option value="용인시기흥구">용인시기흥구</option>
		</select>
		<select name="str3">
		    <option value="">동읍면리</option>
		    <option value="기흥동">기흥동</option>
		</select>
		<button type="submit">확인</button>
	</form>

</body>
</html>