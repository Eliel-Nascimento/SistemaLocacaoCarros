package unicesumar.segundoBimestre;

import java.util.Date;

public class Locacao {

	private String 	dataEHoraLocacao;
	private String 	dataEHoraDevolucao;
	private long 	quilometragem;
	private double 	valorLocacao;
	private boolean estaDevolvido;

	private Cliente cliente;
	private Carro carro;
	
	public Locacao(String dataEHoraLocacao, String dataEHoraDevolucao, long quilometragem, double valorLocacao,
			boolean estaDevolvido, Cliente cliente, Carro carro) {	
		this.dataEHoraLocacao = dataEHoraLocacao;
		this.dataEHoraDevolucao = dataEHoraDevolucao;
		this.quilometragem = quilometragem;
		this.valorLocacao = valorLocacao;
		this.estaDevolvido = estaDevolvido;
		this.cliente = cliente;
		this.carro = carro;

	}

	public String getDataEHoraLocacao() {
		return dataEHoraLocacao;
	}

	public String getDataEHoraDevolucao() {
		return dataEHoraDevolucao;
	}

	public long getQuilometragem() {
		return quilometragem;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public boolean isEstaDevolvido() {
		return estaDevolvido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	
	
	
	
	
	
	
	
}
