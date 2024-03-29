package Boletin6_Listas.Ejercicio5;

import Boletin6_Listas.Ejercicio5.Diccionario;
import Boletin6_Listas.Ejercicio5.DiccionarioException;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static final int OPCION_SALIR = 5;
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Diccionario diccionario22 = new Diccionario();

        int opcion = 0;

        while (opcion != OPCION_SALIR) {
            System.out.println(menu());

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        opcion1(diccionario22);
                        break;
                    case 2:
                        opcion2(diccionario22);
                        break;
                    case 3:
                        opcion3(diccionario22);
                        break;
                    case 4:
                        opcion4(diccionario22);
                        break;
                    case OPCION_SALIR:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Introduce un número del 1 al 5");
                }
            } catch (NumberFormatException | DiccionarioException e) {
                System.out.println("Introduce un número del 1 al 5");
            }

        }

    }

    public static String menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("¿Qué deseas hacer?").append(System.lineSeparator())
                .append("1. Añadir palabra").append(System.lineSeparator())
                .append("2. Buscar palabra").append(System.lineSeparator())
                .append("3. Borrar palabra").append(System.lineSeparator())
                .append("4. Listado de palabras").append(System.lineSeparator())
                .append("5. Salir").append(System.lineSeparator())
                .append("Introduce un número: ");
        return sb.toString();
    }

    public static void opcion1(Diccionario Diccionario22) {

        boolean correcto = false;
        String palabra = null, significado = null;

        while (!correcto) {
            System.out.print("Introduce una palabra que no esté vacía: ");
            palabra = sc.nextLine();
            if (!palabra.isBlank()) {
                correcto = true;
            }
        }

        // Ahora recogemos el significado
        correcto = false;

        while (!correcto) {
            System.out.print("Introduce el significado: ");
            significado = sc.nextLine();
            if (!significado.isBlank()) {
                correcto = true;
            }
        }

        Diccionario22.addLetter(palabra, significado);
    }

    public static void opcion2(Diccionario Diccionario22) throws DiccionarioException {
        boolean correcto = false;
        String palabra = null;

        while (!correcto) {
            System.out.print("Introduce la palabra a buscar: ");
            palabra = sc.nextLine();
            if (!palabra.isBlank()) {
                correcto = true;
            } else {
                System.out.println("La palabra no puede estar vacía");
            }
        }
        try {
            List<String> significados = Diccionario22.searchLetter(palabra);
            for (String significado : significados) {
                System.out.println(significado);
            }

        } catch (DiccionarioException e) {
            throw new DiccionarioException("No encuentro la palabra. Comprueba las mayúsculas y minúsculas");
        }

    }

    public static void opcion3(Diccionario Diccionario22) throws DiccionarioException {
        boolean correcto = false;
        String palabra = null;

        while (!correcto) {
            System.out.print("Introduce la palabra a borrar: ");
            palabra = sc.nextLine();
            if (!palabra.isBlank()) {
                correcto = true;
            }
            try {
                Diccionario22.removeLetter(palabra);

            } catch (DiccionarioException e) {
                throw new DiccionarioException("Palabra no encontrada");
            }
        }


    }

    public static void opcion4(Diccionario Diccionario22) {
        System.out.print("Introduce el comienzo de la palabra: ");
        String comienzaPor = sc.nextLine().trim();

        List<String> claves = Diccionario22.listadoPalabrasFlujo(comienzaPor);
        for (String clave : claves) {
            System.out.println(clave);
        }
    }

}
