<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Word To PDF Converter</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<h1>Word To PDF Converter</h1>

	<form action="/WordToPDF/doUpload" method="post" enctype="multipart/form-data">
		<label>Enter file</label> <input type="file" name="file">
		<button type="submit">Convert to PDF</button>
	</form>
</body>
</html>