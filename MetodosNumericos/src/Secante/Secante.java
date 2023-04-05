package Secante;

public class Secante {
	
	private double a;
	private double b;
	private double raiz;
	private double erro;
	
	
	
	public Secante(double a, double b, double raiz, double erro) {
		this.a = a;
		this.b = b;
		this.raiz = raiz;
		this.erro = erro;
	}
	public Secante() {
		
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


	public double getRaiz() {
		return raiz;
	}


	public void setRaiz(double raiz) {
		this.raiz = raiz;
	}


	public double getErro() {
		return erro;
	}


	public void setErro(double erro) {
		this.erro = erro;
	}


	public double f(double x) {
        return Math.pow(x, 3) - 9*x + 5;
    } 
	
	public double calcSecante() {
		
		double raiz;
		do
        {
            raiz = b - (f(b) * (b - a)) / (f(b) - f(a));
            a = b;
            b = raiz;

        } while (Math.abs(f(raiz)) > this.erro);
        this.raiz = raiz;
        return raiz;
		
	}
	

}
