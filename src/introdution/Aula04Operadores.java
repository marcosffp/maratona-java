package introdution;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numeb01=10;
        int numeb02=20;
        int res = numeb01+numeb02;
        System.out.println(res);

        // %
        int resto=21%2;
        System.out.println(resto);

        //<> <= >= == !=
        boolean isDezMaiorQueVinte=10>20;
        boolean isDezMenorQueVinte=10<20;
        boolean isDezIgualVinte = 10==10;
        boolean isDezDiferenteDez= 10 !=10;

        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);

        // &&(and) ||(or) !
        int idade = 35;
        float salario=3500f;
        boolean isDentroDaLei =idade >30 && salario>=4612; 
        boolean isDentroDaLeiMenorQueTrinta = idade<30 && salario>=3381;
        
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation=5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca >valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //= += -= *= /= %=
        double bonus = 1800;//1800
        bonus+=1000;//2800
        bonus-=1000;//1800
        bonus*=2;//3600
        bonus/=2;//900
        bonus%=2;//0
        System.out.println(bonus);

        int contador=0;
        contador+=1; // contador=contador +1;
        contador++;
        contador--;
        ++contador;
        --contador;

        System.out.println(contador);
        int cont2=0;
        System.out.println(cont2++);
        System.out.println(++cont2);

    }

}
