package com.cal.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CalculatorAppInit { //implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(CalculatorAppConfig.class);
		
		//create dispatcher servlet
		DispatcherServlet disp = new DispatcherServlet(webApplicationContext);
		
		//register disp with servlet-context
		ServletRegistration.Dynamic mydisp = servletContext.addServlet("myDisp", disp);
		//mydisp.setLoadOnStartup(1);
		//mydisp.addMapping("/*");
	}

}
