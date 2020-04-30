package main;

import java.util.Date;

public class CDR {

	long originPhoneNumber;
	long destinationPhoneNumber;
	Date date;
	int duration;
	int hour;
	double cost;
	
	public CDR(){
		
	}

	public CDR(long originPhoneNumber, long destinationPhoneNumber, int duration, int hour, Date date) {
		this.originPhoneNumber = originPhoneNumber;
		this.destinationPhoneNumber = destinationPhoneNumber;
		this.duration = duration;
		this.hour = hour;
		this.date = date;
	}
	
	public long getOriginPhoneNumber() {
		return originPhoneNumber;
	}

	public void setOriginPhoneNumbern(long originPhoneNumber) {
		this.originPhoneNumber = originPhoneNumber;
	}

	public long getNumerodestinationPhoneNumber() {
		return destinationPhoneNumber;
	}

	public void setNumerodestinationPhoneNumber(long destinationPhoneNumber) {
		this.destinationPhoneNumber = destinationPhoneNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void calculateCostCall(ClientRegistry clientList) {
		ClientRegistry clientRegistration = clientList;
		Client user = clientRegistration.getClientByNumber(originPhoneNumber);
		System.out.println(user);
		this.cost = user.getPlan().calcularTarifa(this);
		System.out.println(cost);
	}
	public String join() {
		return this.originPhoneNumber + ", " + this.destinationPhoneNumber + ", " + this.duration + ", " + this.hour + ", " + this.cost;
	}
}
