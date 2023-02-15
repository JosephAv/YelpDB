package it.polito.tdp.Yelp.model;

import java.util.Objects;

public class Business {
	
	private String businessId;
	private String fullAddress;
	private String active;
	private String categories;
	private String city;
	private int reviewCount;
	private String businessName;
	private String neighborhoods;
	private double latitude;
	private double longitude;
	private String state;
	private double stars;
	
	public Business(String businessId, String fullAddress, String active, String categories, String city,
			int reviewCount, String businessName, String neighborhoods, double latitude, double longitude, String state,
			double stars) {
		super();
		this.businessId = businessId;
		this.fullAddress = fullAddress;
		this.active = active;
		this.categories = categories;
		this.city = city;
		this.reviewCount = reviewCount;
		this.businessName = businessName;
		this.neighborhoods = neighborhoods;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.stars = stars;
	}

	/**
	 * @return the businessId
	 */
	public String getBusinessId() {
		return businessId;
	}

	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	/**
	 * @return the fullAddress
	 */
	public String getFullAddress() {
		return fullAddress;
	}

	/**
	 * @param fullAddress the fullAddress to set
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * @return the categories
	 */
	public String getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String categories) {
		this.categories = categories;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the reviewCount
	 */
	public int getReviewCount() {
		return reviewCount;
	}

	/**
	 * @param reviewCount the reviewCount to set
	 */
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * @return the neighborhoods
	 */
	public String getNeighborhoods() {
		return neighborhoods;
	}

	/**
	 * @param neighborhoods the neighborhoods to set
	 */
	public void setNeighborhoods(String neighborhoods) {
		this.neighborhoods = neighborhoods;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the stars
	 */
	public double getStars() {
		return stars;
	}

	/**
	 * @param stars the stars to set
	 */
	public void setStars(double stars) {
		this.stars = stars;
	}

	@Override
	public int hashCode() {
		return Objects.hash(businessId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Business other = (Business) obj;
		return Objects.equals(businessId, other.businessId);
	}
	
	
	
	
}
