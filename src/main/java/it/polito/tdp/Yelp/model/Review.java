package it.polito.tdp.Yelp.model;

import java.time.LocalDate;

public class Review {
	private String reviewId;
	private Business businessId; //aggiunti come oggetti perchè chiavi esterne
	private User user;
	private double stars;
	private LocalDate reviewDate;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String reviewText;
	
	public Review(String reviewId, Business businessId, User user, double stars, LocalDate reviewDate, int votesFunny,
			int votesUseful, int votesCool, String reviewText) {
		super();
		this.reviewId = reviewId;
		this.businessId = businessId;
		this.user = user;
		this.stars = stars;
		this.reviewDate = reviewDate;
		this.votesFunny = votesFunny;
		this.votesUseful = votesUseful;
		this.votesCool = votesCool;
		this.reviewText = reviewText;
	}

	/**
	 * @return the reviewId
	 */
	public String getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the businessId
	 */
	public Business getBusinessId() {
		return businessId;
	}

	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(Business businessId) {
		this.businessId = businessId;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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

	/**
	 * @return the reviewDate
	 */
	public LocalDate getReviewDate() {
		return reviewDate;
	}

	/**
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}

	/**
	 * @return the votesFunny
	 */
	public int getVotesFunny() {
		return votesFunny;
	}

	/**
	 * @param votesFunny the votesFunny to set
	 */
	public void setVotesFunny(int votesFunny) {
		this.votesFunny = votesFunny;
	}

	/**
	 * @return the votesUseful
	 */
	public int getVotesUseful() {
		return votesUseful;
	}

	/**
	 * @param votesUseful the votesUseful to set
	 */
	public void setVotesUseful(int votesUseful) {
		this.votesUseful = votesUseful;
	}

	/**
	 * @return the votesCool
	 */
	public int getVotesCool() {
		return votesCool;
	}

	/**
	 * @param votesCool the votesCool to set
	 */
	public void setVotesCool(int votesCool) {
		this.votesCool = votesCool;
	}

	/**
	 * @return the reviewText
	 */
	public String getReviewText() {
		return reviewText;
	}

	/**
	 * @param reviewText the reviewText to set
	 */
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	
	
	
	
}
