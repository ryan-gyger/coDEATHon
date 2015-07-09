package com.usaa.itnhap.gollum.garrison.domain;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by ryan_000 on 7/9/2015.
 */
public class Flight {
	private int flight_id;
	private String depCity;
	private Time depTime;
	private Date depDate;
	private String arrCity;
	private Time arrTime;
	private Date arrDate;

	public int getFlight_id () {
		return this.flight_id;
	}

	public void setFlight_id (int flight_id) {
		this.flight_id = flight_id;
	}

	public String getDepCity () {
		return this.depCity;
	}

	public void setDepCity (String depCity) {
		this.depCity = depCity;
	}

	public Time getDepTime () {
		return this.depTime;
	}

	public void setDepTime (Time depTime) {
		this.depTime = depTime;
	}

	public Date getDepDate () {
		return this.depDate;
	}

	public void setDepDate (Date depDate) {
		this.depDate = depDate;
	}

	public String getArrCity () {
		return this.arrCity;
	}

	public void setArrCity (String arrCity) {
		this.arrCity = arrCity;
	}

	public Time getArrTime () {
		return this.arrTime;
	}

	public void setArrTime (Time arrTime) {
		this.arrTime = arrTime;
	}

	public Date getArrDate () {
		return this.arrDate;
	}

	public void setArrDate (Date arrDate) {
		this.arrDate = arrDate;
	}
}
