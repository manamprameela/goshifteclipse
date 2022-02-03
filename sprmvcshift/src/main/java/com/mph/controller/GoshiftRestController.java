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

import com.mph.entity.Goshift;
import com.mph.service.GoshiftService;

@RestController
@RequestMapping("/goshift")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class GoshiftRestController {
	
	@Autowired
	public GoshiftService goshiftService;
	
	@GetMapping("/allshift")
	public ResponseEntity<List<Goshift>> listAllGoshift() {
		List<Goshift> li = goshiftService.getAllGoshift();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Goshift>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Goshift>>(li,HttpStatus.OK);
	}
	
	@PostMapping("/createGoshift")
	public Goshift createGoshift(@RequestBody Goshift goshift) {
		goshiftService.createGoshift(goshift);
		return goshift;
	}
	
	@DeleteMapping("/deleteShift/{id}")
	public ResponseEntity<List<Goshift>> deleteGoshift(@PathVariable("id") int sid) {
		List<Goshift> li = goshiftService.deleteGoshift(sid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Goshift>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Goshift>>(li,HttpStatus.OK);
	}
	
	@PutMapping("/updateShift")
	public ResponseEntity<List<Goshift>> updateGoshift(@RequestBody Goshift goshift) {
		List<Goshift> li = goshiftService.updateGoshift(goshift);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Goshift>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Goshift>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/getShift/{sid}")
    public ResponseEntity<Goshift> getGoshift(@PathVariable("sid") int id) {
        
		Goshift goshift = goshiftService.getGoshift(id);
    	if (goshift == null) {
			return new ResponseEntity<Goshift>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Goshift>(goshift,HttpStatus.OK);
    }
}
