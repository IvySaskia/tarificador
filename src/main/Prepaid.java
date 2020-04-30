package main;

import java.util.List;

public class Prepaid extends Plan {
	
	public Prepaid(double fare){
		setNormalFare(new NormalFare(fare));
	}
	
	public Prepaid(Fare fare){
		setNormalFare(fare);
	}
	
	public Prepaid(Fare fare, List<Fare> fareList){
		setFareList(fareList);
		setNormalFare(fare);
	}
}
