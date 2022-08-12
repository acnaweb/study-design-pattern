package command;

public class Application {
	public static void main(String[] args) {
		
		ListaDeComandos listaDeComandos = new ListaDeComandos();
		listaDeComandos.add(new Calculadora(5, 56));
		listaDeComandos.add(new Acelerador());
		listaDeComandos.executar();
	}
}
