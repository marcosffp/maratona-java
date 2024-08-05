package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(21);
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());


    }
}
