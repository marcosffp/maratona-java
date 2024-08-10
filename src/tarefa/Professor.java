package tarefa;

public class Professor {
  private String nomeDoProfessor;
  private String especialidadeDoProfessor;
  private Seminario[] seminarios;

  public Professor(String nomeDoProfessor, String especialidadeDoProfessor) {
    this.nomeDoProfessor = nomeDoProfessor;
    this.especialidadeDoProfessor = especialidadeDoProfessor;
  }

  public Professor(String nomeDoProfessor, String especialidadeDoProfessor, Seminario[] seminarios) {
    this.nomeDoProfessor = nomeDoProfessor;
    this.especialidadeDoProfessor = especialidadeDoProfessor;
    this.seminarios = seminarios;
  }

  public void setNomeDoProfessor(String nomeDoProfessor) {
    this.nomeDoProfessor = nomeDoProfessor;
  }

  public String getNomeDoProfessor() {
    return nomeDoProfessor;
  }

  public void setEspecialidadeDoProfessor(String especialidadeDoProfessor) {
    this.especialidadeDoProfessor = especialidadeDoProfessor;
  }

  public String getEspecialidadeDoProfessor() {
    return especialidadeDoProfessor;
  }

  public void setSeminarios(Seminario[] seminarios) {
    this.seminarios = seminarios;
  }

  public Seminario[] getSeminarios() {
    return seminarios;
  }

  public void imprimir() {
    System.out.println("----------");
    System.out.println("PROFESSOR: " + this.nomeDoProfessor);
    System.out.println("ESPECIALIDADE: " + this.especialidadeDoProfessor);

    if (seminarios == null) {
      return;
    }
    
    System.out.println("--------------");
    for (Seminario seminario : seminarios) {
      System.out.println("TITULO DO SEMINÁRIO: " + seminario.getTituloDoSeminario());
      System.out.println("LOCAL: " + seminario.getLocal().getEnderecoDoSeminario());

      if (seminario.getAlunos() == null) {
        continue;
      }
      for (Aluno aluno:seminario.getAlunos()) {
        System.out.println("ALUNO: " + aluno.getNomeDoAluno());
        System.out.println("IDADE: "+aluno.getIdadeDoAluno());
      }
    }
    
  }
}
