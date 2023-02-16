package it.polito.tdp.Yelp.model;

import java.util.List;

import it.polito.tdp.Yelp.db.yelpDAO;

public class Model {

	private List<Business> businesses = null;
	
	public List<Business> getBusinesses() {
		
		if (this.businesses == null) {
			yelpDAO dao = new yelpDAO();
			this.businesses = dao.readAllBusinesses();
		}
		
		return businesses;
	
	}
}
