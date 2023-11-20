package Metodos;
import Objetos.Libro;
import java.util.Scanner;

import BinaryTree.BinarySearchTree;
import BinaryTree.BinaryTree;

import java.util.Scanner;



public class RegistrosLibros {
    private static BinarySearchTree<Libro> arbolLibrosDisponibles = new BinarySearchTree<>();

    
    public static void altaLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Alta de Libro:");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Verificar si el libro ya existe
        Libro libroExistente = buscarLibroPorCodigo(codigo);
        if (libroExistente != null) {
            System.out.println("Error: El código de libro ya existe. No se puede agregar el libro.");
            return;
        }

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Editorial: ");
        String editorial = scanner.nextLine();
        System.out.print("Año de Publicación: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Temática: ");
        String tematica = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Libro nuevoLibro = new Libro(codigo, titulo, autor, editorial, anioPublicacion, tematica, precio);

        arbolLibrosDisponibles.add(nuevoLibro);
        System.out.println("Libro agregado correctamente.");
    }


    
    private static Libro buscarLibroPorCodigo(int codigo) {
        BTNode<Libro> nodoLibro = arbolLibrosDisponibles.search(new Libro(codigo, "", "", "", 0, "", 0.0));
        return (nodoLibro != null) ? nodoLibro.item : null;
    }
}
