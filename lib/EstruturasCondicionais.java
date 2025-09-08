public class EstruturasCondicionais {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        if (true) {
            System.out.println("vc está agora mo assunto de estruturas condicionais");
        } else {
            System.out.println("vc não esta no assunto de estruturas consicionais está sim é só brincadeira");
        }

        Q1();
        Q2(20);
        Q3();
        Q4();
    }

    public static void Q1 () {
        int idade = 17;
        boolean isAutorizadoAComprarBebidaAlcoolica = idade >= 18;
        
        if (!isAutorizadoAComprarBebidaAlcoolica) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }
    }

    public static void Q2 (int idade)  {
        if(idade > 18) {
            System.out.println("Maior de idade");
        }else if (idade <= 18 && idade >=12) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }

    }

    public static void Q3 () {
        double salario = 10000;
        String mensagem = salario > 5000 ? "vc deve pagar impostos" : "vc não deve pagar impostos";
        System.out.println(mensagem);
    }

    public static void Q4 () {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        char letra = 'A';
        switch (letra) {
            case 'A':
                System.out.println(
                    "Você selecionou a letra A"
                );
                break;
            case 'B':
                System.out.println(
                    "Você selecionou a letra B"
                );
                break;
            default:
                System.out.println("Letra invalida");
        }

        byte diaDaSemana = 1;
        switch (diaDaSemana) {
            case 6, 7:
            System.out.println("Fim de semana");
            break;
            case 1,2,3,4,5:
            System.out.println("Dia de semana");
        }
    }
}
