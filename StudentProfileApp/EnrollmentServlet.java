import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EnrollmentServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Enrollment Details</h2>");
        out.println("<p><strong>Enrollment Number:</strong> 1234567890</p>");
        out.println("<p><strong>Name:</strong> Nabin Kumar Pal</p>");
        out.println("</body></html>");
    }
}
