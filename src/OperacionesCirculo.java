import java.util.Scanner;



public class OperacionesCirculo {



	public static void main (String args []) {



	    double radio, area, resultadodelradio, resultadodelacircu;

	    Circulo Operaciones = new Circulo(); 

	

	    Scanner sc = new Scanner(System.in);

	    System.out.print("\ningresa el radio: ");

	    radio = sc.nextDouble();





	    resultadodelradio = Operaciones.area(radio);

	    resultadodelacircu = Operaciones.circu(radio);





	    System.out.println("\nel radio del circulo es: " + resultadodelradio );

	    System.out.println("\nel resultado de la circunferencia es " + resultadodelacircu);

    

	}				

}	 
