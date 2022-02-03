package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Logins;
import com.mph.service.LoginsService;

/**
 * @author Prasanna Devi
 * @author Siva Krishna
*/
@RestController
@RequestMapping("/logins")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.POST} )
public class LoginsRestController {
	
	@Autowired
	public LoginsService loginsService;
	
	/** Gets the employee’s logins.
	 * @return the employee’s logins.
	*/
	@PostMapping("/createLogins")
	public Logins createLogins(@RequestBody Logins logins) {
		loginsService.createLogins(logins);
		return logins;
	}

}
