package com.mycompany.examenfinal_202502281;

public abstract class Multimedia {
    private String titulo;
    private int duracion;
    

    public Multimedia(String tituloInicial, int segundos) {
        this.titulo = tituloInicial;
        this.duracion = segundos;
    }

    public abstract void reproducir();

    public String getTitulo() { return titulo; }
    public void setTitulo(String nuevoTitulo) { this.titulo = nuevoTitulo; }
    public int getDuracion() { return duracion; }
    public void setDuracion(int nuevosSegundos) { this.duracion = nuevosSegundos; }
}