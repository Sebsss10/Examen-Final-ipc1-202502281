package com.mycompany.examenfinal_202502281;

public class ExamenFinal_202502281 {
    public static void main(String[] args) {
        Cancion sideways = new Cancion("sideways", 187, "Zayn");
        Cancion Jimmy = new Cancion("Jimmy Cooks", 262, "Drake feat. 21 Savage");
        Cancion wait = new Cancion("Wait for U", 270, "Future");

        System.out.println("--- Reproduccion directa ---");
        sideways.reproducir();
        Jimmy.reproducir();
        wait.reproducir();

        System.out.println("--- Playlist ---");
        Playlist miLista = new Playlist();
        miLista.agregarCancion(sideways);
        miLista.agregarCancion(Jimmy);
        miLista.agregarCancion(wait);
        miLista.mostrarPlaylist();

        System.out.println("--- Navegacion ---");
        miLista.siguiente();
        miLista.siguiente();
        if (miLista.siguiente() == null) System.out.println("Ya esta en la cola");
        miLista.anterior();

        System.out.println("--- Eliminar actual ---");
        miLista.eliminarActual();

        System.out.println("--- Estado final ---");
        miLista.mostrarPlaylist();
    }
}