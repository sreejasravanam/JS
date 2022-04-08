package com.example.IPL.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="player")
@Entity
public class Player {

	@Column(name="player_id")
	@Id
	Integer playerid;
	
	@Column(name ="name")
	String name;
	
	@Column(name ="country")
	String country;
	
	@Column(name ="dob")
	String dob;
	
	@Column(name ="auction_price")
	Double auction_price;
	
	@Column(name ="team_id")
	Integer teamid;
	
	@Column(name ="total_matches")
	Integer totalmatches;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPlayerid() {
		return playerid;
	}

	public void setPlayerid(Integer playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getAuction_price() {
		return auction_price;
	}

	public void setAuction_price(Double auction_price) {
		this.auction_price = auction_price;
	}

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public Integer getTotalmatches() {
		return totalmatches;
	}

	public void setTotalmatches(Integer totalmatches) {
		this.totalmatches = totalmatches;
	}

	public Player(Integer playerid, String name, String country, String dob, Double auction_price, Integer teamid,
			Integer totalmatches) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.country = country;
		this.dob = dob;
		this.auction_price = auction_price;
		this.teamid = teamid;
		this.totalmatches = totalmatches;
	}
	
	
}
