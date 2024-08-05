package javacore.DConstrutores.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;


    public Anime(String nome,String tipo, int episodios,String genero){
        System.out.println("Dentro do Construtor");
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;

    }

    public Anime(){}

    public void imprimir(Anime anime){
        System.out.println(anime.getNome());
        System.out.println(anime.getTipo());
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getGenero());
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }

    public String getGenero(){
        return this.genero;
    }


    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios=episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}

