package main;

import java.util.*;

public class Plan{
	
	List<Fare> fareList = new ArrayList<>();

	public List<Fare> getFareList() {
		return fareList;
	}

	public void setFareList(List<Fare> tarifas) {
		this.fareList = tarifas;
	}
	
	public void addFare(Fare fare) {
		fareList.add(fare);
	}
	public void removeTarifa(Fare fare) {
	}
		
}
