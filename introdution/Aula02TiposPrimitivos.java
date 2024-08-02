package introdution;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int,double,float,char,byte,short,long,boolean
        int age = 10;
        long numeroGrande=100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro=true;
        boolean falso=false;
        char caractere= '\u0041';

        String name = "goku";
        var nome2="vegeta";
        
        System.out.println("a idade é " + age);
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("oi meu nome é "+name);
    }
}
