import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {


                Carro caro1 = new Carro();
                caro1.marca = "honda";
                caro1. = "civic";
                caro1.ano = "2020";

                Carro carro2 = new Carro();
                carro2.marca = "toyota";
                carro2.modelo = "corola";
                carro2.ano = "2023";



                //imprimindo
                System.out.println("===============================================");
                System.out.println("exercicio 1");
                System.out.println(caro1.marca + "-" + caro1.modelo + "-" + caro1.ano);
                System.out.println(carro2.marca + "-" + carro2.modelo + "-" + carro2.ano);



                // imprimindo metodo void -> sem valor de retono
                caro1.exibi();
                carro2.exibi();



                // imprimindo metodo int -> com valor de retornoo
                int idade1 = caro1.idadeDoCarro();
                int idade2 = carro2.idadeDoCarro();

                System.out.println("===============================================");
                System.out.println("exercicio 2");
                System.out.println("Idade do meu carro1 é " + idade1 + "-anos ");
                System.out.println("Idade do meu carro2 é " + idade2 + "-anos ");
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