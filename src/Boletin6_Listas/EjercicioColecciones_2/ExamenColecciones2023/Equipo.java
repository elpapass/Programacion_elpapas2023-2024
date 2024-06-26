package Boletin6_Listas.EjercicioColecciones_2.ExamenColecciones2023;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equipo {
    private String nombre;
    private Set<Jugador> jugadores;
    
    public Equipo(String nombre) {
        super();
        this.nombre = nombre;
        this.jugadores = new HashSet<>();
    }
    
    public void addJugador(Jugador j) {
        jugadores.add(j);
    }
    
    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre).append(": ").append(System.lineSeparator());
        for (Jugador j: jugadores) {
            sb.append(j).append(System.lineSeparator());
        }
        
        return sb.toString();
    }
    
    
    
}
