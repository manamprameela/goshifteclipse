package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Registration;
import com.mph.service.RegistrationService;

@RestController
@RequestMapping("/registration")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class RegistrationRestController {

	@Autowired
	public RegistrationService registrationService;
	
	@GetMapping("/allreg")
	public ResponseEntity<List<Registration>> listAllRegistration() {
		List<Registration> li = registrationService.getAllRegistration();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Registration>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Registration>>(li,HttpStatus.OK);
	}
	
	@PostMapping("/createRegister")
	public Registration createGoshift(@RequestBody Registration registration) {
		registrationService.createRegistration(registration);
		return registration;
	}
	
	@DeleteMapping("/deleteRegister/{id}")
	public ResponseEntity<List<Registration>> deleteRegistration(@PathVariable("id") int rid) {
		List<Registration> li = registrationService.deleteRegistration(rid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Registration>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Registration>>(li,HttpStatus.OK);
	}
	
	@PutMapping("/updateRegister")
	public ResponseEntity<List<Registration>> updateRegistration(@RequestBody Registration registration) {
		List<Registration> li = registrationService.updateRegistration(registration);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Registration>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Registration>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/getRegister/{rid}")
    public ResponseEntity<Registration> getRegistration(@PathVariable("rid") int id) {
        
		Registration registration = registrationService.getRegistration(id);
    	if (registration == null) {
			return new ResponseEntity<Registration>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Registration>(registration,HttpStatus.OK);
    }
}
