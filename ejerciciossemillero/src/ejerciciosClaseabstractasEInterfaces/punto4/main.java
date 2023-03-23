package ejerciciosClaseabstractasEInterfaces.punto4;

public class main {

	public static void main(String[] args) {

        cuentaAhorro cuenta1 = new cuentaAhorro(1, 10000, "juancarlos");
        cuentaCorriente cuenta2 = new cuentaCorriente(2, 50, "gonzalo");

        try {
            cuenta1.depositar(500);
            cuenta1.depositar(1000);
            cuenta1.retirar(300);
            cuenta1.retirar(200);
            cuenta1.retirar(100);
            cuenta1.retirar(50);

            cuenta2.retirar(1000);
            cuenta2.retirar(500);
            cuenta2.retirar(300);
            cuenta2.retirar(200);
            cuenta2.retirar(100);
            
        } catch (SaldoInsuficienteException e) {
            System.out.println("no posee el saldo suficiente");
        } catch (MaximoRetirosException e) {
            System.out.println("supero el límite de retiros");
        }

        System.out.println("Cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2: " + cuenta2.getSaldo());
	}

}
