package lanchonete;
import java.util.ArrayList;

public class Pedidos {



        private ArrayList<Lanche> itens;
        public static int totalPedidos = 0;

        public Pedidos() {
            itens = new ArrayList<>();
            totalPedidos++;
        }

        public void adicionarLanche(Lanche l) {
            itens.add(l);
        }

        public double calcularTotal() {
            double total = 0;
            for (Lanche l : itens) {
                total += l.getPreco();
            }
            return total;
        }

        public void exibirPedido() {
            System.out.println("Itens do pedido:");
            for (Lanche l : itens) {
                l.exibir();
            }
            System.out.println("Total: R$ " + calcularTotal());
        }
    }

