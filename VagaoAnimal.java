import java.util.ArrayList;
public class VagaoAnimal extends Vagao {
    private int capacidade;
    private ArrayList<Animal> animais;
    public VagaoAnimal(int numero, int capacidade) {
        super(numero);
        this.capacidade = capacidade;
        animais = new ArrayList<>();
    }
    public void embarcar(Animal animal) {
        if (animais.size() < capacidade) animais.add(animal);
        else System.out.println("Vagão de animais cheio.");
    }
    public void listarConteudo() {
        System.out.println("Animais do vagão " + numero);
        for (Animal a : animais) System.out.println("- " + a);
    }
}