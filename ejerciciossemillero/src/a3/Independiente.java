package a3;

public class Independiente extends Urbana{
public Independiente(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
			int numeroHabitaciones, int numeroBaños) {
		super(identificadorInmobiliario, area, dirección, estaArrendado, numeroHabitaciones, numeroBaños);
		// TODO Auto-generated constructor stub
	}


public int getValor() {
	return valor;
}


public void setValor(int valor) {
	this.valor = valor;
}


private int valor =3500000;
    
    
    @Override
    public int obtenerValor() {
        return  area*valor;
    }
}
