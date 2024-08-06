package introdution;

public class Aula10EstruturaDeRepeticao {
    public static void main(String[] args) {
        /*
         * Dado o valor de um carro,descubra em quantas ele pode ser parcelado.Condição
         * valorParcela>=1000
         */

        double valorDoCarro = 50000;
        for (int i = 1; i <= valorDoCarro; i++) {
            double valorParcela = valorDoCarro / i;
            if (valorParcela >= 1000) {
                System.out.println("parcela " + i + "R$ " + valorParcela);
            } else {
                break;
            }
        }
    }
}
