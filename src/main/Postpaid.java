package main;

import java.util.List;

public class Postpaid extends Plan{
	
	public Postpaid() {}
	
	public Postpaid(double fare) {
		addFare(new NormalFare(fare));
	}
	
	public Postpaid(NormalFare fare) {
		addFare(fare);
	}
	
	public Postpaid(List<Fare> fareList) {
		setFareList(fareList);
	}
}
