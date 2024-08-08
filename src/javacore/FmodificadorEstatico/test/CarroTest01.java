package javacore.FmodificadorEstatico.test;

import javacore.FmodificadorEstatico.domain.*;

public class CarroTest01 {
  public static void main(String[] args) {

    Carro.setVelocidadeLimite(180);

    Carro c1 = new Carro("BMW", 280);
    Carro c2 = new Carro("Mercedes", 275);
    Carro c3 = new Carro("Audi", 290);

    
    c1.imprimir();
    c2.imprimir();
    c3.imprimir();
  }
}
