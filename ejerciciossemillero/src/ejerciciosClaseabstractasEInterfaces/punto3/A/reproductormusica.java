package ejerciciosClaseabstractasEInterfaces.punto3.A;

public abstract class reproductormusica {
	
	protected String duracion;
	protected String tamaño;
	protected String artista;
	protected String compositor;
	protected String generoMusical;
	
	public reproductormusica(String duracion, String tamaño, String artista, String compositor, String generoMusical) {
		super();
		this.duracion = duracion;
		this.tamaño = tamaño;
		this.artista = artista;
		this.compositor = compositor;
		this.generoMusical = generoMusical;
	}
	
	
	public abstract void reproducir();
	
	
	
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	
	
	

	
	
	
	

}
