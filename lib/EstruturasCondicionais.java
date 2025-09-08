public class EstruturasCondicionais {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        if (true) {
            System.out.println("vc está agora mo assunto de estruturas condicionais");
        } else {
            System.out.println("vc não esta no assunto de estruturas consicionais está sim é só brincadeira");
        }

        Q1();
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

    public static void Q2 () [
        
    ]
}
