package javacore.DConstrutores.test;

import javacore.DConstrutores.domain.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime=new Anime("One Piece", "TV", 1200,"Aventura","Toei Animation");
        anime.imprimir(anime);
    }
}
