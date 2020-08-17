/**
 * 
 */
package io.ankit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ankit.demo.beans.PersonBean;
import io.ankit.demo.exception.CustomException;
import io.ankit.demo.service.ExceptionService;

/**
 * @author Ankit Fulzele
 *
 */

@RestController
@RequestMapping("api/exception")
public class ExceptionHandlingController {
	@Autowired
	private ExceptionService exceptionService;
	
	@PostMapping(value="addperson",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public PersonBean addPerson(@RequestBody PersonBean person) throws CustomException {
		return exceptionService.addPerson(person);
	}
	
	@GetMapping(value="getperson",produces=MediaType.APPLICATION_JSON_VALUE)
	public PersonBean getPerson() throws CustomException {
		return exceptionService.getPerson();
	}
}
