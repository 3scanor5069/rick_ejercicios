package com.ejercicioserick;


import java.util.Scanner;
import com.ejercicioserick.entities.biblioteca;

    public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSistema de Gestión de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anio = Integer.parseInt(scanner.nextLine());
                    biblioteca.agregarLibro(titulo, autor, isbn, anio);
                    break;
                case "2":
                    System.out.print("Buscar por (titulo/autor): ");
                    String criterio = scanner.nextLine().toLowerCase();
                    if (criterio.equals("titulo") || criterio.equals("autor")) {
                        System.out.print("Ingrese el " + criterio + " del libro: ");
                        String valor = scanner.nextLine();
                        biblioteca.buscarLibro(criterio, valor);
                    } else {
                        System.out.println("Criterio no válido. Intente de nuevo.");
                    }
                    break;
                case "3":
                    biblioteca.mostrarLibros();
                    break;
                case "4":
                    System.out.print("Ingrese el ISBN del libro a prestar: ");
                    isbn = scanner.nextLine();
                    biblioteca.prestarLibro(isbn);
                    break;
                case "5":
                    System.out.print("Ingrese el ISBN del libro a devolver: ");
                    isbn = scanner.nextLine();
                    biblioteca.devolverLibro(isbn);
                    break;
                case "6":
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    
}
