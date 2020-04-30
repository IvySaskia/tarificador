package main;

import java.util.*;

public class Plan{
	
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
	
	public double getFare(CDR cdr) {
		double faree = -1;
		for( Fare fare: this.fareList) {
			MatchFare matcher = fare.createMatch();
			faree = matcher.getMatchingFare(cdr, fare); 
		}
		if(faree == -1) {
			faree = normalFare.getFare();
		}
		return faree;
	}
		
}
