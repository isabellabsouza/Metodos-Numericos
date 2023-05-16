package bissecao;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		bissecao bis = new bissecao();
		
		System.out.println("********** MÉTODO DA BISSEÇÃO **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Defina a margem de erro (Ε) da função: ");
		bis.setErro(ler.nextDouble());
		
		System.out.println("Defina o limite inferior do intervalo: ");
		bis.setA(ler.nextDouble());
		
		System.out.println("Defina o limite superior do intervalo: ");
		bis.setB(ler.nextDouble());
		
		if(bis.verificaIntervalo()) {
			System.out.println("********** RESULTADO **********");
			System.out.println("Raiz da função tende à: " + bis.calcBissecao());
		}else {
			System.out.println("O intervalo é inválido.");
		}
			
		ler.close();
		
		
	}
}
