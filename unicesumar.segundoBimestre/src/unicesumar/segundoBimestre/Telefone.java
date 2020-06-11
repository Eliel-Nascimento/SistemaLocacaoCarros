package unicesumar.segundoBimestre;

public class Telefone {
	
	private int codDiscagem;
	private int codDDD;
	private int numero;
	
	private Cliente cliente;
	
	public Telefone(int codDiscagem, int codDDD, int numero) {
		this.codDiscagem = codDiscagem;
		this.codDDD = codDDD;
		this.numero = numero;
	}
	
	public int getCodDiscagem() {
		return codDiscagem;
	}
	public int getCodDDD() {
		return codDDD;
	}
	public int getNumero() {
		return numero;
	}
	
	
	

}
