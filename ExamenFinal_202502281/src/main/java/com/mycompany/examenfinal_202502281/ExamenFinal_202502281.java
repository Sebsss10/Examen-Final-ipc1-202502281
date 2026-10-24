
package com.mycompany.examenfinal_202502281;

public class ExamenFinal_202502281 {
    public static void main(String[] args) {
        Cancion bohemian = new Cancion("Bohemian Rhapsody", 354, "Queen");
        Cancion hotel = new Cancion("Hotel California", 391, "Eagles");
        Cancion imagine = new Cancion("Imagine", 183, "John Lennon");

        bohemian.reproducir();
        hotel.reproducir();
        imagine.reproducir();
    }
}