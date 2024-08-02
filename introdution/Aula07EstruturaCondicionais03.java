package introdution;
public class Aula07EstruturaCondicionais03 {
    public static void main(String[] args) {

        double salario=6000;
        String mensagemDoar="Eu vou doar 500 pro Marcos";
        String mensagemNaoDoar="Ainda nao tenha condições, mas vou ter";

       //      resultado =(condicao)? verdadeiro:falso;
        String resultado =(salario>5000)? mensagemDoar:mensagemNaoDoar;

        resultado =(salario>5000)? "Eu vou doar 500 pro Marcos": "Ainda nao tenha condições, mas vou ter";
        
        System.out.println(resultado);
        System.out.println(salario>5000? mensagemDoar:mensagemNaoDoar);
    }
}
