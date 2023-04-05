package PontoFixo;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		PontoFixo pt = new PontoFixo();
		
		System.out.println("********** MÉTODO DO PONTO FIXO **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Defina o Epsylon (Ε) da função: ");
		pt.setEps(ler.nextDouble());
		System.out.println("Defina o número máximo de iterações: ");
		pt.setMaxIteracoes(ler.nextInt());
		System.out.println("Defina o x0 da função: ");
		pt.setxZero(ler.nextDouble());
		
		System.out.println("********** RESULTADO **********");
		System.out.println("Raiz da função tende à: " + pt.calcPontoFixo());
		
		ler.close();
	}
	
}
