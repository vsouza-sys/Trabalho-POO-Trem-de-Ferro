public class Locomotiva {
    private int limiteVagoes;
    private double velocidade;
    public Locomotiva(int limiteVagoes) {
        this.limiteVagoes = limiteVagoes;
        velocidade = 0;
    }
    public int getLimiteVagoes() { return limiteVagoes; }
    public void acelerar(double valor) {
        velocidade += valor;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
    public void desacelerar(double valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
    public void parar() {
        velocidade = 0;
        System.out.println("Trem parado.");
    }
}