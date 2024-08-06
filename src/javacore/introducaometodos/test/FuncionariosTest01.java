package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios=new Funcionarios();
        funcionarios.name= "Goku";
        funcionarios.idade=50;
        funcionarios.salario=new double[]{2000,1422,50000};
        funcionarios.imprimir();
        funcionarios.mediaSalarios();

    }
}
