package factory;

public class EmissorFactory {

	public static Emissor get(TipoEmissor tipo) {
		Emissor emissor = null;
		switch (tipo) {
		case SMS:
			emissor = new EmissorSms();
			break;
		case EMAIL:
			emissor = new EmissorEmail();
			break;
		case PRINT:
			emissor = new EmissorPrint();
			break;
		case TELA:
			emissor = new EmissorTela();
			break;
		default:
			throw new IllegalArgumentException("Emissor inválido " + tipo);
		}
		return emissor;
	}
}
