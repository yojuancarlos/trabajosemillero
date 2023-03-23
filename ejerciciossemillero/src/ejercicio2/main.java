package ejercicio2;

import ejercicio2.CuentaAhorro;
import ejercicio2.CuentaCorriente;

	
public class main {

	public static void main(String[] args) {
		CuentaAhorro cuentaAhorros = new CuentaAhorro(1000, 0.02f);

        // Realizar algunas operaciones en la cuenta de ahorros
        cuentaAhorros.consignar(500);
        cuentaAhorros.retirar(200);
        cuentaAhorros.extractoMensual();

        // Imprimir el estado de la cuenta de ahorros
        cuentaAhorros.imprimir();

        // Crear una cuenta corriente con saldo inicial de 500 y tasa anual de 0.03
        CuentaCorriente CuentaCorriente = new CuentaCorriente(500, 0.03f);

        // Realizar algunas operaciones en la cuenta corriente
        CuentaCorriente.consignar(300);
        CuentaCorriente.retirar(700);
        CuentaCorriente.extractoMensual();

        // Imprimir el estado de la cuenta corriente
        CuentaCorriente.imprimir();
        

	}

}
