
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.violet.connector.Request;
import org.violet.connector.Util;
import org.violet.manager.CookieMgr;

public class Primitive implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

		Util.p("destory");
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

		Util.p("init");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Util.p("from service1");

		PrintWriter pw = resp.getWriter();

		pw.println("hello violets");
		 
		// String str =  req.getAttribute("kls").toString();
        //Util.p("str : "+str); 
		 
		pw.flush();

	}

}
