
package com.mycompany.examenfinal_202502281;
// Nodo de la lista doblemente enlazada
public class NodoDoble {
    private Cancion dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;
    
 // Constructor: nodo nuevo sin enlaces
    public NodoDoble(Cancion tema) {
        this.dato = tema;
        this.anterior = null;
        this.siguiente = null;
    }

    public Cancion getDato() { return dato; }
    public void setDato(Cancion tema) { this.dato = tema; }
    public NodoDoble getAnterior() { return anterior; }
    public void setAnterior(NodoDoble nodoPrevio) { this.anterior = nodoPrevio; }
    public NodoDoble getSiguiente() { return siguiente; }
    public void setSiguiente(NodoDoble nodoProximo) { this.siguiente = nodoProximo; }
}


