package boletin4;

import java.util.Random;
import java.util.Scanner;

public class MiEntradaSalida2 {
    public static void main(String[] args) {
        saluda(" JUAN");
    }

    public static void saluda(String nombre) {
        System.out.println("HOLA" + nombre);

    }

    public static class MiEntradaSalida {
        public static Scanner teclado = new Scanner(System.in);

        /**
         * lee un entero comprendido entre el minimo y el max (INCLUIDOS)
         * @param min valor min
         * @param max valor max
         * @return el numero leido
         */
        public static int leerEntero( int min , int max){
            if (min >= max){
                // TODO: Hacer cuando conozcamos las excepeciones
            }
            int numLeido;
            do {
                numLeido = Integer.parseInt(teclado.nextLine());
                if (numLeido < min || numLeido > max){
                    System.out.println("INTRODUCE UN VALOR ENTRE LAS DOS UNIDADES");
                }

            }while (numLeido < min || numLeido > max);

            return numLeido;
        }
        public static Random numerosaleatorios(int a){
            Random r = new Random();
            int aleatorio1 = r.nextInt(100) + 1;
            // TODO: Esta es otra opcion de random
            // int aleatorio2 = (int) Math.random() * 100 + 1;
            return r;
        }
        public static String alumnosNotas(String nombre, int notaAlumno1, int notaAlumno2){
            System.out.println("introduce el numero del alumno: ");
            nombre = teclado.nextLine();
            System.out.println("introduce la nota del alumno en mates: ");
            notaAlumno1 = teclado.nextInt();
            System.out.println("introduce la nota del alumno en lengua: ");
            notaAlumno2 = teclado.nextInt();

            if (notaAlumno1 < 0 || notaAlumno1 > 10){
                System.out.println("muestrame ");
            }


            return nombre;
        }
        public static int EuclideanAlgorithm (int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    }
}