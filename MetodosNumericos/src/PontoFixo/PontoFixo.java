package PontoFixo;

public class PontoFixo {
	private double eps;
	private int maxIteracoes;
	private double xZero;
	public PontoFixo() {
	}
	public PontoFixo(double eps, int maxIteracoes, double xZero) {
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
	
	public double calcPontoFixo() {
		
		double xn = xZero;
        int iter = 0;
        double error = eps + 1;

        while (error > eps && iter < maxIteracoes) {
            double xn1 = f(xn);
            error = Math.abs((xn1 - xn) / xn1);
            xn = xn1;
            iter++;
        }

        if (iter >= maxIteracoes) {
            System.out.println("O método não converge.");
            return Double.NaN;
        } else {
            return xn;
        }
	}

}
