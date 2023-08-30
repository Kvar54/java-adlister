import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet( name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);

    }
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String crustType = req.getParameter("crust");
        String sauceType = req.getParameter("sauce");
        String sizeType = req.getParameter("size");
        String[] toppings = req.getParameterValues("topping");
        String deliveryAddress = req.getParameter("deliveryaddress");

    System.out.println(crustType);
       System.out.println("Selected Sauce:" + sauceType);
       System.out.println("Selected Size:" + sizeType);
       System.out.printf("Selected Toppings: %s%n" , Arrays.toString(toppings));

       System.out.println("Delivery Address:" + deliveryAddress);

//       req.setAttribute("crustType",crustType);
//       req.setAttribute("sauceType",sauceType);
//       req.setAttribute("sizeType",sizeType);
//       req.setAttribute("toppings", toppings);
//       req.setAttribute("deliveryAddress", deliveryAddress);
//       req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);

       resp.setContentType("text/html");
       resp.getWriter().println("<h1>Thank You for Your Order!</h1>");
   }
   }