package main;

public abstract class Plan{
	
<<<<<<< HEAD
	double tarifa;

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
=======
	List<Fare> fareList = new ArrayList<>();

	public List<Fare> getFareList() {
		return fareList;
	}

	public void setFareList(List<Fare> tarifas) {
		this.fareList = tarifas;
	}
	
	public void addFare(Fare fare) {
		fareList.add(fare);
>>>>>>> 1a99acb... fixing language, spanglish
	}
	public void removeTarifa(Fare fare) {
		
	}
<<<<<<< HEAD
	
	public void addFare(Fare fare) {
		fareList.add(fare);
	}
	public void removeTarifa(Fare fare) {
		
}
