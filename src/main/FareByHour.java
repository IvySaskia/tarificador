package main;

public class FareByHour extends Fare {
		
		private int initHour;
		private int endHour;
		
		public FareByHour(double fare, int initHour, int endHour) {
			this.fare = fare;
			this.initHour = initHour;
			this.endHour = endHour;
		}
		
		public int getInitHour() {
			return initHour;
		}

		public void setInitHour(int horaInicio) {
			this.initHour = horaInicio;
		}

		public int getEndHour() {
			return endHour;
		}

		public void setEndHour(int horaFin) {
			this.endHour = horaFin;
		}

		public String getType() {
			return this.getClass().getName();
		}
		
		public MatchFare createMatch() {
			return new MatchFareByHour();
		}
}
