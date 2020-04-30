package main;

public abstract class Fare {
	
	protected double fare;
	
	public Fare(){
	}
	
	public Fare(double fare){
		this.fare = fare;
	}
	
	public double getFare() {
		return this.fare;
	}
	public abstract String getType();

	public void setFare(float fare) {
		this.fare = fare;
	}

}
