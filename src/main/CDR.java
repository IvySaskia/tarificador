package main;

import java.util.Date;

public class CDR {

	long numeroOrigen;
	long numeroDestino;
	Date fecha;
	int duracion;
	int hora;
	double costo;
	
	public CDR(){
		
	}
	public CDR(long origin, long destino, int duracion, int hora) {
		this.numeroOrigen = origin;
		this.numeroDestino = destino;
		this.duracion = duracion;
		this.hora = hora;
	}
	
	public CDR(long origin, long destino, int duracion, int hora, Date fecha) {
		this.numeroOrigen = origin;
		this.numeroDestino = destino;
		this.duracion = duracion;
		this.hora = hora;
		this.fecha = fecha;
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
	
	public void calcularCostoLlamada(RegistroClientes listaClientes) {
		RegistroClientes rg = listaClientes;
		Cliente user = rg.getClientePorNumero(numeroOrigen);
		System.out.println(user);
		this.costo = user.getPlan().calcularTarifa(this);
		System.out.println(costo);
	}
	public String join() {
		return this.numeroOrigen + ", " + this.numeroDestino + ", " + this.duracion + ", " + this.hora + ", " + this.costo;
	}
}
