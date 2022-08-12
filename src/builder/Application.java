package builder;

public class Application {
	
	public static void main(String[] args) {
		try {
			Pessoa pessoa = new PessoaBuilder()
					.addNome("Antonio Carlos")
					.addEndereco("Rua XPTO")
					.build();
			System.out.println(pessoa.getSobrenome());
		} catch (Exception e) {
			System.out.println("Erro ao criar Pessoa: " + e.getMessage());

		}
	}
}
