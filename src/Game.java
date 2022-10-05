/**
 * 
 */
import java.util.Scanner;
import java.util.random.*;
/**
 * @author pablo
 *
 */
public class Game {
	
	int opcion;
	static Scanner entrada = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		
	        while(opcion!=2){
	            System.out.println("BIENVENIDO AL JUEGO DEL SIGLO");
	            System.out.println("¿QUIERES JUGAR?");
	            System.out.println("1. Abrir Juego");
	            System.out.println("2. Cerrar Juego");
	            opcion = entrada.nextInt();	
	            
	            switch(opcion) {
	            case 1:
	            	System.out.println("Prueba");
	            	
	            	
	            	
	            	opcion = 2;
	            	break;
	            case 2: 
	            	break;
	            case 3:
	            	System.out.println("Número mal ingresado pruebe nuevamente");
	            }		
	        }

	}
}	
