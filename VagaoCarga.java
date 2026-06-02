import java.util.ArrayList;
public class VagaoCarga extends Vagao {
    private double pesoMaximo;
    private ArrayList<Carga> cargas;
    public VagaoCarga(int numero, double pesoMaximo) {
        super(numero);
        this.pesoMaximo = pesoMaximo;
        cargas = new ArrayList<>();
    }
    public void embarcar(Carga carga) {
        if (pesoAtual() + carga.getPeso() <= pesoMaximo) cargas.add(carga);
        else System.out.println("Peso máximo excedido.");
    }
    private double pesoAtual() {
        double total = 0;
        for (Carga c : cargas) total += c.getPeso();
        return total;
    }
    public void listarConteudo() {
        System.out.println("Cargas do vagão " + numero);
        for (Carga c : cargas) System.out.println("- " + c);
    }
}