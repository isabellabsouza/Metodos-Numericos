package Secante;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Secante sec = new Secante();
		
		System.out.println("********** MÉTODO DA SECANTE **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Informe o valor de início do intervalo: ");
		sec.setA(ler.nextDouble());
		System.out.println("Informe o valor de fim do intervalo: ");
		sec.setB(ler.nextDouble());
		System.out.println("Informe a margem de erro: ");
		sec.setErro(ler.nextInt());
		
		System.out.println("********** RESULTADO **********");
		System.out.println("A raiz tende a: " + sec.calcSecante());
		
		ler.close();
	}
}
