public class Carga {
    private String descricao;
    private double peso;
    public Carga(String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }
    public String getDescricao() { return descricao; }
    public double getPeso() { return peso; }
    public String toString() { return descricao + " - " + peso + " kg"; }
}