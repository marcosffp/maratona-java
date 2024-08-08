package javacore.Gassoaciacao.Test;

import javacore.Gassoaciacao.Class.Escola;
import javacore.Gassoaciacao.Class.Professor;

public class EscolaTest01 {
  public static void main(String[] args) {
    Professor professor = new Professor("Jiraya");
    Professor[] professores = { professor };
    Escola escola = new Escola("Konoha", professores);
    
    escola.imprimir();


  }
}
