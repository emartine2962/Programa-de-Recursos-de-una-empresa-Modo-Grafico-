
/**
 * Write a description of class DesviasionEstandar here.
 *
 * @author (Edgar Andres Martinez Brand)
 * @version (08/20)
 */

import java.util.Scanner; //Scanner

public class DesviacionEstandar
{
    public static void main( String[] args ) {
        //variables
        double    x;
        double    sumatoria = 0;
        double    sumatoria2 = 0;
        double    desviacion = 0.0; 
        int       n = 0;
        
        //objetos
        Scanner teclado = new Scanner( System.in );
        
        //Mensaje usuario
        System.out.println("Ingrese un numero y pulse enter, cuando termine de ingresar la lista precione 0 y luego enter");        
        x = teclado.nextDouble();  
        
        //Bucle
        do {
            sumatoria = sumatoria + x;
            sumatoria2 = sumatoria2 + x * x;
            n = n + 1;
            System.out.println("Ingrese un numero y pulse enter, cuando termine de ingresar la lista precione 0 y luego enter");
            x = teclado.nextDouble();            
        } while (x != 0);

        //Calculo
        double varianza = sumatoria2 / (n - 1) - (sumatoria * sumatoria) / (n * (n - 1));
        
        //Funcion matematica
        desviacion = Math.sqrt(varianza);
        
        //Retorno de formula
        System.out.println("Desvianción Estándar: " + desviacion);
    } //End of main
} //End of class
