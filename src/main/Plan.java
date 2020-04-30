package main;

import java.util.*;

public abstract class Plan{
	
	List<Fare> fareList = new ArrayList<>();
	Fare normalFare;
	
	public Fare getNormalFare() {
		return normalFare;
	}

	public void setNormalFare(Fare normalFare) {
		this.normalFare = normalFare;
	}

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
	
	public abstract double getFare(CDR cdr);
		
}
