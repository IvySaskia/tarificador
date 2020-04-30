package main;

import java.util.List;

public class Prepaid extends Plan {
	
	public Prepaid(double fare){
		addFare(new NormalFare(fare));
	}
	
	public Prepaid(Fare fare){
		addFare(fare);
	}
	
	public Prepaid(List<Fare> fareList){
		setFareList(fareList);
	}
}
