package main;

import java.util.Date;

public class CDR {

	long originPhoneNumberPhoneNumber;
	long destinationPhoneNumber;
	Date date;
	int duration;
	int hour;
	double cost;
	
	public CDR(){
		
	}
	public CDR(long originPhoneNumber, long destinationPhoneNumber, int duration, int hour) {
		this.originPhoneNumberPhoneNumber = originPhoneNumber;
		this.destinationPhoneNumber = destinationPhoneNumber;
		this.duration = duration;
		this.hour = hour;
	}
	
	public CDR(long originPhoneNumber, long destinationPhoneNumber, int duration, int hour, Date date) {
		this.originPhoneNumberPhoneNumber = originPhoneNumber;
		this.destinationPhoneNumber = destinationPhoneNumber;
		this.duration = duration;
		this.hour = hour;
		this.date = date;
	}
	
	public long getNumeroOrigen() {
		return originPhoneNumberPhoneNumber;
	}

	public void setNumeroOrigen(long numeroOrigen) {
		this.originPhoneNumberPhoneNumber = numeroOrigen;
	}

	public long getNumerodestinationPhoneNumber() {
		return destinationPhoneNumber;
	}

	public void setNumerodestinationPhoneNumber(long numerodestinationPhoneNumber) {
		this.destinationPhoneNumber = numerodestinationPhoneNumber;
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
	
	public void calculateCostCall(ClientRegistration clientList) {
		ClientRegistration clientRegistration = clientList;
		Client user = clientRegistration.getClientByNumber(originPhoneNumberPhoneNumber);
		System.out.println(user);
		this.cost = user.getPlan().calcularTarifa(this);
		System.out.println(cost);
	}
	public String join() {
		return this.originPhoneNumberPhoneNumber + ", " + this.destinationPhoneNumber + ", " + this.duration + ", " + this.hour + ", " + this.cost;
	}
}
