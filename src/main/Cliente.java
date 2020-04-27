package main;

public class Cliente{

	public Plan plan;
	public long numero;
	
	Cliente(){
	}
	
	public Cliente(Plan plan, long numero){
		this.plan = plan;
		this.numero = numero;
	}
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
}
