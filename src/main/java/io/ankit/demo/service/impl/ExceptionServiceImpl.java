/**
 * 
 */
package io.ankit.demo.service.impl;

import org.springframework.stereotype.Service;

import io.ankit.demo.beans.Address;
import io.ankit.demo.beans.PersonBean;
import io.ankit.demo.exception.CustomException;
import io.ankit.demo.service.ExceptionService;

/**
 * @author Ankit Fulzele
 *
 */
@Service
public class ExceptionServiceImpl implements ExceptionService {

	/* (non-Javadoc)
	 * @see io.ankit.service.ExceptionService#getPerson()
	 */
	@Override
	public PersonBean addPerson(PersonBean personBean){
		PersonBean person = new PersonBean();
		try {
			if(null != personBean) {
				person.setAge(personBean.getAge());
				person.setName(personBean.getName());
				person.setPersonNo(personBean.getPersonNo());
				person.setSex(personBean.getSex());
				Address address = this.prepareAddress(personBean.getAddress());
				person.setAddress(address);
			}else {
				person.setAge(30);
				person.setName("Ankit");
				person.setPersonNo(2);
				person.setSex('M');
			}
		}catch(Exception npe) {
			int lineNumber = npe.getStackTrace()[0].getLineNumber();
			String methodName = npe.getStackTrace()[0].getMethodName();
			String className = npe.getStackTrace()[0].getClassName();
			String exception = npe.toString();
			String message = exception + " | " +className + " | " +methodName + " | " +lineNumber;
			System.out.println("Exception = "+exception);
			System.out.println("Method Name = "+methodName);
			System.out.println("Line Number = "+lineNumber);
			throw new CustomException(message);
		}
		return person;
	}

	@Override
	public PersonBean getPerson(){
		PersonBean person = new PersonBean();
		try {
			person.setAge(30);
			person.setName("Ankit");
			person.setPersonNo(2);
			person.setSex('M');
		}catch(Exception ex) {
			int lineNumber = ex.getStackTrace()[0].getLineNumber();
			String fileName = ex.getStackTrace()[0].getFileName();
			String methodName = ex.getStackTrace()[0].getMethodName();
			String className = ex.getStackTrace()[0].getClassName();
			String exception = ex.toString();
			String message = exception + " @ " +fileName + " @ " +className + " @ " +methodName + " @ " +lineNumber;
			throw new CustomException(message);
		}
		return person;
	}
	
	private Address prepareAddress(Address address) throws RuntimeException {
		try {
			/*
			 * if(address == null) { address = new Address(); address.setState("MP");
			 * address.setStreet("Road"); }
			 */
			address.setState("MP");
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return address;
	}
}
