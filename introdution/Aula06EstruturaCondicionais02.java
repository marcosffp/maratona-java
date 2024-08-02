package introdution;

public class Aula06EstruturaCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria juvenil
        //idade >=15 && idade <18 categoria juvenil
        //idade >=18 categoria adulto

        int idade=17;

        if(idade<15){
            System.out.println("Categoria infatil");
        }

        else if(idade>=15 && idade<18){
            System.out.println("Categoria juvenil");
        }
        else {
            System.out.println("categoria adulto");
        }
    }
}
