import java.util.Scanner;

public class Circulo {

public static void Circulo (String args []) {

	double radio, area; 
	Scanner sc = new Scanner(System.in);
	System.out.print("\ningresa el radio: ");
	radio = sc.nexFloat();


 	resultadodelradio = OperacionesCirculo.area(area);
 	resultadodelacircunf = OperacionesCirculo.circunf(radio);


	System.out.println("\nel radio del circulo es: " + resultadodelradio );
	System.out.println("\nel resultado de la circunferencia es " + resultadodelacircunf);
	
}
}	 



 
