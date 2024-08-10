package javacore.Gassoaciacao.Test;

import javacore.Gassoaciacao.Class.Aluno;
import javacore.Gassoaciacao.Class.Local;
import javacore.Gassoaciacao.Class.Professor02;
import javacore.Gassoaciacao.Class.Seminario;

public class AssociacaoTest {
  public static void main(String[] args) {

    Local local = new Local("Rua das Laranjras");
    Aluno aluno = new Aluno("Marcos", 18);
    Professor02 professor02 = new Professor02("Hugo", "Programação Modular");

    Aluno[] alunosParaSeminario = { aluno };

    Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
    Seminario[] seminariosDisponiveis = { seminario };

    professor02.setSeminarios(seminariosDisponiveis);

    professor02.imprimir();
  }
}
