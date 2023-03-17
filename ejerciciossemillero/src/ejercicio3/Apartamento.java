package ejercicio3;



public abstract class Apartamento extends inmueble{
private int valorAdministracion;

public Apartamento(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
        int valorAdministracion) {
    super(identificadorInmobiliario, area, dirección, estaArrendado);
    this.valorAdministracion = valorAdministracion;
}


    
}
