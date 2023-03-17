package a3;

public class Conjunto extends Urbana {
    public Conjunto(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
			int numeroHabitaciones, int numeroBaños) {
		super(identificadorInmobiliario, area, dirección, estaArrendado, numeroHabitaciones, numeroBaños);
		// TODO Auto-generated constructor stub
	}


	public int getValorAdministracion() {
		return valorAdministracion;
	}


	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}


	public boolean isAreasComunes() {
		return areasComunes;
	}


	public void setAreasComunes(boolean areasComunes) {
		this.areasComunes = areasComunes;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	private int valorAdministracion;
    private boolean areasComunes;
    private int valor =2500000;
    
    
    @Override
    public int obtenerValor() {
        return  area*valor;
    }
    
}
