package javacore.introducaometodos.domain;

public class Funcionarios {
    public String name;
   public  int idade;
    public double [] salario=new double[3];

    public void imprimir(){
       System.out.println(this.name);
       System.out.println(this.idade);
       for (int i = 0; i < salario.length; i++) {
        System.out.println("r$ "+salario[i]);
       }

    }

    public void mediaSalarios(){
       int soma=0;
       int num=0;
       double media=0;
       for (int i = 0; i < salario.length; i++) {
           soma+=salario[i];
           num++;

           media=(double)soma/num;

       }
       System.out.println("A media do salario é "+media);
    }
}
