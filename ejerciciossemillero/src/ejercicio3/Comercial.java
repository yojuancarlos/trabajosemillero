package ejercicio3;

public abstract class Comercial extends Local {
    public Comercial(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado) {
		super(identificadorInmobiliario, area, dirección, estaArrendado);
		// TODO Auto-generated constructor stub
	}

	private String centroComercial;

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}
	 private int valor =3000000;
	    
	    
	    @Override
	    public int obtenerValor() {
	        return  area*valor;
	    }

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

}
