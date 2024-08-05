package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01=new Estudante();
        Estudante estudante02=new Estudante();

        estudante01.nome="Midoriya";
        estudante01.idade=15;
        estudante01.sexo='M';

        estudante02.nome="Sanji";
        estudante02.idade=21;
        estudante02.sexo='M';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
