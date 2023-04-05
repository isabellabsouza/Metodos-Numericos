package BaseNumerica;

public class BinDec {
	
	private String numBinario;
	
	
	public BinDec(String numBinario) {
		this.numBinario = numBinario;
	}

	public BinDec() {
	}


	public String getNumBinario() {
		return numBinario;
	}

	public void setNumBinario(String numBinario) {
		this.numBinario = numBinario;
	}

	public int getDecimal() {
		
		int numDecimal = 0;
		int potencia = 0;
		
		 for (int i = numBinario.length() - 1; i >= 0; i--) {
	            if (numBinario.charAt(i) == '1') {
	                numDecimal += Math.pow(2, potencia);
	            }
	            potencia++;
	        }
		 return numDecimal;
	}

}
