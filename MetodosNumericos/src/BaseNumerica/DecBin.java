package BaseNumerica;

public class DecBin {
	
	private int numDecimal;

	public DecBin(int numDecimal) {
		this.numDecimal = numDecimal;
	}

	public DecBin() {
	}

	public int getNumDecimal() {
		return numDecimal;
	}

	public void setNumDecimal(int numDecimal) {
		this.numDecimal = numDecimal;
	}
	
	public void getBinario() {
		
		int[] numBinario = new int[32];
		int indice = 0;
		
		while (numDecimal > 0) {
            numBinario[indice++] = numDecimal % 2;
            numDecimal /= 2;
        }
		
		for (int i = indice - 1; i >= 0; i--) {
            System.out.print(numBinario[i]);
        }
		
		
	}

}
