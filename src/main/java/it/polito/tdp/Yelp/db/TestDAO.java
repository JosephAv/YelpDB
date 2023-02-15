package it.polito.tdp.Yelp.db;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.polito.tdp.Yelp.model.Business;

public class TestDAO {

	public static void main(String[] args) {
		yelpDAO dao = new yelpDAO();
		Logger logger = LoggerFactory.getLogger(TestDAO.class);
		logger.debug("fava");

		List<Business> businesses = dao.readAllBusinesses();
		
		System.out.println(businesses.size());
		
		logger.info("this is an info");
		logger.warn("this is a warning");
		logger.error("this is an error");
		
		
		long startTime = System.nanoTime();
		List<Double> allStars = new ArrayList<>();
		
		for (Business b : businesses) {
			double avgStars = dao.averageStars(b);
			allStars.add(avgStars);
		}
		//System.out.println(allStars);
		long endTime = System.nanoTime();
		//System.out.println("Time elapsed: " + (endTime-startTime)/1000);
		logger.info("Time elapsed: " + (endTime-startTime)/1000);
	}
} 
