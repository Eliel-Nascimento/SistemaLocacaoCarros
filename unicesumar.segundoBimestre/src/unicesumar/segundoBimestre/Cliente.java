package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	
	private Telefone telefone;

	private List<Locacao> locacoes = new ArrayList<>();
	private List<Endereco> enderecos = new ArrayList<>();

	public Cliente(String nome, String cpf, int idade, Telefone telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		this.enderecos.add(endereco);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}
	public Telefone getTelefone() {
		return telefone;
	}

	public List<Endereco> getEndereco() {
		return enderecos;
	}

	public void addLocacao(Locacao l) {
		locacoes.add(l);
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	

}
