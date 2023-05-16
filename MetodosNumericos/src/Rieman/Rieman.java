package Rieman;

public class Rieman {
	
	private double inicio;
    private double fim;
    private int divisoes;
    
	public Rieman() {
	}
	public Rieman(double inicio, double fim, int divisoes) {
		this.inicio = inicio;
		this.fim = fim;
		this.divisoes = divisoes;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getFim() {
		return fim;
	}
	public void setFim(double fim) {
		this.fim = fim;
	}
	public void setDivisoes(int divisoes) {
		this.divisoes = divisoes;
	}
    
	public double f(double x) {
        return Math.pow(x, 3) - 9*x + 5;
    }
	
	public double calcArea()
    {
        double area = 0;
        double Base = (this.fim - this.inicio) / this.divisoes;
        double mid = Base / 2;
                    
        for(int i = 0; i < divisoes; i++)
        {
            area += Base * f(this.inicio + Base * i + mid);
            //System.out.println(area);
        }  

        return area;
    }


}
