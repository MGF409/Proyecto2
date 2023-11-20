package Metodos;

import java.util.Scanner;

import BinaryTree.BinarySearchTree;
import Objetos.Socio;

public class RegistrosUsuarios {
    private static BinarySearchTree<Socio> arbolSociosActivos = new BinarySearchTree<>();

    public static void main(String[] args) {
        do {
            altaSocio();
        } while (Helper.continuar());
    }

    public static void altaSocio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Alta de Socio:");
        System.out.print("Número de Socio: ");
        int numeroSocio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Verificar si el socio ya existe
        Socio socioExistente = buscarSocioPorNumero(numeroSocio);
        if (socioExistente != null) {
            System.out.println("Error: El número de socio ya existe. No se puede agregar el socio.");
            return;
        }
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilio = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        // Inicialmente asignar el valor "ok" al estado
        String estado = "ok";

        Socio nuevoSocio = new Socio(numeroSocio, dni, nombre, apellido, domicilio, telefono, estado);

        arbolSociosActivos.add(nuevoSocio);
        System.out.println("Socio agregado correctamente.");
    }

    private static Socio buscarSocioPorNumero(int numeroSocio) {
        BTNode<Socio> nodoSocio = arbolSociosActivos.search(new Socio(numeroSocio, "", "", "", "", "", ""));
        return (nodoSocio != null) ? nodoSocio.item : null;
    }
}
