package a3;

public abstract class rural extends casa{
	 private int valor =1500000;
    public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public rural(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
			int numeroHabitaciones, int numeroBaños) {
		super(identificadorInmobiliario, area, dirección, estaArrendado, numeroHabitaciones, numeroBaños);
		// TODO Auto-generated constructor stub
	}
	public int getDistanciaCabecera() {
		return distanciaCabecera;
	}
	public void setDistanciaCabecera(int distanciaCabecera) {
		this.distanciaCabecera = distanciaCabecera;
	}
	public int getAltitud() {
		return altitud;
	}
	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}
	private int distanciaCabecera;
    private int altitud;
    
    @Override
    public int obtenerValor() {
        return  area*valor;
    }
}
