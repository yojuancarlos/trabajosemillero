package a3;

public abstract class Familiar extends Apartamento {
	private int valor =2000000;
	 public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

	public Familiar(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado,
			int valorAdministracion) {
		super(identificadorInmobiliario, area, dirección, estaArrendado, valorAdministracion);
		// TODO Auto-generated constructor stub
	}
	@Override
    public int obtenerValor() {
        return  area*valor;
    }
}
