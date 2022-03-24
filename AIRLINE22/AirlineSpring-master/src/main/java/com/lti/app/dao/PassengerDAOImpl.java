package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Passenger;

@Repository
public class PassengerDAOImpl implements PassengerDAO{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addUser(Passenger passenger) {
		// TODO Auto-generated method stub
		eMan.persist(passenger);
		return true;
	}

	@Override
	public List<Passenger> getUser() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Passenger").getResultList();
	}

}
