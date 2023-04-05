package Rieman;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Rieman ri = new Rieman();
		
		System.out.println("********** CÁLCULO DE RIEMAN **********");
		System.out.println("Cálculo para a função x^3-9x+5");
		System.out.println("Informe o valor de início do intervalo: ");
		ri.setInicio(ler.nextDouble());
		System.out.println("Informe o valor de fim do intervalo: ");
		ri.setFim(ler.nextDouble());
		System.out.println("Informe o número de divisões: ");
		ri.setDivisoes(ler.nextInt());
		
		System.out.println("********** RESULTADO **********");
		System.out.println("A área aproximada é: " + ri.calcArea());
		
		ler.close();
	}

}
