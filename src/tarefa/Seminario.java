package tarefa;

public class Seminario {
  private String tituloDoSeminario;
  private Aluno[] alunos;
  private Local local;

  public Seminario(String tituloDoSeminario) {
    this.tituloDoSeminario = tituloDoSeminario;
  }

  public Seminario(String tituloDoSeminario, Aluno[] alunos) {
    this.tituloDoSeminario = tituloDoSeminario;
    this.alunos = alunos;
  }
  
  public Seminario(String tituloDoSeminario, Aluno[] alunos, Local local) {
    this.tituloDoSeminario = tituloDoSeminario;
    this.alunos = alunos;
    this.local = local;
  }

  public void setTituloDoSeminario(String tituloDoSeminario) {
    this.tituloDoSeminario = tituloDoSeminario;
  }

  public String getTituloDoSeminario() {
    return tituloDoSeminario;
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
