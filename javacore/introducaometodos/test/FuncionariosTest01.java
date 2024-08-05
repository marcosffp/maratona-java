package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios=new Funcionarios();
        funcionarios.name= "Goku";
        funcionarios.idade=50;
        funcionarios.salario[0]=1200;
        funcionarios.salario[1]=2800;
        funcionarios.salario[2]=15200;
        funcionarios.imprimir();
        funcionarios.mediaSalarios();

    }
}
