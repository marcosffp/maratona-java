package javacore.DConstrutores.test;

import javacore.DConstrutores.domain.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime=new Anime("Zoro", "TV", 500,"Aventura");
        Anime anime2=new Anime();

        anime.imprimir(anime);
        anime2.imprimir(anime2);
    }
}
