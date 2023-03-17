package ejercicio2;



public class cuentaBancaria {
    private float Saldo;
    private int NumeroConsignaciones=0;
    private int NumeroRetiros=0;
    private float TasaAnual ;
    private float ComisionMensual=0;

public cuentaBancaria(float saldoInicial, float tasaAnual2) {
    }
public void setComisionMensual(float comisionMensual) {
    ComisionMensual = comisionMensual;
}
public void setNumeroRetiros(int numeroRetiros) {
    NumeroRetiros = numeroRetiros;
}
public void setSaldo(float saldo) {
    Saldo = saldo;
}
public void setTasaAnual(float tasaAnual) {
    TasaAnual = tasaAnual;
}
public void setNumeroConsignaciones(int numeroConsignaciones) {
    NumeroConsignaciones = numeroConsignaciones;
}

public void consignar(int valor) {
    Saldo = Saldo+valor;
    NumeroConsignaciones++;
}
public void retirar(int valor) {
    if(Saldo>valor){
        Saldo = Saldo-valor;
        NumeroRetiros++;
    }
    
}

public void calcularInteresMensual() {
    float interesMensual = Saldo * (TasaAnual/12);
    Saldo += interesMensual;
}

public void extractoMensual() {
    Saldo -= ComisionMensual;
    calcularInteresMensual();
}
public void imprimir(){
    System.out.println(Saldo+ComisionMensual);
}

public class CuentaDeAhorros extends cuentaBancaria {
    private boolean activa;
    
    public CuentaDeAhorros(float saldoInicial, float tasaAnual) {
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
public class CuentaCorriente extends CuentaDeAhorros {
    private float sobregiro =0;
    
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


    

}}



