package Newton;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Newton nt = new Newton();
		
		System.out.println("********** MÉTODO DE NEWTON **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Defina o Epsylon (Ε) da função: ");
		nt.setEps(ler.nextDouble());
		System.out.println("Defina o número máximo de iterações: ");
		nt.setMaxIteracoes(ler.nextInt());
		System.out.println("Defina o x0 da função: ");
		nt.setxZero(ler.nextDouble());
		
		System.out.println("********** RESULTADO **********");
		System.out.println("Raiz da função tende à: " + nt.calcNewton());
		
		ler.close();

	}

}
