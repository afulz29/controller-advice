/**
 * 
 */
package io.ankit.demo.beans;

/**
 * @author Ankit Fulzele
 *
 */
public class Address {
	private String street;
	private String state;
	
	public Address() {
		super();
	}
	
	public Address(String street, String state) {
		super();
		this.street = street;
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + "]";
	}
}
