/**
 * 
 */
package io.ankit.demo.beans;

/**
 * @author Ankit Fulzele
 *
 */
public class PersonBean {
	private int personNo;
	private int age;
	private String name;
	private char sex;
	private Address address;
	
	public int getPersonNo() {
		return personNo;
	}
	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonBean [personNo=" + personNo + ", age=" + age + ", name=" + name + ", sex=" + sex + ", address="
				+ address + "]";
	}
}
