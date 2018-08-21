import java.util.Scanner;

 

public class Arreglo{

    public static void main( String[]args ){

 

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce los numeros, 0 para ejecutar");

        int numeros = 0;

        int[] array=new int[1000];

        int i = 0;

        while(numeros!=0);{

            numeros = teclado.nextInt();

 

            if(numeros!=0){

                array[i]=numeros;

                i = i + i;

            }

        }
        
        System.out.print( array.length );
    }

}