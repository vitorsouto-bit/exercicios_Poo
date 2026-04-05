package estacionamento;
import java.util.ArrayList;



public class Estacionamento {

    public static final int CAPACIDADE = 20;

    private ArrayList<Carro> vagas;

    public Estacionamento() {
        vagas = new ArrayList<>();
    }

    public void entrarCarro(Carro carro) {
        if (vagas.size() >= CAPACIDADE) {
            System.out.println("Estacionamento lotado!");
        } else {
            vagas.add(carro);
            System.out.println("Carro entrou.");
        }
    }

    public void sairCarro(String placa) {
        for (Carro c : vagas) {
            if (c.getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(c);
                System.out.println("Carro removido.");
                return;
            }
        }
        System.out.println("Carro não encontrado.");
    }

    public void listarCarros() {
        if (vagas.isEmpty()) {
            System.out.println("Nenhum carro no estacionamento.");
        } else {
            for (Carro c : vagas) {
                c.exibir();
            }
        }
    }

    public int vagasOcupadas() {
        return vagas.size();
    }

    public int vagasLivres() {
        return CAPACIDADE - vagas.size();
    }
}
