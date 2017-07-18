package com.main.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.main.model.BeerExpert;

@SuppressWarnings("serial")
public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException {
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> results = be.getBrands(c);
		request.setAttribute("styles", results);
		RequestDispatcher view = request.getRequestDispatcher("jsp/results.jsp");
		view.forward(request, response);
	}

}
