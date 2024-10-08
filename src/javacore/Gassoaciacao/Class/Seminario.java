package javacore.Gassoaciacao.Class;

public class Seminario {
  private String titulo;
  private Aluno[] alunos;
  private Local local;
  
  public Seminario(String titulo) {
    this.titulo = titulo;
  }

  public Seminario(String titulo, Aluno[] alunos) {
    this.titulo = titulo;
    this.alunos = alunos;
  }

  public Seminario(String titulo, Aluno[] alunos, Local local) {
    this.titulo = titulo;
    this.alunos = alunos;
    this.local = local;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public Local getLocal() {
    return local;
  }
}
