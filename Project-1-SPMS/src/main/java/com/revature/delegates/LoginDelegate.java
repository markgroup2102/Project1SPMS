package com.revature.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Person;
import com.revature.services.PersonService;


/*
 * Original Author Sierra Nicholes
 * Endpoints:
 *  /user/login - (POST) log in a user
 * 	/user/:id - (GET) get user by id
 *            - (PUT) update a user
 */
public class LoginDelegate implements FrontControllerDelegate {
	private PersonService persServVere = 
			new PersonService();
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
		} else {
			userWithId(req, resp, Integer.valueOf(path));
		}
	}
	
	private void logIn(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String userId = req.getParameter("userId");
		Integer id = null;
		
		/*
		 *  This database gets users by their user number
		 *  so we take whatever username they give us and try to parse it into
		 *  an integer 
		 */
		if(userId!=null) {
			try {
				id = Integer.valueOf(userId);
			}catch (Exception e){
				resp.sendError(404, "No user found with that username.");
			}
		}
		
		Person p = persServVere.getPersonById(id);
		System.out.println(p);
		if (p != null) {
			
		} else {
			resp.sendError(404, "No user found with that username.");
		}
	}
	
	private void userWithId(HttpServletRequest req, HttpServletResponse resp, Integer id) throws IOException {
		switch (req.getMethod()) {
			case "GET":
				Person p = persServVere.getPersonById(id);
				if (p != null) {
					resp.getWriter().write(om.writeValueAsString(p));
				} else {
					resp.sendError(404, "Person not found.");
				}
				break;
			case "PUT":
				Person person = (Person) req.getSession().getAttribute("person");
				if (person != null) {
					//person.setPassword(password);
					//pServ.updatePerson(person);
				} else
					resp.sendError(HttpServletResponse.SC_UNAUTHORIZED);
				break;
		}
	}

}
