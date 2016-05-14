package com.historicalplaces.core;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This class contains Servlet which listen requests 
 * from Authenticated and Authorized users. For this knowledge it asks 
 * AuthenticationManager. It converts requests to Data Objects 
 * ** //actually it should not. This operation should be performed in other place. 
 * ** //Need to think about this more.
 * and provides them to RequestProcessor. 
 * Then receives response and translate it back to user.
 */

public class RequestListenerServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
	}

}
