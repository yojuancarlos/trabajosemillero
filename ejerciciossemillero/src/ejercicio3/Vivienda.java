package ejercicio3;


public abstract class Vivienda extends inmueble{
    private int numeroHabitaciones;
    private int numeroBaños;
    public Vivienda(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
            int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, dirección, estaArrendado);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    

}
