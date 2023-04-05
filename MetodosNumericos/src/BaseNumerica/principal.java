package BaseNumerica;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		BinDec bin = new BinDec();
		DecBin dec = new DecBin();
		Menu opcao = new Menu();
		
		opcao.setOpcao(0);
		
		
		do {
			
			opcao.imprimirMenu();
			opcao.setOpcao(ler.nextInt());
			System.out.println(">> Opção " + opcao.getOpcao() + " selecionada.");
			
			switch(opcao.getOpcao()) {
			case 1: System.out.println("Informe um número na base binária:");
					ler.nextLine();
					bin.setNumBinario(ler.nextLine());
					System.out.println("O número " + bin.getNumBinario() + " em decimal é: " + bin.getDecimal());
					break;
					
			case 2: System.out.println("Informe um número na base decimal:");
					dec.setNumDecimal(ler.nextInt());
					System.out.print("O número " + dec.getNumDecimal() + " em binário é: ");
					dec.getBinario();
					//dec.getBinario();
					break;
					
			case 3: System.out.println("O programa foi finalizado.");
					System.exit(0);
					break;
					
			default: System.out.println("Opcao inválida. Por favor, escolha novamente.");
					break;
			
			}
			
		}while(opcao.getOpcao() != 3);
		ler.close();
		
		/*
		System.out.println("CONVERSOR BINARIO-DECIMAL");
		//System.out.println("O numero a ser convertido esta na base binaria ou decimal?");
		System.out.println("Informe um numero binario: ");
		bin.setNumBinario(ler.nextLine());
		
		System.out.println("O número " + bin.getNumBinario() + " em decimal é:" + bin.getDecimal());
		
		
		System.out.println("Informe um numero decimal: ");
		dec.setNumDecimal(ler.nextInt());
		dec.getBinario();
		//System.out.println("O número " + dec.getNumDecimal() + " em binário é:" + dec.getBinario());*/
		
	}


}
