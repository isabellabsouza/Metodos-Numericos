package lagrange;

public class InterpolacaoLagrange {
    
    private double[] x;
    private double[] y;


    public InterpolacaoLagrange(double[] x, double[] y) {
        this.x = x;
        this.y = y;

    }

    public double calcy(double x) {
        double y = 0;
        for (int i = 0; i < this.x.length; i++) {
            double p = 1;
            for (int j = 0; j < this.x.length; j++) {
                if (i != j) {
                    p *= (x - this.x[j]) / (this.x[i] - this.x[j]);
                }
            }
            y += p * this.y[i];
        }
        return y;
    }

    
}
