package io.ankit.demo.service.impl;

import io.ankit.demo.beans.Address;
import io.ankit.demo.service.Display;

public class DisplayServiceImpl implements Display {

	@Override
	public Address display() throws Exception {
		return new Address("Road","MH");
	}

}
