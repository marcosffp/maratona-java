package javacore.Gassoaciacao.Test;


import javacore.Gassoaciacao.Class.Jogador;
import javacore.Gassoaciacao.Class.Time;

public class JogadorTest03 {
  public static void main(String[] args) {
    Jogador jogador = new Jogador("Cafu");
    Time time = new Time("Brasil");
    Jogador[] jogadores = { jogador };


    jogador.setTime(time);
    time.setJogadores(jogadores);

    jogador.imprimir();
    time.imprimir();
  }
}
