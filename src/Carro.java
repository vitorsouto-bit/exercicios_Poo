public class Carro {
    private String marca;
    private String modelo;
    private String ano;

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


    void exibi() {
        System.out.println("======================");
        System.out.println("exercicio 2");
        System.out.println("marca" + ":)" + marca);
        System.out.println("modelo" + ":)" + modelo);
        System.out.println("ano" + ":)" + ano);

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


















