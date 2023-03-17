package a3;



public abstract class casa extends Vivienda{
    public casa(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
			int numeroHabitaciones, int numeroBaños) {
		super(identificadorInmobiliario, area, dirección, estaArrendado, numeroHabitaciones, numeroBaños);
		// TODO Auto-generated constructor stub
	}
	private int numeroHabitacionescacion;
    public int getNumeroHabitacionescacion() {
		return numeroHabitacionescacion;
	}
	public void setNumeroHabitacionescacion(int numeroHabitacionescacion) {
		this.numeroHabitacionescacion = numeroHabitacionescacion;
	}
	public int getNumeroBaños() {
		return numeroBaños;
	}
	public void setNumeroBaños(int numeroBaños) {
		this.numeroBaños = numeroBaños;
	}
	private int numeroBaños;
    
}
