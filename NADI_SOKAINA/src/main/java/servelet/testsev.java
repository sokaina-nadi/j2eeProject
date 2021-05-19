package servelet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAO;
import POJO.Etudiant;

/**
 * Servlet implementation class testsev
 */
@WebServlet("/testsev")
public class testsev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	DAO um;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testsev() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um=new DAO();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		   String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   Etudiant u=um.authentification(lg,ps);
		   if(u!=null)
		   {
			   HttpSession ses = request.getSession(true);
			   
			   
			   ses.setAttribute("Etudiant", u);
			   
			   
			   response.sendRedirect("starter.jsp");
		   }
		   else {
			   response.sendRedirect("index.jsp");
		   }
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
