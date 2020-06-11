package unicesumar.segundoBimestre;

public class App {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Paraná", "Maringá", "Rua Arthur Henshel", 398);
		Telefone telefone1 = new Telefone(55, 44, 32258945);
		Cliente leonardo = new Cliente("Leonardo Nasser", "123456789", 18, telefone1, endereco1);
		endereco1.addMoradorCliente(leonardo);

		Carro gol = new Carro("Gol", "volkswagen", "abx_1234", "Preto", 15000, 600);

		Locacao locacao1 = new Locacao("10/06/2020 15:00", "17/06/2020 15:00", 15000, 600, false, leonardo, gol);

		leonardo.addLocacao(locacao1);
		gol.addLocacao(locacao1);

		// Segundo teste
		Endereco endereco2 = new Endereco("São Paulo", "São Paulo", "Rua Peixoto Gomide", 198);
		Telefone telefone2 = new Telefone(55, 11, 33451205);
		Cliente joao = new Cliente("Joao Paulino", "987654321", 28, telefone2, endereco2);
		endereco1.addMoradorCliente(joao);

		Carro onix = new Carro("Onix ltz", "chevrolet", "bah_2454", "Branco", 25342, 700);

		Locacao locacao2 = new Locacao("11/06/2020 15:00", "22/06/2020 15:00", onix.getQuilometragem(), 700, false,joao, onix);

		joao.addLocacao(locacao2);
		onix.addLocacao(locacao2);

		// Testar locacao1
		imprimirTudo(locacao1);

		// Testar locacao2
		imprimirTudo(locacao2);

	}

	public static void imprimirTudo(Locacao locacao1) {

		System.out.println("==========RELATORIO LOCACAO " + locacao1.getCliente().getNome() + "==\\n");
		System.out.println("Data e hora da devolucao: " + locacao1.getDataEHoraDevolucao());
		System.out.println("Data e hora da Entrega: " + locacao1.getDataEHoraLocacao());
		System.out.println("Quilometragem do carro: " + locacao1.getQuilometragem());
		System.out.println("Valor da Locacao: " + locacao1.getValorLocacao());
		System.out.println("Status entregue: " + locacao1.isEstaDevolvido());
		System.out.println("===========================================\n");

		System.out.println("=================CLIENTE================\n");
		System.out.println("Nome: " + locacao1.getCliente().getNome());
		System.out.println("Cpf: " + locacao1.getCliente().getCpf());
		System.out.println("Idade: " + locacao1.getCliente().getIdade());
		System.out.print("Telefone: " + locacao1.getCliente().getTelefone().getCodDiscagem()
				+ locacao1.getCliente().getTelefone().getCodDDD());
		System.out.println(locacao1.getCliente().getTelefone().getNumero());
		for (int i = 0; i < locacao1.getCliente().getEndereco().size(); i++) {
			System.out.println("\n===Endereço===");
			System.out.println("Estado: " + locacao1.getCliente().getEndereco().get(i).getEstado());
			System.out.println("Cidade: " + locacao1.getCliente().getEndereco().get(i).getCidade());
			System.out.println("Rua: " + locacao1.getCliente().getEndereco().get(i).getRua());
			System.out.println("Numero: " + locacao1.getCliente().getEndereco().get(i).getNumero());
		}
		System.out.println("========================================\n");
		System.out.println("==================CARRO=================\n");
		System.out.println("Modelo: " + locacao1.getCarro().getModelo());
		System.out.println("Marca: " + locacao1.getCarro().getMarca());
		System.out.println("Placa: " + locacao1.getCarro().getPlaca());
		System.out.println("Cor: " + locacao1.getCarro().getCor());
		System.out.println("Quilometragem: " + locacao1.getCarro().getQuilometragem());
		System.out.println("Valor da locacao: " + locacao1.getCarro().getValorLocacao());
		System.out.println("=========================================\n\n\n\n");
	}
}
