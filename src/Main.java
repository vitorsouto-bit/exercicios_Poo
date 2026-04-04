import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {


                Carro caro1 = new Carro("honda", "civic", "2020");
                caro1.setMarca("honda");
                caro1.setModelo("civic");
                caro1.setAno("2020");

                Carro carro2 = new Carro("toyota","colora", "2022");
                carro2.setModelo("toyota");
                carro2.setMarca("corola");
                carro2.setAno("2022");

                // construtor sem parametros
                Carro carro3 = new Carro();

                //imprimindo
                System.out.println("===============================================");
                System.out.println("exercicio 1 e 6");
                System.out.println(caro1.getMarca() + "-" + caro1.getModelo() + "-" + caro1.getAno());
                System.out.println(carro2.getMarca() + "-" + carro2.getModelo() + "-" + carro2.getAno());
                System.out.format("marca: %s, modelo = %s, ano = %s ", carro3.getMarca(), carro3.getModelo(), carro3.getAno() );


                // imprimindo metodo void -> sem valor de retono
                caro1.exibi();
                carro2.exibi();



                // imprimindo metodo int -> com valor de retornoo
                int idade1 = caro1.idadeDoCarro();
                int idade2 = carro2.idadeDoCarro();

                System.out.println("===============================================");
                System.out.println("exercicio 2");
                System.out.println("idade do meu carro1 é " + idade1 + "-anos ");
                System.out.println("idade do meu carro2 é " + idade2 + "-anos ");
                System.out.println("===============================================");



                ArrayList<String> arrayDinamico = new ArrayList<String>();
                arrayDinamico.add("civic");
                arrayDinamico.add("corola");
                arrayDinamico.add("gol G9");
                System.out.println("exercicio 3");


                for (String nomeCarro :  arrayDinamico){
                        System.out.println(nomeCarro);


                }
                System.out.println("===============================================");


        }
}