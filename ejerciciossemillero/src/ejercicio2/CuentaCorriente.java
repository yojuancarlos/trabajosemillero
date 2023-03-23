package ejercicio2;


	public class CuentaCorriente extends cuentaBancaria {
	    protected float sobregiro =0;
	    
	    public CuentaCorriente(float saldoInicial, float tasaAnual) {
	        super(saldoInicial, tasaAnual);
	    }
	    @Override
	    public void retirar(int valor) {
	        Saldo = valor-Saldo;
	        if (valor>Saldo){
	            super.retirar(valor);
	            sobregiro= valor-Saldo;
	            
	        }
	    }

	    @Override
	    public void consignar(int valor) {
	       retirar(valor);
	       
	    }
	    
	    @Override
	    public void extractoMensual() {
	        
	        super.extractoMensual();
	    }

	    public void imprimir() {
	        super.imprimir();
	        System.out.println(Saldo+ComisionMensual+(NumeroConsignaciones+NumeroRetiros)+sobregiro);
	    }


	    

	}

