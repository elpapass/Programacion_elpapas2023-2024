package Boletin6_Listas.Ejercicio7;

public class Ingrediente {
    private String nombre;
    private double cantidad;

    public String getNombre() {
        return nombre;
    }

    public void addCantidad(double add) {
        cantidad += add;
    }

    public double getCantidad() {
        return cantidad;
    }
}
