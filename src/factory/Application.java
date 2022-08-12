package factory;

public class Application {
	public static void main(String[] args) {
		String mensagem = "O São Paulo está na semifinal da Sulamericana";
		
		try {
			TipoEmissor tipo = TipoEmissor.FAX;
			Emissor emissor = EmissorFactory.get(tipo);
			emissor.enviar(mensagem);
		} catch (Exception e) {
			System.out.println("Erro ao selecionar o emissor: " + e.getMessage());
		}
				
	}
}
