package main;

public class NormalFare extends Fare {
	
	public NormalFare(double fare) {
		this.fare = fare;
	}

	public boolean esHoraValida(int hour) {
		return false;
	}

	@Override
	public String getType() {
		return this.getClass().getName();
	}
}
