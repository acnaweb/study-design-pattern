package factory;

public class EmissorSms implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando SMS: " + mensagem);	
	}

}
