package Newton;

public class Newton {
	
	private double eps;
	private int maxIteracoes;
	private double xZero;
	public Newton() {
	}
	public Newton(double eps, int maxIteracoes, double xZero) {
		this.eps = eps;
		this.maxIteracoes = maxIteracoes;
		this.xZero = xZero;
	}
	public double getEps() {
		return eps;
	}
	public void setEps(double eps) {
		this.eps = eps;
	}
	public int getMaxIteracoes() {
		return maxIteracoes;
	}
	public void setMaxIteracoes(int maxIteracoes) {
		this.maxIteracoes = maxIteracoes;
	}
	public double getxZero() {
		return xZero;
	}
	public void setxZero(double xZero) {
		this.xZero = xZero;
	}
	
	public double f(double x) {
        return Math.pow(x, 3) - 9*x + 5;
    }
	
	public double fderivada(double x) {
		return 3*Math.pow(x, 2)-9;
	}
	
	public double calcNewton() {
		double xn = this.getxZero();
        int iter = 0;
        double erro = eps + 1;
        
        while (erro > eps && iter < this.getMaxIteracoes()) {
            double fxn = f(xn);
            double fpxn = fderivada(xn);

            if (fpxn == 0.0) {
                System.out.println("A derivada da função é zero.");
                return Double.NaN;
            }

            double xn1 = xn - fxn / fpxn;
            erro = Math.abs((xn1 - xn) / xn1);
            xn = xn1;
            iter++;
        }
        
            if (iter >= this.getMaxIteracoes()) {
                System.out.println("O método não converge.");
                return Double.NaN;
            } else {
                return xn;
            }
	}

}
