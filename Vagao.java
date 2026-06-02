public abstract class Vagao {
    protected int numero;
    public Vagao(int numero) { this.numero = numero; }
    public int getNumero() { return numero; }
    public abstract void listarConteudo();
}