package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Passenger;

public interface PassengerService {
	public boolean addUser(Passenger passenger);
	public List<Passenger> getUser();

}
