package ejercicio2;


	public class CuentaAhorro extends cuentaBancaria {
	    protected boolean activa;
	    
	    public CuentaAhorro(float saldoInicial, float tasaAnual) {
	        super(saldoInicial, tasaAnual);
	        if (saldoInicial < 1) {
	            activa = false;
	        } else {
	            activa = true;
	        }
	    }
	    @Override
	    public void consignar(int valor) {
	        if (activa) {
	            super.consignar(valor);
	            if (valor >= 1 && !activa) {
	                activa = true;
	            }
	        } else {
	            System.out.println("No se puede consignar dinero");
	        }
	    }
	    @Override
	    public void retirar(int valor) {
	        if (activa) {
	            super.retirar(valor);
	            if (valor < 1 && activa) {
	                activa = false;
	            }
	        } else {
	            System.out.println("No se puede retirar dinero");
	        }
	    }
	    @Override
	    public void extractoMensual() {
	        if (Saldo < 1) {
	            activa = false;
	        }
	        if (NumeroRetiros > 4) {
	            ComisionMensual += 1000;
	        }
	        super.extractoMensual();
	    }
	    public void imprimir() {
	        super.imprimir();
	        System.out.println(Saldo+ComisionMensual+(NumeroConsignaciones+NumeroRetiros));
	    }

	}

