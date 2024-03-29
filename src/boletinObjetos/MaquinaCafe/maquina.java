package boletinObjetos.MaquinaCafe;

import java.util.Scanner;

public class maquina {
    Scanner teclado = new Scanner(System.in);
    public static final int CAP_MAX_DEPOSITO_CAFE = 50;
    public static final int CAP_MAX_DEPOSITO_LECHE = 50;
    public static final int CAP_MAX_DEPOSITO_VASOS = 80;
    public static final double MONEDERO_INICIAL = 1.5;
    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;

    private int cafeRestante;
    private int lecheRestante;
    private int vasosRestante;
    private double monederoIncial;

    public maquina() {
        rellenarDeposito();
        monederoIncial = MONEDERO_INICIAL;
    }
public void rellenarDeposito(){
        cafeRestante = CAP_MAX_DEPOSITO_CAFE;
        lecheRestante = CAP_MAX_DEPOSITO_LECHE;
        vasosRestante = CAP_MAX_DEPOSITO_VASOS;
}
    //QUIERO CAMBIARLO A DOUBLE EL METODO

    public void darCambio(double dineroActual) throws MaquinaExpection {
        System.out.println("Introduce el coste del producto elegido: ");
        double pago = teclado.nextDouble();
                double cambio = dineroActual - pago;
                if (dineroActual == pago){
                    System.out.println("Gracias por si compra, has dado el dinero justo");
                } else if (dineroActual > pago && monederoIncial >= (cambio)) {
                    monederoIncial = monederoIncial - pago;
                    System.out.println("Aqui tiene su vuelta que es: " + cambio+ " €");
                } else if (dineroActual > pago) {
                    throw new MaquinaExpection ("tu saldo es insuficiente");
                }else {
                    throw new MaquinaExpection("Disculpes las molestias");
                }
    }
    public void servirCafe(){
        System.out.println("aqui tienes tu cafe ");
        cafeRestante--;
        vasosRestante--;
    }
        public void servirLeche(){
        System.out.println("aqui tienes tu leche ");
        lecheRestante--;
        vasosRestante--;
    }public void servirCafeConLeche(){
        System.out.println("aqui tienes tu cafe con leche");
        cafeRestante--;
        lecheRestante--;
        vasosRestante--;
    }

        public boolean puedoServirCafe () {
            return cafeRestante > 0 && vasosRestante > 0;
        }
        public boolean puedoServirLeche () {
            return lecheRestante > 0 && vasosRestante > 0;
        }
        public boolean puedoServirCafeConLeche () {
            return cafeRestante > 0 && vasosRestante > 0 && lecheRestante > 0;
        }

    @Override
    public String toString() {
        return "maquina{" +
                "cafeRestante=" + cafeRestante +
                ", lecheRestante=" + lecheRestante +
                ", vasosRestante=" + vasosRestante +
                ", monederoIncial=" + monederoIncial +
                '}';
    }
}

