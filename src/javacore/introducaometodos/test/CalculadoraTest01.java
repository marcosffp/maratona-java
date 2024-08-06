package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora=new Calculadora();
        calculadora.somaDoisNumeros();

        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(12,2 );
        
        double res=calculadora.divideDoisNumeros(20, 2);
        System.out.println(res);

        int num1=1;
        int num2=2;
        calculadora.alterarDoisNumeros(num1, num2);

        int []numeros={1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
        
        
    }


}
