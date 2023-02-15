package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.Yelp.model.Business;

public class yelpDAO {
	
	public List<Business> readAllBusinesses() {
		//leggo tutti i business dal database
		
		String query = "SELECT * FROM Business";
		
		List<Business> result = new ArrayList<>();
		
		Connection conn =  dbConnect.getConnection();
		try {
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			
			while (rs.next())
				result.add(new Business(
						rs.getString("business_id"),   rs.getString("full_address"), rs.getString("active"), 
						rs.getString("categories"),    rs.getString("city"), 		 rs.getInt("review_count"), 
						rs.getString("business_name"), rs.getString("neighborhoods"), rs.getDouble("latitude"), 
						rs.getDouble("longitude"),     rs.getString("state"),		 rs.getDouble("stars")));
			rs.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	 
	public double averageStars(Business business) {
		//leggo tutte le revs del business e ne faccio la media

		String query = "SELECT AVG(stars) AS res, COUNT(*) AS number FROM reviews WHERE business_id = ?";
		
		double result = 0;
		Connection conn =  dbConnect.getConnection();
		
		try {
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1,business.getBusinessId());
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
				result = rs.getDouble("res");	
			
			rs.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
		
	}

}
