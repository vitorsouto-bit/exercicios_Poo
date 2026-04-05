package lanchonete;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {



        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            ArrayList<Lanche> cardapio = new ArrayList<>();
            ArrayList<Pedido> pedidos = new ArrayList<>();

            int opcao;

            do {
                System.out.println("\n1) Cadastrar lanche");
                System.out.println("2) Listar cardápio");
                System.out.println("3) Fazer pedido");
                System.out.println("4) Total de pedidos");
                System.out.println("5) Sair");
                System.out.print("Escolha: ");

                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {

                    case 1:
                        System.out.print("Nome do lanche: ");
                        String nome = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(sc.nextLine());

                        Lanche lanche = new Lanche(nome, preco);
                        cardapio.add(lanche);

                        System.out.println("Lanche cadastrado!");
                        break;

                    case 2:
                        if (cardapio.isEmpty()) {
                            System.out.println("Cardápio vazio.");
                        } else {
                            for (int i = 0; i < cardapio.size(); i++) {
                                System.out.print(i + " - ");
                                cardapio.get(i).exibir();
                            }
                        }
                        break;

                    case 3:
                        if (cardapio.isEmpty()) {
                            System.out.println("Cadastre lanches primeiro.");
                            break;
                        }

                        Pedido pedido = new Pedido();

                        int escolha;
                        do {
                            System.out.println("\nEscolha um lanche (-1 para finalizar):");

                            for (int i = 0; i < cardapio.size(); i++) {
                                System.out.print(i + " - ");
                                cardapio.get(i).exibir();
                            }

                            escolha = Integer.parseInt(sc.nextLine());

                            if (escolha >= 0 && escolha < cardapio.size()) {
                                pedido.adicionarLanche(cardapio.get(escolha));
                                System.out.println("Item adicionado!");
                            }

                        } while (escolha != -1);

                        pedidos.add(pedido);
                        pedido.exibirPedido();
                        break;

                    case 4:
                        System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                        break;

                    case 5:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 5);

            sc.close();
        }
}


