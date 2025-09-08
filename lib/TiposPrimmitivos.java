public class TiposPrimmitivos {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int numeroInt = 10;
        double numeroDouble = 10.5;
        char caracter = 'A';
        boolean esVerdadeiro = true;
        var nome = "ola";
        float num = 12.2f;
        short num2 = 5;
        byte num3 = 10;
        Long num4 = 1712L;
        System.out.println(numeroInt);

        Q1();
        Q2();
        Q3();
    }

    public static void Q1 () {
        String nome = "Cris";
        int endereco = 123;
        double salario = 1234.56;
        String data = "02/04/2025";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data + "." );
    }

    public static void Q2 () {
        int salario = 1250;
        int idade = 30;

        boolean test1 = idade > 30 && salario >= 4000;
        boolean test2 = idade <= 30 && salario >1000;
        System.out.println(test1);
        System.out.println(test2);
    }

    public static void Q3 () {
        int contaCorrenteAtual = 1500;
        double contaPoupancaAtual = 5000;
        float valorPlaystation5 = 5000;

        boolean compraDePs5 = contaCorrenteAtual >= valorPlaystation5 || contaPoupancaAtual >= valorPlaystation5;

        if (compraDePs5) {
            System.out.println("Compra de ps5 é possivel pode economizar para comprar o GTA VI também");
        } else {
            System.out.println("compra do ps5 não é possivel, contudo pode comprar o GTA VI primeiro");
        }
    }
}

