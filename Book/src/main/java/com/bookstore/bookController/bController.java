package com.bookstore.bookController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class bController {

	@RequestMapping(value="/")
	public void redirect(HttpServletRequest response)  {
		//response.sendRedirect("/swagger-ui.html");
		response.sendRedirect("/swagger-ui.html");
		
	}
	
	

}
