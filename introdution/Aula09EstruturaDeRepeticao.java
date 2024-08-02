package introdution;

public class Aula09EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while, do while,for

        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println("dentro do for " + i);
        }

        /*for (int i = 0; i <=1000000; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        /*int valorMax=50;
        for (int i = 0; i <=valorMax; i++) {
            if (i>25) {
                break;
            }
            System.out.println(i);
        }*/
    }
}
