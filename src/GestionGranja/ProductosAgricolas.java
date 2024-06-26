package GestionGranja;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.util.List;

public class ProductosAgricolas {
    private String nombreProducto;
    private Productos tipoProducto;
    private int cantDisponible;
    private double precio;
    private  LocalDateTime fecha;
    private List<String> listaRegistroPrecio;
    private List<String> listaRegistroCantidad;




    private boolean disponible;

    public ProductosAgricolas(String nombreProducto, Productos tipoProducto, int cantDisponible, double precio) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantDisponible = cantDisponible;
        this.precio = precio;
        this.fecha = LocalDateTime.now();
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }
    public double getPrecio() {
        return precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void registrarPrecio() {
        listaRegistroPrecio.add("El precio actual del producto es: "+ getPrecio() + " ,La fecha actual es: "+ getFecha());
    }
    public void registrarCantidadDispoble() {
        listaRegistroCantidad.add("La cantidad disponible es: " +getCantDisponible() + ",La fecha actual es: "+ getFecha());
    }
    @Override
    public String toString() {
        return "ProductosAgricolas{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", tipoProducto=" + tipoProducto +
                ", cantDisponible=" + cantDisponible +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}
