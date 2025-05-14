import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EnrollmentServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        // Replace with your real info
        String name = "Nabin Kumar Pal";
        String enrollment = "123456789";

        out.println("<html><body>");
        out.println("<h2>Enrollment Details</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Enrollment No:</strong> " + enrollment + "</p>");
        out.println("</body></html>");
    }
}
