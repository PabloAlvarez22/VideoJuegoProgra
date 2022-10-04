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
	public static void menu(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		
	        while(opcion!=2){
	            System.out.println("BIENVENIDO AL JUEGO DEL SIGLO");
	            System.out.println("¿QUIERES JUGAR?");
	            System.out.println("1. Abrir Juego");
	            System.out.println("2. Cerrar Juego");
	            opcion = entrada.nextInt();	
	            
	            if (opcion == 1) {
	            	//32
	            }
	            else {
	            	System.out.println("Número mal ingresado, vuelva a abrir el programa");
	            	break;
	            }
		
	}

}
}	
