package exercicio_1_15;

public class Carro {
    private String marca;
    private String modelo;
    private String ano;

    // static
    public static int totalCarros = 0;

    // final
    public static final int ANO_PRIMEIRO_CARRO = 1886;



    //com parametro - contrutor muito mais facil de se ultilizar do ficar chamando o setters
    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros++;


    }
    public Carro(){
        marca =  "desconhecida";
        modelo=  "desconhecida";
        ano=  "0";
        totalCarros++;


    }




    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }


    public void setAno(String ano) {
        try {
            int anoInt = Integer.parseInt(ano);

            if (anoInt < 1886 || anoInt > 2026) {
                System.out.println("Erro: ano inválido. Deve estar entre 1886 e 2026.");
            } else {
                this.ano = ano;
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: o ano deve ser um número válido.");
        }
    }

    /*erro, o metodo não consegue acessar.
    static não depende de nenhuma instância para existir ou ser executado.
    Já um atributo de instância só existe quando um objeto é criado.*/
    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);
    }



    public void exibir() {
        System.out.println("===============================================");
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);


    }

    public int idadeDoCarro() {

        if (ano == null) {
            return 0;
        }

        try {
            int anoInt = Integer.parseInt(ano);
            return 2026 - anoInt;
        } catch (NumberFormatException e) {
            return 0;
        }



    }
}


















