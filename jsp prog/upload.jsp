<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload Form</title>
</head>
<body>
    <h2>Upload a File</h2>
    <form action="upload.jsp" method="post" enctype="multipart/form-data">
        Select File: <input type="file" name="file"><br><br>
        <input type="submit" value="Upload">
    </form>

<%
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String uploadPath = application.getRealPath("/") + "uploads";
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();

        Part filePart = request.getPart("file"); // Multipart form
        String fileName = filePart.getSubmittedFileName();
        String savePath = uploadPath + File.separator + fileName;

        try (InputStream input = filePart.getInputStream();
             FileOutputStream output = new FileOutputStream(savePath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }
        }

        out.println("<p style='color:green;'>File uploaded successfully to: uploads/" + fileName + "</p>");
    }
%>
</body>
</html>
