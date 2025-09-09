public class EstruturasDeRepeticao {
    public static void main (String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // Q1();
        // Q2();
        // Q3();
        Q4();
        // Q5();
    }

    public static void Q1 () {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 10);
    }

    public static void Q2 () {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void Q3 () {
        for (int num = 0; num <= 1000000; num++) {
            int numeroPar = num % 2;
            if (numeroPar == 0) {
                System.out.println(num);
            }
        }
    }

    public static void Q4 () {
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >=1000) {
                System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }
    }

    public static void Q5 () {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
