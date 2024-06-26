package Boletin6_Listas.EjercicioColecciones_2.Examen22Cromos;

public class CromoJugador extends Cromo{
    private String nombreJugador;
    private String equipoJugado;
    private int alturaJugador;

    public CromoJugador(int id, String nombreJugador, String equipoJugado, int alturaJugador) {
        super(id);
        this.nombreJugador = nombreJugador;
        this.equipoJugado = equipoJugado;
        this.alturaJugador = alturaJugador;
    }

    @Override
    public String getEquio() {
        return equipoJugado;
    }

    @Override
    public String getNombre() {
        return nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public String getEquipoJugado() {
        return equipoJugado;
    }

    public int getAlturaJugador() {
        return alturaJugador;
    }
}
