package com.revature.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Person;
import com.revature.services.PersonService;


/*
 * Endpoints:
 *  /user/login - (POST) log in a user
 *  			- (DELETE) log out a user
 *  /user - (POST) register a user
 * 	/user/:id - (GET) get user by id
 *            - (PUT) update a user
 *            - (DELETE) deletes a user
 */
public class LoginDelegate implements FrontControllerDelegate {
	private PersonService persServVere = new PersonService();
	private ObjectMapper om = new ObjectMapper();
	
	@Override
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = (String) req.getAttribute("path");
		
		if (path.contains("login")) {
			if ("POST".equals(req.getMethod()))
				logIn(req, resp);
			else if ("DELETE".equals(req.getMethod()))
				req.getSession().invalidate();
			else
				resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		} 
	}
	
	private void logIn(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("user");
		
		Person p = null;
		if(username != null) {
			try{
				Integer userId = Integer.valueOf(username);
				p = persServVere.getPersonById(userId);
			}catch(Exception e) {
				
			}
		}
		
		if (p != null) {
			req.getSession().setAttribute("person", p);
			resp.getWriter().write(om.writeValueAsString(p));
		} else {
			resp.sendError(404, "No user found with that username.");
		}
	}
}
