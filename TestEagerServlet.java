//This is Sumeet Katkade addition
//all code addition is from the point of view of next release of augest
//started working on facebook autthentication 
//add code in braching tutorail for augerst branch
//this is augest brancfh
//ccee date is 29 augest
package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// do some work fisrt week point of view
//kjjfjhjfjjfjjff
//hhjjfjjfhjfjjfjjfj
//first week augest is nrw branch
//////this is a new branch 
///congo

/**
 * Servlet implementation class TestEagerServlet
 */
//@WebServlet(value="/hello3",loadOnStartup = 1)
public class TestEagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		System.out.println("in init of "+getClass()+" thread "+Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy of "+getClass()+" thread "+Thread.currentThread());
		System.out.println("sumeet testing clone);
		System.out.println("testing the clone");
		

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do-get of "+getClass()+" thread "+Thread.currentThread());
		//set cont type
		response.setContentType("text/html");
		//get pw
		try(PrintWriter pw=response.getWriter())
		{
			pw.print("<h4> Resp from eagerly loaded servlet ...."+LocalTime.now()+"</h4>");
		}
	}

}
//this is buildcode
//finalcode
//jfhhfjjfhhjdjjdbhfh
//hhdhjjnhhhdhfh
