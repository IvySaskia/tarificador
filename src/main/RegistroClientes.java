package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegistroClientes{

	public List<Cliente> clientes = new ArrayList<>();

	

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Cliente getClientePorNumero(Long numero) {
		Cliente cliente = null;
		for(Cliente user: clientes) {
			if(user.getNumero() == numero) {
				cliente = user;
			}
		}
		return cliente;
	}
	
	public void anadirCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
