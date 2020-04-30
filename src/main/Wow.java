package main;

import java.util.ArrayList;
import java.util.List;


public class Wow extends Plan{

	private List<Long> friends = new ArrayList<Long>();
	
	public Wow(double fare) {
		addFare(new NormalFare(fare));
	}
	
	public Wow(double fare, int initHour, int endHour) {
		addFare(new FareByHour(fare, initHour, endHour));
	}
	
	public Wow(List<Fare> fareList) {
		setFareList(fareList);
	}

	public List<Long> getFriends() {
		return friends;
	}

	public void setFriends(List<Long> friends) {
		this.friends = friends;
	}
	
	public void addFriend(long phoneNumber) {
		this.friends.add(phoneNumber);
	}
	
	public void removeFriend(long phoneNumber) {
		int index = this.friends.indexOf(phoneNumber);
		this.friends.remove(index);
	}
}
