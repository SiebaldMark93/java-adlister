import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page-view-counter")
public class PageViewCounter extends HttpServlet {

    int pageViews = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        pageViews += 1;
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>page view counter: " + pageViews + "</h1>");
    }
}
