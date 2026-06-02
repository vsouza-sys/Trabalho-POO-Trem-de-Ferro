import java.util.ArrayList;
public class VagaoPassageiro extends Vagao {
    private int capacidade;
    private ArrayList<Passageiro> passageiros;
    public VagaoPassageiro(int numero, int capacidade) {
        super(numero);
        this.capacidade = capacidade;
        passageiros = new ArrayList<>();
    }
    public void embarcar(Passageiro passageiro) {
        if (passageiros.size() < capacidade) passageiros.add(passageiro);
        else System.out.println("Vagão cheio.");
    }
    public void listarConteudo() {
        System.out.println("Passageiros do vagão " + numero);
        for (Passageiro p : passageiros) System.out.println("- " + p);
    }
}