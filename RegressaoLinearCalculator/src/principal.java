public class principal {
    public static void main(String[] args) {
        
        RegressaoLinear rl = new RegressaoLinear();
        rl.calcular();
        System.out.println(rl.getEquacao());
    }
}
