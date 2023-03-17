package a3;

public abstract class  Oficina extends Local {
    public Oficina(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado) {
		super(identificadorInmobiliario, area, dirección, estaArrendado);
		// TODO Auto-generated constructor stub
	}

	public boolean isGobierno() {
		return gobierno;
	}

	public void setGobierno(boolean gobierno) {
		this.gobierno = gobierno;
	}

	private boolean gobierno;
	
	 private int valor =3500000;
	    
	    
	    public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

		@Override
	    public int obtenerValor() {
	        return  area*valor;
	    }
}
