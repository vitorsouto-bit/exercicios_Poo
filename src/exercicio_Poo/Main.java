package exercicio_Poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

//exercicio
                Carro caro1 = new Carro("honda", "civic", "2020");
                caro1.setMarca("honda");
                caro1.setModelo("civic");
                caro1.setAno("2020");

                Carro carro2 = new Carro("toyota", "colora", "2022");
                carro2.setModelo("toyota");
                carro2.setMarca("corola");
                carro2.setAno("2022");

                // construtor sem parametros
                Carro carro3 = new Carro();
                Carro carro4 = new Carro();
                Carro carro5 = new Carro();

                //imprimindo
                System.out.println("==================================================");
                System.out.println(caro1.getMarca() + "-" + caro1.getModelo() + "-" + caro1.getAno());
                System.out.println(carro2.getMarca() + "-" + carro2.getModelo() + "-" + carro2.getAno());
                System.out.format("marca = %s, modelo = %s, ano = %s", carro3.getMarca(), carro3.getModelo(), carro3.getAno());
                System.out.println("");


                // imprimindo metodo void -> sem valor de retono
                caro1.exibir();
                carro2.exibir();


                // imprimindo metodo int -> com valor de retornoo
                int idade1 = caro1.idadeDoCarro();
                int idade2 = carro2.idadeDoCarro();

                System.out.println("===============================================");
                System.out.println("idade do meu carro1 é " + idade1 + "-anos ");
                System.out.println("idade do meu carro2 é " + idade2 + "-anos ");
                System.out.println("===============================================");


                ArrayList<String> arrayDinamico = new ArrayList<String>();
                arrayDinamico.add("civic");
                arrayDinamico.add("corola");
                arrayDinamico.add("gol G9");


                for (String nomeCarro : arrayDinamico) {
                        System.out.println(nomeCarro);


                }
                System.out.println("===============================================");
                Carro.imprimirTotal();
                System.out.println("===============================================");


                /*O valor dela não pode ser alterado depois de ser atribuído pela primeira vez.
                exercicio_Poo.Carro.ANO_PRIMEIRO_CARRO = 1900; */

                // apresensou erro. Escopo é a região do código onde uma variável existe e pode ser acessada.
                int x = 10;
                if (true) {
                        System.out.println(x);
                }
                System.out.println("======================================");

                //Não, alterar b não muda o valor de a.
                //Ocorre uma cópia do valor de a para b, e não uma referência ao mesmo espaço de memória.
                int a = 10;
                int b = a;
                b = 99;
                System.out.println("a = " + a); // 10
                System.out.println("b = " + b); // 99
                System.out.println("======================================");


                // O objeto está na heap, e c1 e c2 (na stack) apontam para o mesmo endereço.
                Carro c3 = new Carro("Fiat", "Uno", "2020 ");
                Carro c4 = c3;
                c4.setModelo("Palio");
                System.out.println(c3.getModelo()); // Palio
                System.out.println(c4.getModelo()); // Palio
                System.out.println("======================================");

                // EXERCÍCIO 13
                Carro meuCarro = new Carro("VW", "Gol", "2015");
                trocarModelo(meuCarro);
                System.out.println(meuCarro.getModelo()); // Fusca

                // EXERCÍCIO 14
                Cliente cl1 = new Cliente("João", "joao@email.com", "9999-9999");
                Cliente cl2 = new Cliente("Maria", "maria@email.com");
                Cliente cl3 = new Cliente("Pedro");

                cl1.exibir();
                cl2.exibir();
                cl3.exibir();
menu();

        }

        public static void trocarModelo(Carro c) {
                c.setModelo("Fusca");
        }


        public static void menu() {

                Scanner sc = new Scanner(System.in);
                ArrayList<Carro> lista = new ArrayList<>();

                int opcao;

                do {
                        System.out.println("\n1) Cadastrar");
                        System.out.println("2) Listar");
                        System.out.println("3) Total");
                        System.out.println("4) Sair");
                        System.out.print("Escolha: ");

                        opcao = Integer.parseInt(sc.nextLine());

                        switch (opcao) {

                                case 1:
                                        System.out.print("Marca: ");
                                        String marca = sc.nextLine();

                                        System.out.print("Modelo: ");
                                        String modelo = sc.nextLine();

                                        System.out.print("Ano: ");
                                        int ano = Integer.parseInt(sc.nextLine());

                                        Carro carro = new Carro(marca, modelo, "ano");
                                        lista.add(carro);

                                        System.out.println("exercicio_Poo.Carro cadastrado com sucesso!");
                                        break;

                                case 2:
                                        if (lista.isEmpty()) {
                                                System.out.println("Nenhum carro cadastrado.");
                                        } else {
                                                for (Carro c : lista) {
                                                        c.exibir();
                                                }
                                        }
                                        break;

                                case 3:
                                        System.out.println("Total: " + Carro.totalCarros);
                                        break;

                                case 4:
                                        System.out.println("Saindo...");
                                        break;

                                default:
                                        System.out.println("Opção inválida!");
                        }

                } while (opcao != 4);

                sc.close();
                menu();
        }
}




