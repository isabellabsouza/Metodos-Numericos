package FalsaPosicao;

import java.util.Scanner;


public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		FalsaPosicao fs = new FalsaPosicao();
		
		System.out.println("********** MÉTODO DA FALSA POSIÇÃO **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Defina a margem de erro (Ε) da função: ");
		fs.setErro(ler.nextDouble());
		
		System.out.println("Defina o limite inferior do intervalo: ");
		fs.setA(ler.nextDouble());
		
		System.out.println("Defina o limite superior do intervalo: ");
		fs.setB(ler.nextDouble());
		
		if(fs.verificaIntervalo()) {
			System.out.println("********** RESULTADO **********");
			System.out.println("Raiz da função tende à: " + fs.calcFalsaPosicao());
		}else {
			System.out.println("O intervalo é inválido.");
		}
		ler.close();

	}
	

}
