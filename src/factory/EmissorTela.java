package factory;

public class EmissorTela implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Exibindo em tela: " + mensagem);	
	}
}
