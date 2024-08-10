package tarefa;

public class Aluno {
  private String nomeDoAluno;
  private int idadeDoAluno;
  private Seminario seminario;

  public Aluno(String nomeDoAluno, int idadeDoAluno) {
    this.nomeDoAluno = nomeDoAluno;
    this.idadeDoAluno = idadeDoAluno;
  }

  public Aluno(String nomeDoAluno, int idadeDoAluno, Seminario seminario) {
    this.nomeDoAluno = nomeDoAluno;
    this.idadeDoAluno = idadeDoAluno;
    this.seminario = seminario;
  }

  public void setNomeDoAluno(String nomeDoAluno) {
    this.nomeDoAluno = nomeDoAluno;
  }

  public String getNomeDoAluno() {
    return nomeDoAluno;
  }

  public void setIdadeDoAluno(int idadeDoAluno) {
    this.idadeDoAluno = idadeDoAluno;
  }

  public int getIdadeDoAluno() {
    return idadeDoAluno;
  }

  public void setSeminario(Seminario seminario) {
    this.seminario = seminario;
  }

  public Seminario getSeminario() {
    return seminario;
  }

  public void imprimirAluno() {
    System.out.println("NOME: " + getNomeDoAluno());
    System.out.println("IDADE " + getIdadeDoAluno());
    System.out.println("SEMINARIO "+seminario.getTituloDoSeminario());
  }
}
