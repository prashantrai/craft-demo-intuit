package com.intuit.demo.model;
 
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "PLAYER") 
public class Player implements Serializable {
	
	/*
playerID,birthYear,birthMonth,birthDay,birthCountry,birthState,birthCity,deathYear,deathMonth,deathDay,deathCountry,deathState,deathCity,nameFirst,nameLast,nameGiven,weight,height,bats,throws,debut,finalGame,retroID,bbrefID
aardsda01,1981,12,27,USA,CO,Denver,,,,,,,David,Aardsma,David Allan,215,75,R,R,2004-04-06,2015-08-23,aardd001,aardsda01


Sumageetha Thota to Everyone (11:22 AM)
The json representation of a player should be the following, where each field name is equal to the CSV column name:

{
    "playerID": "aardsda01",
    "birthYear": 1981,
    "birthMonth": 12,
    "birthDay": 27,
    "deathYear": null,
    "deathMonth": null,
    "deathDay": null,
    "nameFirst": "David",
    "nameLast": "Aardsma",
    "height": 75,
    ...
    ...
}
	 * 
	 * */

	private static final long serialVersionUID = 5058523409647825934L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="playerID")
	private Long playerID;
	
	@Column(name="birthYear")
	private int birthYear;
	
	@Column(name="birthMonth")
	private int birthMonth;
	
	@Column(name="birthDay")
	private int birthDay;
	
	@Column(name="birthCountry")
	private String birthCountry;
	
	@Column(name="birthState")
	private String birthState;
	
	@Column(name="birthCity")
	private String birthCity;

	@JsonInclude(Include.ALWAYS)
	@Column
	private int deathYear;
	
//	@JsonInclude(Include.ALWAYS)
	@Column
	private int deathMonth;
	
//	@JsonInclude(Include.ALWAYS)
	@Column
	private int deathDay;
	
//	@JsonInclude(Include.ALWAYS)
	@Column
	private String deathCountry;
	
//	@JsonInclude(Include.ALWAYS)
	@Column
	private String deathState;
	
//	@JsonInclude(Include.ALWAYS)
	@Column
	private String deathCity;

	@Column
	private String nameFirst;
	
	@Column
	private String nameLast;
	
	@Column
	private String nameGiven;
	
	@Column
	private int weight;
	
	/*@Column
	private int height;

	@Column
	private String bats;
	
	@Column
	private String _throws;
	
	@Column
	private String debut;
	
	@Column
	private String finalGame;
	
	@Column
	private String retroID;
	
	@Column
	private String bbrefID; */
	
	public Long getPlayerID() {
		return playerID;
	}
	public void setPlayerID(Long playerID) {
		this.playerID = playerID;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public String getBirthCountry() {
		return birthCountry;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public String getBirthState() {
		return birthState;
	}
	public void setBirthState(String birthState) {
		this.birthState = birthState;
	}
	public String getBirthCity() {
		return birthCity;
	}
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}
	public int getDeathYear() {
		return deathYear;
	}
	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}
	public int getDeathMonth() {
		return deathMonth;
	}
	public void setDeathMonth(int deathMonth) {
		this.deathMonth = deathMonth;
	}
	public int getDeathDay() {
		return deathDay;
	}
	public void setDeathDay(int deathDay) {
		this.deathDay = deathDay;
	}
	public String getDeathCountry() {
		return deathCountry;
	}
	public void setDeathCountry(String deathCountry) {
		this.deathCountry = deathCountry;
	}
	public String getDeathState() {
		return deathState;
	}
	public void setDeathState(String deathState) {
		this.deathState = deathState;
	}
	public String getDeathCity() {
		return deathCity;
	}
	public void setDeathCity(String deathCity) {
		this.deathCity = deathCity;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	public String getNameGiven() {
		return nameGiven;
	}
	public void setNameGiven(String nameGiven) {
		this.nameGiven = nameGiven;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/*public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getBats() {
		return bats;
	}
	public void setBats(String bats) {
		this.bats = bats;
	}
	public String get_throws() {
		return _throws;
	}
	public void set_throws(String _throws) {
		this._throws = _throws;
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getFinalGame() {
		return finalGame;
	}
	public void setFinalGame(String finalGame) {
		this.finalGame = finalGame;
	}
	public String getRetroID() {
		return retroID;
	}
	public void setRetroID(String retroID) {
		this.retroID = retroID;
	}
	public String getBbrefID() {
		return bbrefID;
	}
	public void setBbrefID(String bbrefID) {
		this.bbrefID = bbrefID;
	}*/
	
}
