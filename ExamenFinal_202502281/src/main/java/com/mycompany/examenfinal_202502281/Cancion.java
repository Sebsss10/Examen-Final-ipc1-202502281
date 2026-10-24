package com.mycompany.examenfinal_202502281;

public class Cancion extends Multimedia {
    private String artista;
    
    

    public Cancion(String tituloInicial, int segundos, String interprete) {
        super(tituloInicial, segundos);
        this.artista = interprete;
    }

    @Override
    public void reproducir() {
        System.out.println("Sonando: " + getTitulo() + " - " + artista
                + " (" + getDuracion() + "s)");
    }

    public String getArtista() { return artista; }
    public void setArtista(String nuevoInterprete) { this.artista = nuevoInterprete; }
}