package it.polito.tdp.Yelp.model;

import java.util.Objects;

public class User {
	private String userId;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String name;
	private double averageStars;
	private int reviewCount;
	
	public User(String userId, int votesFunny, int votesUseful, int votesCool, String name, double averageStars,
			int reviewCount) {
		super();
		this.userId = userId;
		this.votesFunny = votesFunny;
		this.votesUseful = votesUseful;
		this.votesCool = votesCool;
		this.name = name;
		this.averageStars = averageStars;
		this.reviewCount = reviewCount;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the averageStars
	 */
	public double getAverageStars() {
		return averageStars;
	}
	/**
	 * @param averageStars the averageStars to set
	 */
	public void setAverageStars(double averageStars) {
		this.averageStars = averageStars;
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
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}
	
	
	
}
