package ejerciciosClaseabstractasEInterfaces.punto4;

public class cuentaCorriente extends cuentabanco{
	protected int numRetiros;
	public cuentaCorriente(int numeroCuenta, int saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar(float valor) throws SaldoInsuficienteException, MaximoRetirosException {
		if (valor > saldo) {
	        throw new SaldoInsuficienteException(propietario);
	    }

	    if (numRetiros >= 5) {
	        throw new MaximoRetirosException(propietario);
	    }

	    saldo -= valor;
	    numRetiros++;
		
	}

}
