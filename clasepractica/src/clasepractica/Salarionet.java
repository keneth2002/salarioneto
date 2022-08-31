package clasepractica;

import java.util.Scanner;

public class Salarionet {
   //DATOS CONSTANTES
	public static double TASA_ANTIGUEDAD = 15.0;
   public static double TASA_INSS = 7.0;
   public static double TASA_IR = 15.6;
   public static double TASA_INSS_PATRONAL = 22.5;
   public static double TASA_SINDICATO = 1.0;
   
	public  static void main(String[] args) {
		//SCANNER
		Scanner lector = new Scanner(System.in);
		
		//DATOS DE ENTRADA
		System.out.print("Ingrese sus SALARIO BRUTO :  C$");
		double salarioBruto = lector.nextDouble();
		System.out.print("Ingrese los años de antiguedad :");
		int antiguedad = lector.nextInt();
		
		//CALCULO DE LOS INGRESOS
		double montoAntiguedad = salarioBruto * (TASA_ANTIGUEDAD/100);
		double ingresosTotales = salarioBruto + montoAntiguedad;
		
		//CALCULO DE LAS DEDUCCIONES
		double montoINSS = ingresosTotales * (TASA_INSS/100);
		double montoIR = ingresosTotales * (TASA_IR/100);
		double montoSindicato = salarioBruto * (TASA_SINDICATO/100);
		double deduccionesTotales = montoINSS + montoIR + montoSindicato;
		double ingresoNeto = ingresosTotales - deduccionesTotales;
		double montoINSSPatronal = ingresosTotales * (TASA_INSS_PATRONAL/100);
		
		//DATOS DE SALIDA
		System.out.println("*-*-*-**-*-INGRESOS*-*-*-**-*-");
		System.out.println("Salario bruto :  C$"  + salarioBruto);
		System.out.println("Antiguedad :"  + antiguedad  + "años");
		System.out.println("Monto por Antiguedad  : C$"  + montoAntiguedad);
		System.out.println("*-*-*-**-*-DEDUCCIONES*-*-*-**-*-");
		System.out.println("Tasa del INSS :"  + TASA_INSS  + "%");
		System.out.println("Monto por INSS  : C$"  +  String.format("%.2f", montoINSS) );
		System.out.println("Tasa del IR :"  + TASA_IR  + "%");
		System.out.println("Monto por IR  : C$"  +  String.format("%.2f", montoIR) );
		System.out.println("Tasa de Afiliciacion del Sindicato :"  + TASA_SINDICATO  + "%");
		System.out.println("Monto por Afiliciacion del Sindicato  : C$"  +  String.format("%.2f", montoSindicato) );
		System.out.println("*-*-*-**-*-CALCUOS FINALES*-*-*-**-*-");
		System.out.println("Ingresos Totales  : C$"  +  String.format("%.2f", ingresosTotales));
		System.out.println("Deducciones Totales  : C$"  +  String.format("%.2f", deduccionesTotales));
		System.out.println("INSS Patronal  : C$"  +  String.format("%.2f", montoINSSPatronal));
		System.out.println("Ingreso Neto  : C$"  +  String.format("%.2f", ingresoNeto));
	}

}
