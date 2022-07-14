import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fooValue = req.getParameter("foo");
        ServletOutputStream out = resp.getOutputStream();
        out.println("<h1>Hello World!</h1>");
        out.println("<span>Der Wert des Parameters foo war " + fooValue + "</span>");
    }
}
