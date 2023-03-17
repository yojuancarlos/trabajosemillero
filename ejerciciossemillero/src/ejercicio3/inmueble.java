package ejercicio3;



public abstract class inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String dirección;
    protected Boolean estaArrendado; 


    public inmueble(int identificadorInmobiliario, int area, String dirección, Boolean estaArrendado) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.dirección = dirección;
        this.estaArrendado = estaArrendado;
    }


    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }


    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }


    public int getArea() {
        return area;
    }


    public void setArea(int area) {
        this.area = area;
    }


    public String getDirección() {
        return dirección;
    }


    public void setDirección(String dirección) {
        this.dirección = dirección;
    }


    public Boolean getEstaArrendado() {
        return estaArrendado;
    }


    public void setEstaArrendado(Boolean estaArrendado) {
        this.estaArrendado = estaArrendado;
    }


    public abstract int obtenerValor();


}
