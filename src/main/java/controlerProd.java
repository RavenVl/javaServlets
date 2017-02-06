import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by raven on 13.08.2016.
 */
public class controlerProd extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out = resp.getWriter();
        out.write("Product");
        out.close();

        dbProduct db = new dbProduct();
        db.setProducts();
        String tempId = req.getParameter("id");
        if (tempId!=null){
            int id = Integer.parseInt(tempId);
            Product product = db.getId(id);

           HttpSession sesion = req.getSession();
            sesion.setAttribute("product",product);


            req.getRequestDispatcher("product.jsp").forward(req,resp);

        }
        resp.sendRedirect("eror.jsp");

    }
}
