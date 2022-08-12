package factory;

public class EmissorPrint implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Imprimindo a mensagem: " + mensagem);	
	}

}
