package introdution;

public class Aula14Arrays03 {
    public static void main(String[] args) {
        int [] numeros=new int[5];
        int [] numeros02={1,2,3,4,5};
        int [] numeros03=new int []{1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros02.length; i++) {
            System.out.println(numeros02[i]);
        }

        for (int i = 0; i < numeros03.length; i++) {
            System.out.println(numeros03[i]);
        }


        for(int i:numeros03){
            System.out.println(i);
        }
    }
}
