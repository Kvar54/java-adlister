import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name= "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        res.getWriter().println("<h1>WELCOME!</h1><form action='/hello'><input placeholder='enter name' name='name'><button>Submit</button></form>");
        if (name == null || name.isEmpty()) {
            res.getWriter().println("<h1>Hello, World!</h1>");
        } else {
            res.getWriter().println("<h1>Hello, " + name + "!</h1>");
        }
    }
}