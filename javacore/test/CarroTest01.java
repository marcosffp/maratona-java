package javacore.test;

import javacore.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01=new Carro();
        Carro carro02=new Carro();

        carro01.nome= "Fusca Bala";
        carro01.ano=1969;
        carro01.modelo="Sport";

        carro02.nome="Mustang";
        carro02.ano=1968;
        carro02.modelo="GT 500";

        System.out.println("\nCarro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);
    }
    

    
}
