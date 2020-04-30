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

		public void setInitHour(int initHour) {
			this.initHour = initHour;
		}

		public int getEndHour() {
			return endHour;
		}

		public void setEndHour(int endHour) {
			this.endHour = endHour;
		}

		public String getType() {
			return this.getClass().getName();
		}
}
