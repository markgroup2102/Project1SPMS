package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.log4j.Logger;

import com.revature.delegates.FrontControllerDelegate;

public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(FrontControllerServlet.class.getName());

	private RequestHandler rh = new RequestHandler();
	
	// this method is where we will funnel all of our requests
	// so that we can give them to the handler to get back the
	// appropriate delegate, then call that delegate
	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FrontControllerDelegate fcd = rh.handle(req, resp);
		
		if (fcd != null)
			fcd.process(req, resp);
		else
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.trace("Receiving get request");
		process(request, response);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.trace("Receiving post request");
		process(request, response);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.trace("Receiving put request");
		process(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.trace("Receiving delete request");
		process(req, resp);
	}
}
