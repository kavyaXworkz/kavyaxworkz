package com.xworkz.workzapp.plane;

public class FliteBookingDTO {
	private String airplaneCode;
	private Constant company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean demostic;
	private double businssClassPrice;
	private double economyClassPrice;

     
     public Constant getCompany() {
		return company;
	}

	public void setCompany(Constant company) {
		this.company = company;
	}

	public String getAirplaneCode() {
		return airplaneCode;
	}

	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	} 

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public boolean isDemostic() {
		return demostic;
	}

	public void setDemostic(boolean demostic) {
		this.demostic = demostic;
	}

	public double getBusinssClassPrice() {
		return businssClassPrice;
	}

	public void setBusinssClassPrice(double businssClassPrice) {
		this.businssClassPrice = businssClassPrice;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}

}
