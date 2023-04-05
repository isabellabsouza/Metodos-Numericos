package BaseNumerica;

public class Menu {
	
	private int opcao;
	
	
	public Menu(int opcao) {
		this.opcao = opcao;
	}
	
	public Menu() {
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void imprimirMenu() {
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Converter um número Binário para Decimal");
		System.out.println("2 - Converter um número Decimal para Binário");
		System.out.println("3 - Finalizar o programa");
		System.out.println("*********************************************");
		System.out.println();

	}

}
