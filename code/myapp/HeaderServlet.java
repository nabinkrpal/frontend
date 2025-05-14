import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class HeaderServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>HTTP Headers</title></head><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            out.println("<tr><td>" + header + "</td><td>" + value + "</td></tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
// javac -cp "C:\Program Files\Apache Software Foundation\Tomcat 10.1\lib\jakarta.servlet-api.jar" HeaderServlet.java
