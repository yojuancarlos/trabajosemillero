package ejerciciosClaseabstractasEInterfaces.punto4;

public class cuentaAhorro extends cuentabanco{
	protected int numRetiros;
	protected double sobrecargo;
	protected double bono;
	public cuentaAhorro(int numeroCuenta, int saldo, String propietario) {
		super(numeroCuenta, saldo, propietario);
		// TODO Auto-generated constructor stub
		numRetiros = 0;
	}

	@Override
	public void retirar(float valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
            throw new SaldoInsuficienteException(propietario);
        }
		
		saldo -= valor;
    	numRetiros++;

        if (numRetiros > 3) {
            sobrecargo = valor * 0.01;
            saldo -= sobrecargo;
        }}
	
	 @Override
	    public void depositar(float valor) {
	        if (numRetiros < 2) {
	            bono = valor * 0.005;
	            saldo += bono;
	        }

	        saldo += valor;
	    }

}
