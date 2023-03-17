package ejercicio3;



public class Apartaestudio extends Apartamento{
    

    private int numeroHabitaciones;
    private int valor =1500000;
   
    public Apartaestudio(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
            int valorAdministracion, int numeroHabitaciones, int valor) {
        super(identificadorInmobiliario, area, dirección, estaArrendado, valorAdministracion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.valor = valor;
    }

    @Override
    public int obtenerValor() {
        return  area*valor;
    }
    
    


}
