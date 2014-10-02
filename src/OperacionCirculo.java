import java.util.Scanner;

public class OperacionCirculo {

public static void main (String args []) {

        float radio;
        float resultadoarea;
        float resultadocircunferencia;

        Circulo operaciones  = new Circulo();


        Scanner sc = new Scanner(System.in);
        System.out.print("\ningresa el radio: ");
        radio = sc.nextFloat();
	
        operaciones.setArea(radio);
        operaciones.setCircunferencia(radio);

        resultadoarea = operaciones.getArea();
        resultadocircunferencia = operaciones.getCircunferencia();
        
        System.out.print("\n el area del circulo es " + resultadoarea);
        System.out.println("\n la circuferencia del circulo es " + resultadocircunferencia);
                
}
}

