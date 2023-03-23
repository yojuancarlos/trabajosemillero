package ejercicio2;



public class cuentaBancaria {
    protected float Saldo;
    protected int NumeroConsignaciones=0;
    protected int NumeroRetiros=0;
    protected float TasaAnual ;
    protected float ComisionMensual=0;

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


}



