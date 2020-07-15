package com.revature.advisors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@ControllerAdvice
@CrossOrigin(
	origins = { "http://localhost:3000" }, 
	methods = { RequestMethod.GET, RequestMethod.PUT, 
				RequestMethod.PATCH, RequestMethod.POST },
	allowedHeaders = { "content-type" }
)
public class CorsAdvisor {
	
}