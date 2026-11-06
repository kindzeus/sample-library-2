package com.mahendra.library.rest;

import java.io.IOException;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Hidden;

@Controller
@Hidden
public class HomeController {

	@GetMapping("/")
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui/index.html");
	}
}
