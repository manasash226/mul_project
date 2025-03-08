

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Mulservlet
 */
@WebServlet("/Mulservlet")
public class Mulservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mulservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");//MIME-Multipurpose Internet Mail Extension
		PrintWriter pw=response.getWriter();
		String v=request.getParameter("num");
		int n=Integer.parseInt(v);
		//Wrapper class are of 8 types- Byte, Short, Integer, Long, Float, Double, Character, Boolean
		//Wrapper classes first letter should be capital 
		pw.println("<table border=1>");
		for(int i=1; i<=10;i++) {
			pw.println("<tr><td>" + n + "*" + i + "=" +(n*i)+  "</td></tr>");
		}
		pw.println("</table>");
		pw.close();
	}

}
