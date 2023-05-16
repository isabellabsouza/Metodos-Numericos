package FalsaPosicao;

public class FalsaPosicao {
	private double a;
	private double b;
	private double erro;
	public FalsaPosicao() {
	}
	public FalsaPosicao(double a, double b, double erro) {
		this.a = a;
		this.b = b;
		this.erro = erro;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getErro() {
		return erro;
	}
	public void setErro(double erro) {
		this.erro = erro;
	}
	
	public double f(double x) {
		return Math.pow(x, 3)-9*x+5;
	}
	
	public boolean verificaIntervalo() {
		return (f(this.a)*f(this.b)<0);
	}
	
	public double calcFalsaPosicao() {
		
		double c = 0;
		
		while((this.b-this.a)>= this.erro) {
			c = (this.a * f(this.b) - this.b * f(a)) / (f(this.b)-f(this.a));
			
			if(f(c) == 0)
				break;
			else if(f(c) * f(this.a) < 0)
				this.b = c;
			else
				this.a = c;
		}

		return c;
	}
}
