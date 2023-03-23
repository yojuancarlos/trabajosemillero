package ejerciciosClaseabstractasEInterfaces.punto4;

public abstract class cuentabanco {
	protected int numeroCuenta;
	protected int saldo;
	protected String propietario;
	public cuentabanco(int numeroCuenta, int saldo, String propietario) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
	public  void depositar (float valor) {
		saldo += valor;
	}
	public abstract void retirar(float valor)throws SaldoInsuficienteException, MaximoRetirosException;
	
	
	
}

