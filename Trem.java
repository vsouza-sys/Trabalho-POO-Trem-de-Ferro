import java.util.ArrayList;
public class Trem {
    private Locomotiva locomotiva;
    private ArrayList<Vagao> vagoes;
    public Trem(Locomotiva locomotiva) {
        this.locomotiva = locomotiva;
        vagoes = new ArrayList<>();
    }
    public void adicionarVagao(Vagao vagao) {
        if (vagoes.size() < locomotiva.getLimiteVagoes()) vagoes.add(vagao);
        else System.out.println("Limite de vagões atingido.");
    }
    public void listarComposicao() {
        for (Vagao v : vagoes) {
            v.listarConteudo();
            System.out.println();
        }
    }
}