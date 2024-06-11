package com.ejercicioserick.entities;



public class libros {
    String titulo;
    String autor;
    String isbn;
    int anio;
    boolean prestado;

   

    public libros(String titulo, String autor, String isbn, int anio, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
        this.prestado = prestado;
    }



    public libros(String titulo2, String autor2, String isbn2, int anio2) {
        //TODO Auto-generated constructor stub
    }



    @Override
    public String toString() {
        String estado = prestado ? "Prestado" : "Disponible";
        return titulo + " por " + autor + " (ISBN: " + isbn + ", Año: " + anio + ") - " + estado;
    }

        
}
