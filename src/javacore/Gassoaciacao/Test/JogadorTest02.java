package javacore.Gassoaciacao.Test;

import javacore.Gassoaciacao.Class.Jogador;
import javacore.Gassoaciacao.Class.Time;

public class JogadorTest02 {
  public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Pelé");
    Time time = new Time("Seleção brasileira");

    jogador1.setTime(time);
    jogador1.imprimir();

  }
}
