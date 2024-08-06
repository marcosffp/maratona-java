package javacore.CSobrecargaMetodos.test;

import javacore.CSobrecargaMetodos.domain.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime=new Anime();
        anime.init("Akuna Drive", "TV", 500,"Aventura");
        System.out.println(anime.getEpisodios());
        System.out.println(anime.getTipo());
        System.out.println(anime.getNome());
        System.out.println(anime.getGenero());
    }
}
