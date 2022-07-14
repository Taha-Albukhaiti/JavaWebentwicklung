import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.*;


public class ServletTest extends HttpServlet {

    private static final String htm = "index.html";
    private static final String css = "design.html";
    private static final String js = "script.html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fooValue = req.getParameter("foo");
        ServletOutputStream out = resp.getOutputStream();
        String text = dateiLesen(htm);

        out.println(text);
        out.println();


    }

    public static String dateiLesen(String datei_name) {
        BufferedReader bf = null;
        String text = null;
        try {
            bf  = new BufferedReader(new FileReader(datei_name));
            while (bf.ready()) {
                text = bf.readLine();
            }
            return text;

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return text;
    }
}
