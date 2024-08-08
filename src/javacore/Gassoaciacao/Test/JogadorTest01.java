package javacore.Gassoaciacao.Test;

import javacore.Gassoaciacao.Class.Jogador;

public class JogadorTest01 {
  public static void main(String[] args) {
    int numObjetos;
    numObjetos=3;

    Jogador jogador1 = new Jogador("Pelé");
    Jogador jogador2 = new Jogador("Neymar");
    Jogador jogador3 = new Jogador("Cristiano");

    Jogador[] jogadores = new Jogador[numObjetos];
    jogadores[0] = jogador1;
    jogadores[1] = jogador2;
    jogadores[2] = jogador3;

    for (int i = 0; i < jogadores.length; i++) {
      jogadores[i].imprimir();
    }
  }
}
