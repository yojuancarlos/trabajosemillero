package ejercicioexcepciones;

public class CálculosNúmericos {
	
	public static double calcularRaizCuadrada(double valor) {
        if (valor < 0) {
            throw new ArithmeticException("El valor introducido es negativo");
        }
        return Math.sqrt(valor);
    }


public static double calcularPendiente(double variablex1, double variablex2, double variabley1, double variabley2) {
    if (variablex1 == variablex2){
        throw new ArithmeticException("division sobre 0");
    }
    return (variabley2 - variabley1) / (variablex2 - variablex1);
}

public static double puntoMedioRecta(double variablex1, double variablex2, double variabley1, double variabley2) {
	if (variablex1==0) {
		throw new ArithmeticException("tales");
	}
	return (((variablex1 + variablex2) / 2) + ((variabley1 + variabley2) / 2));
	
}
public static double[] calcularRaices(double a, double b, double c) {
    double discriminante = ((b*b) - 4 * a * c);
    double[] raices;
    if (a == 0) {
        throw new ArithmeticException("la variable a debe ser distinto de cero");
    } else if (discriminante > 0) {
        raices = new double[2];
        raices[0] = ((-b + Math.sqrt(discriminante)) / (2 * a));
        raices[1] = ((-b - Math.sqrt(discriminante)) / (2 * a));
    } else {
        throw new ArithmeticException("La ecuación cuadrática no tiene raíces reales");
    }
    return raices;
}

public static String convertirNumeroBaseDistinta(double numero, int base) {
    if (base ==10) {
        throw new IllegalArgumentException("La base es la msima");
    }
    
    return convertirNumeroBaseDistinta(numero / base, base) +  (numero % base);
}




}