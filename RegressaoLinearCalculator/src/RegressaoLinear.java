public class RegressaoLinear {
    /*private double[][] pontos = {
        {1, 2},
        {2, 3},
        {3, 4},
        {4, 5},
        {5, 6}
    };*/
    /*
    private double[][] pontos = {
        {1,1},
        {2,3},
        {-1,2},
        {0,-1}
    }; */

    private double[][] pontos = {
        {0,0},
        {1,1},
        {-1,2},
        {0,2}
    };

    private double somaX;
    private double somaY;
    private double somaXY;
    private double somaX2;
    //private double somaY2;
    private int n = pontos.length;


    private double coeficienteAngular;
    private double intersecao;

    public void calcular() {

        for (int i = 0; i < n; i++) {
            somaX += pontos[i][0];
            somaY += pontos[i][1];
            somaXY += pontos[i][0] * pontos[i][1];
            somaX2 += pontos[i][0] * pontos[i][0];
            //somaY2 += pontos[i][1] * pontos[i][1];
        }

        coeficienteAngular = (n * somaXY - somaX * somaY) / (n * somaX2 - somaX * somaX);
        intersecao = (somaY - coeficienteAngular * somaX) / n;
    }

    public String getEquacao(){

        return "y = " + coeficienteAngular + "x + " + intersecao;
    }


}
