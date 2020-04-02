package main;

import java.util.Date;

public class Llamada {

	long numeroOrigen;
	long numeroDestino;
	Date fecha;
	int duracion;
	int hora;
	
	public Llamada(){
		
	}
	
	public Llamada(long origin, long destino, int duracion, int hora) {
		this.numeroOrigen = origin;
		this.numeroDestino = destino;
		this.duracion = duracion;
		this.hora = hora;
	}
	
	public long getNumeroOrigen() {
		return numeroOrigen;
	}

	public void setNumeroOrigen(long numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}

	public long getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(long numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
}
