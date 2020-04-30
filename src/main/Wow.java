package main;

import java.util.ArrayList;
import java.util.List;


public class Wow extends Plan{

	private List<Long> friends = new ArrayList<Long>();
	
<<<<<<< HEAD
	public Wow() {}
	
	public Wow(double tarifa, List<Long> amigos) {
		this.tarifa = tarifa;
		this.amigos = amigos;
		
	}
	@Override
	public double calcularCostoLlamada(CDR cdr) {
		if(!amigos.isEmpty()) {
			if(amigos.contains(cdr.numeroDestino))
				return 0;
		}
		return tarifa * llamada.getDuracion();
=======
	public Wow(double fare) {
		addFare(new NormalFare(fare));
	}
	
	public Wow(double fare, int initHour, int endHour) {
		addFare(new FareByHour(fare, initHour, endHour));
	}
	
	public Wow(List<Fare> fare) {
		setFareList(fare);
>>>>>>> 1a99acb... fixing language, spanglish
	}

	public List<Long> getFriends() {
		return friends;
	}

	public void setFriends(List<Long> friends) {
		this.friends = friends;
	}
	
	public void addFriend(long number) {
		this.friends.add(number);
	}
	
	public void addFriend(long number) {
		this.friends.add(number);
	}
	
	public void removeFriend(long phoneNumber) {
		int index = this.friends.indexOf(phoneNumber);
		this.friends.remove(index);
	}
}
