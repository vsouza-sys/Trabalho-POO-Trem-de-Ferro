public class Main {
    public static void main(String[] args) {
        Locomotiva locomotiva = new Locomotiva(5);
        Trem trem = new Trem(locomotiva);

        VagaoPassageiro vp = new VagaoPassageiro(1, 3);
        VagaoAnimal va = new VagaoAnimal(2, 2);
        VagaoCarga vc = new VagaoCarga(3, 1000);

        vp.embarcar(new Passageiro("João"));
        vp.embarcar(new Passageiro("Maria"));
        va.embarcar(new Animal("Rex", "Cachorro"));
        vc.embarcar(new Carga("Madeira", 300));

        trem.adicionarVagao(vp);
        trem.adicionarVagao(va);
        trem.adicionarVagao(vc);

        locomotiva.acelerar(50);
        trem.listarComposicao();
        locomotiva.parar();
    }
}