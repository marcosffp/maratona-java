package introdution;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {

        int idade = 15;

        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {

            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
    }
}
