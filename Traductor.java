
/**
 * Write a description of class Traductor here.
 *
 * @author (Edgar Andrés Martinez Brand)
 * @version (20/08)
 */

import java.util.Scanner;

public class Traductor
{
    public static void main( String[] args )
    {
        //Constantes
        String the = "el";
        String read = "leer";
        String on = "sobre";
        String in = "en";
        String play = "jugar";
        String he = "el";
        String she = "ella";
        String white = "blanco";
        String house = "casa";
        String car = "carro";
        //Variables
        String texto;
        //Objetos
        Scanner teclado = new Scanner( System.in );
 
        
        
        
        //Programa
        
        //Mensaje usuario
        System.out.println("Ingrese una frase en ingles con las siguientes palabras:");    
        System.out.println("the");
        System.out.println("read");
        System.out.println("on");
        System.out.println("in");
        System.out.println("play");
        System.out.println("he");
        System.out.println("she");
        System.out.println("white");
        System.out.println("house");
        System.out.println("car");
        texto = teclado.nextLine();
        
        //Si contiene la palabra verdadero o falso
        
        if ( texto.contains( "the" ) ) {
        texto = texto.replaceAll( "the", the ); 
    }  
        if ( texto.contains( "read" ) ) {
        texto = texto.replaceAll( "read", read ); 
    }
        if ( texto.contains( "on" ) ) {
        texto = texto.replaceAll( "on", on ); 
    }
        if ( texto.contains( "in" ) ) {
        texto = texto.replaceAll( "in", in ); 
    }
        if ( texto.contains( "play" ) ) {
        texto = texto.replaceAll( "play", play ); 
    }
        if ( texto.contains( "he" ) ) {
        texto = texto.replaceAll( "he", he ); 
    }
        if ( texto.contains( "she" ) ) {
        texto = texto.replaceAll( "she", she ); 
    }
        if ( texto.contains( "white" ) ) {
        texto = texto.replaceAll( "white", white ); 
    }
        if ( texto.contains( "house" ) ) {
        texto = texto.replaceAll( "house", house ); 
    }
        if ( texto.contains( "car" ) ) {
        texto = texto.replaceAll( "car", car ); 
    } else { 
    }
    
    //Resultado de la traduccion
        System.out.println( texto );  
    } //End of main
} //End of class
