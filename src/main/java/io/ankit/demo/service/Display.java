package io.ankit.demo.service;

import org.springframework.stereotype.Service;

import io.ankit.demo.beans.Address;

@Service
public interface Display {
	public Address display() throws Exception;
}
