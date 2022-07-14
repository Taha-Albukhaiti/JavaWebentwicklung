import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;
import java.io.IOException;

public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fooValue = req.getParameter("foo");
        ServletOutputStream out = resp.getOutputStream();
        out.println("<h1>Hello World!</h1>");
        out.println("<span>Der Wert des Parameters foo war " + fooValue + "</span>");
    }
}
