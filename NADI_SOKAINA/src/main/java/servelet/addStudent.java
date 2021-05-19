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

/**
 * Servlet implementation class addStudent
 */
@WebServlet("/addStudent")
public class addStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DAO um=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudent() {
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
		   String full=request.getParameter("full_name");
		   String lg=request.getParameter("log");
		   String ps=request.getParameter("pass");
		   int u=um.addStudent(full,lg,ps);
		   if(u==1) {
		   HttpSession ses = request.getSession(true);
	
		   ses.setAttribute("Etudiant", u);
		   
		   
		   response.sendRedirect("starter.jsp");
		   }
		   else {
			   out.print("erreur d'identification!!");
		   }
	}

}
