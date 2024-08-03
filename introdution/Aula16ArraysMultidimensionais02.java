package introdution;

public class Aula16ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt=new int[3][];

        arrayInt[0]=new int [2];
        arrayInt[1]=new int [3];
        arrayInt[2]=new int [6];


        for (int[] is : arrayInt) {
            System.out.println("-----");
            for (int is2 : is) {
                System.out.println(is2+" ");
            }
        }
    }
}
