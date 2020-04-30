package main;

import java.util.List;

public class Postpaid extends Plan{
	
	public Postpaid(double fare) {
		addFare(new NormalFare(fare));
	}
	
	public Postpaid(NormalFare fare) {
		addFare(fare);
	}
	
	public Postpaid(List<Fare> fareList) {
		setFareList(fareList);
	}
	
	public double getFare(CDR cdr) {
		double findedFare = -1;
		for( Fare fare: this.fareList) {
			MatchFare matcher = fare.createMatch();
			findedFare = matcher.getMatchingFare(cdr, fare); 
			if(findedFare != -1) {
				return findedFare;
			}
		}
		findedFare = normalFare.getFare();
		
		return findedFare;
	}
}
