package introdution;

public class Aula08EstruturaCondicionais04 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como dia domingo
        int op = 5;
        switch (op) {
            case 1:
                System.out.println("Dmingo");
                break;
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Opção invalido");
                break;
        }
    }
}
