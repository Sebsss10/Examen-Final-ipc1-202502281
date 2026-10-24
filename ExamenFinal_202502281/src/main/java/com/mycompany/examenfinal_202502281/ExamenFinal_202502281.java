package com.mycompany.examenfinal_202502281;

public class ExamenFinal_202502281 {
    public static void main(String[] args) {
        Cancion sideways = new Cancion("sideways", 187, "Zayn");
        Cancion Jimmy = new Cancion("Jimmy Cooks", 262, "Drake feat. 21 Savage");
        Cancion wait = new Cancion("Wait for U", 270, "Future");

        sideways.reproducir();
        Jimmy.reproducir();
        wait.reproducir();

        Playlist miLista = new Playlist();
        miLista.agregarCancion(sideways);
        miLista.agregarCancion(Jimmy);
        miLista.agregarCancion(wait);
        miLista.mostrarPlaylist();
    }
}