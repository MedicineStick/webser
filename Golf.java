import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.violet.connector.Request;
import org.violet.connector.Util;
import org.violet.manager.CookieMgr;

public class Golf extends HttpServlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Util.p("from service2");
		PrintWriter pw = resp.getWriter();
		// CookieMgr cMgr = new CookieMgr();
		// Util.p(cMgr.getCookieByName((HttpServletRequest)arg0,
		// "kls").getValue());
		// Util.p(req.getAttribute("ss").toString());

		pw.println("hello golf");
		 
		pw.flush();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		PrintWriter pw = resp.getWriter();
		pw.println("hello golf");

	}

}
