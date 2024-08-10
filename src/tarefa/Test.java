package tarefa;

public class Test {
  public static void main(String[] args) {
    Local local = new Local("Rua da puc prédio 4");
    Aluno aluno = new Aluno("Marcos", 19);
    Aluno[] alunos = { aluno };
    Seminario seminario = new Seminario("Cadê one piece", alunos, local);
    Seminario[] seminarios = { seminario };
    Professor professor = new Professor("Book", "Músico", seminarios);

    professor.setSeminarios(seminarios);
    aluno.setSeminario(seminario);

    professor.imprimir();
    aluno.imprimirAluno();

  }
}
