package bissecao;

public class bissecao {
	
	private double a;
	private double b;
	private double erro;
	
	public bissecao() {
	}
	public bissecao(double a, double b, double erro) {
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
	public double calcBissecao() {
		
		double c = 0; //ponto medio
		
		while ((this.b-this.a)>= this.erro) {
			c = (a + b)/2;
			if(f(c) == 0)
				break;
			else if(f(c) * f(a) < 0)
				b = c;
			else
				a = c;
		}
		return c;
	}

}
