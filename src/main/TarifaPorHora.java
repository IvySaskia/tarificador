package main;

public class TarifaPorHora extends Tarifa {
		
		private int horaInicio;
		private int horaFin;
		
		public TarifaPorHora(double tarifa, int horaInicio, int horaFin) {
			this.tarifa = tarifa;
			this.horaInicio = horaInicio;
			this.horaFin = horaFin;
		}
		
		public int getHoraInicio() {
			return horaInicio;
		}

		public void setHoraInicio(int horaInicio) {
			this.horaInicio = horaInicio;
		}

		public int getHoraFin() {
			return horaFin;
		}

		public void setHoraFin(int horaFin) {
			this.horaFin = horaFin;
		}

		
		public boolean esHoraValida(int hour){
			return hour > this.horaInicio && hour < this.horaFin;
		}
		
		public double calcularCostoLlamada(CDR llamada) {
			return llamada.getDuracion() * this.tarifa;
		}

		public String getType() {
			return this.getClass().getName();
		}
		 
		public CalculadoraDeTarifa crearCalculadora() {
			return new CalculadoraTarifaPorHora();
		}
}
