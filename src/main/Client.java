package main;

public class Client{

	public Plan plan;
	public long phoneNumber;
	
	Client(){
	}
	
	public Client(Plan plan, long phoneNumber){
		this.plan = plan;
		this.phoneNumber = phoneNumber;
	}
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setNumero(long numero) {
		this.phoneNumber = numero;
	}
}
