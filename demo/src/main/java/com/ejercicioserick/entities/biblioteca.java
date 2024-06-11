package com.ejercicioserick.entities;

import java.util.ArrayList;


public class biblioteca {
        static ArrayList<libros> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    void agregarLibros(String titulo, String autor, String isbn, int anio) {
        libros.add(new libros(titulo, autor, isbn, anio));
        System.out.println("Libros agregado exitosamente.");
    }

    public static void buscarLibro(String criterio, String valor) {
        boolean encontrado = false;
        for (libros libro : libros) {
            if (criterio.equals("titulo") && libro.titulo.equalsIgnoreCase(valor)) {
                System.out.println(libro);
                encontrado = true;
            } else if (criterio.equals("autor") && libro.autor.equalsIgnoreCase(valor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con ese criterio.");
        }
    }

    void mostrarLibross() {
        if (libros.isEmpty()) {
            System.out.println("No hay Libross en la biblioteca.");
        } else {
            for (libros libros : libros) {
                System.out.println(libros);
            }
        }
    }

    void prestarLibros(String isbn) {
        for (libros Libros : libros) {
            if (Libros.isbn.equals(isbn)) {
                if (!Libros.prestado) {
                    Libros.prestado = true;
                    System.out.println("Libros prestado exitosamente.");
                } else {
                    System.out.println("El Libros ya está prestado.");
                }
                return;
            }
        }
        System.out.println("No se encontró un Libros con ese ISBN.");
    }

    void devolverLibros(String isbn) {
        for (libros libros : libros) {
            if (libros.isbn.equals(isbn)) {
                if (libros.prestado) {
                    libros.prestado = false;
                    System.out.println("Libros devuelto exitosamente.");
                } else {
                    System.out.println("El Libros no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("No se encontró un Libros con ese ISBN.");
    }

    public static void agregarLibro(String titulo, String autor, String isbn, int anio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarLibro'");
    }

    public static void mostrarLibros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarLibros'");
    }

    public static void prestarLibro(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prestarLibro'");
    }

    public static void devolverLibro(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolverLibro'");
    }

}
