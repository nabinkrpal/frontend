// CreateCookieServlet.java
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class CreateCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create and add cookie
        Cookie myCookie = new Cookie("username", "NabinKumar");
        response.addCookie(myCookie);

        out.println("<html><body>");
        out.println("<h2>Cookie Created Successfully!</h2>");
        out.println("</body></html>");
    }
}
