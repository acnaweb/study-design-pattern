package command;

public class Calculadora implements UseCase {
	private float x;
	private float y;

	public Calculadora(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void executar() {
		float soma = x + y;
		System.out.println("A soma é " + soma);
	}

}
