/**
 * 
 */
package io.ankit.demo.service;

import org.springframework.stereotype.Service;

import io.ankit.demo.beans.PersonBean;

/**
 * @author Ankit Fulzele
 *
 */
@Service
public interface ExceptionService {
	public PersonBean addPerson(PersonBean personBean);
	
	public PersonBean getPerson();
}
