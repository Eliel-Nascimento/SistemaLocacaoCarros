package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Endereco {
	
	private String estado;
	private String cidade;
	private String rua;
	private int numero;

	private List<Cliente> morador = new ArrayList<>();
	
	public Endereco(String estado, String cidade, String rua, int numero) {
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}

	
	public void addMoradorCliente(Cliente c) {
		morador.add(c);
	}
	
	public String getEstado() {
		return estado;
	}


	public String getCidade() {
		return cidade;
	}


	public String getRua() {
		return rua;
	}


	public int getNumero() {
		return numero;
	}





}
