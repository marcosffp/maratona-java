package javacore.introducaoclasses.test;

import javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante=new Estudante();

        estudante.nome="Luffy";
        estudante.idade=21;
        estudante.sexo='M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
