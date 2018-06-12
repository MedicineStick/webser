package org.violet.bootstrap;

import org.violet.connector.HttpConnector;
import org.violet.connector.Util;
import org.violet.container.Valve;
import org.violet.container.Wrapper;
import org.violet.core.impl.ClientIPLoggerValve;

import org.violet.core.impl.SimpleWrapper;
import org.violet.core.impl.SimpleValve;

public class Bootstrap {

	public static void main(String[] args) {
		HttpConnector hc = new HttpConnector();
		Wrapper wrapper = new SimpleWrapper();
		String s = "PrimitiveServlet";
		wrapper.setServletClass(s);
		Util.p(wrapper.getServletClass());

		// URLClassLoader loader = new SimpleLoader().getClassLoader();

		// wrapper.setLoader(loader);
		Valve valve2 = new SimpleValve();
		Valve valve1 = new ClientIPLoggerValve();

		wrapper.getPipeline().setBasic(valve2);
		wrapper.getPipeline().addValve(valve1);

		hc.setContainer(wrapper);

		hc.start();

	}

}
