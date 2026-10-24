package com.mycompany.examenfinal_202502281;

public class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tamanio = 0;
    }

    public void agregarCancion(Cancion tema) {
        NodoDoble eslabon = new NodoDoble(tema);
        if (cabeza == null) {
            cabeza = eslabon;
            cola = eslabon;
            actual = eslabon;
        } else {
            cola.setSiguiente(eslabon);
            eslabon.setAnterior(cola);
            cola = eslabon;
        }
        tamanio++;
    }

    public void mostrarPlaylist() {
        if (cabeza == null) {
            System.out.println("Playlist vacía");
            return;
        }
        NodoDoble cursor = cabeza;
        int posicion = 1;
        while (cursor != null) {
            Cancion tema = cursor.getDato();
            System.out.println(posicion + ". " + tema.getTitulo() + " - " + tema.getArtista());
            cursor = cursor.getSiguiente();
            posicion++;
        }
    }

    public Cancion siguiente() {
        if (actual == null || actual == cola) {
            return null;
        }
        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public Cancion anterior() {
        if (actual == null || actual == cabeza) {
            return null;
        }
        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public void eliminarActual() {
        if (actual == null) {
            return;
        }
        NodoDoble previo = actual.getAnterior();
        NodoDoble proximo = actual.getSiguiente();

        if (cabeza == cola) {             
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza) {     
            cabeza = proximo;
            proximo.setAnterior(null);
            actual = proximo;
        } else if (actual == cola) {       
            cola = previo;
            previo.setSiguiente(null);
            actual = previo;
        } else {                           
            previo.setSiguiente(proximo);
            proximo.setAnterior(previo);
            actual = proximo;
        }
        tamanio--;
    }


    public NodoDoble getCabeza() { return cabeza; }
    public NodoDoble getCola() { return cola; }
    public NodoDoble getActual() { return actual; }
    public int getTamanio() { return tamanio; }
}