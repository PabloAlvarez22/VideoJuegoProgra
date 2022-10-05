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
		int player;
		int life;
		int opcionjuego;
		boolean heros = true, villians = true;
		int opcion = 0;
		
	        while(opcion!=2){
	            System.out.println("BIENVENIDO AL JUEGO DEL SIGLO");
	            System.out.println("¿QUIERES JUGAR?");
	            System.out.println("1. Abrir Juego");
	            System.out.println("2. Cerrar Juego");
	            opcion = entrada.nextInt();	
	            
	            switch(opcion) {
	            case 1:
	            	System.out.println("Iniciando el juego...");
	            	
	            	Hero Guerrero = new Hero(100, 100, 200, 20, 10, 5, "Gerardo");
	            	Hero Mago = new Hero(100, 50, 50, 200, 10, 5, "Gertrudis");
	            	Hero Explorador = new Hero(100, 50, 50, 200, 10, 15, "Link");
	            	Hero Asesino = new Hero(100, 50, 400, 20, 10, 15, "Jack");
	            	Hero Tanque = new Hero(300, 300, 50, 50, 10, 15, "Gibraltar");
	            	
	            	System.out.println("Elije inteligentemente a tu personaje (cada personaje cuenta con distintos atributos");
	            	System.out.println("1. Guerrero Gerardo (Personaje con buena vida, resistencia y ataque físico)");
	            	System.out.println("2. Maga Gertudris (Personaje con buena vida, poca resistencia y excelente ataque mágico)");
	            	System.out.println("3. Explorador Link (Personaje con buena curación y más items)");
	            	System.out.println("4. Asesino Jack (Personaje con poca resistencia, pero excelente ataque físico)");
	            	System.out.println("5. Tanque Gibraltar (Personaje con vida y resistencia excelente, pero poco daño)");
	            	player = entrada.nextInt();
	            	
	            	if (player==1) {
	            		do {
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		System.out.println("5. Item de poder/fuerza");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			life = Guerrero.PhysicalAttack(); 
		            			System.out.println("Has dado un golpe de 10 de daño físico");
		            		} 
		            		if(opcionjuego==2) {
		            			life = Guerrero.MagicalAttack(20); 
		            			System.out.println("Has dado un golpe de 2 de daño mágico");
		            		} 
		            		if(opcionjuego==3) {
		            			life = Guerrero.ItemSalud(100, 10); 
		            			System.out.println("Te has recuperado 10 de vida");
		            		}
		            		if(opcionjuego==4) {
		            			life = Guerrero.ItemArmadura(100, 10); 
		            			System.out.println("Has recuperado 10 de armadura");
		            		} 
		            		if(opcionjuego==5) {
		            			life = Guerrero.ItemFuerzayMagia(200, 20, 10); 
		            			System.out.println("Tu ataque físico y mágico han aumentado por 5");
		            		} 
		            		
		            	}while(heros && villians);
	            	}

	            	if (player==2) {
	            		do {
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		System.out.println("5. Item de poder/fuerza");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			life = Mago.PhysicalAttack(); 
		            			System.out.println("Has dado un golpe de 5 de daño físico");
		            		} 
		            		if(opcionjuego==2) {
		            			life = Mago.MagicalAttack(20); 
		            			System.out.println("Has dado un golpe de 20 de daño mágico");
		            		} 
		            		if(opcionjuego==3) {
		            			life = Mago.ItemSalud(100, 10); 
		            			System.out.println("Te has recuperado 10 de vida");
		            		}
		            		if(opcionjuego==4) {
		            			life = Mago.ItemArmadura(100, 10); 
		            			System.out.println("Has recuperado 10 de armadura");
		            		} 
		            		if(opcionjuego==5) {
		            			life = Mago.ItemFuerzayMagia(200, 20, 10); 
		            			System.out.println("Tu ataque físico y mágico han aumentado por 5");
		            		} 
		            		
		            	}while(heros && villians);
	            	}
	            	
	            	if (player==3) {
	            		do {
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		System.out.println("5. Item de poder/fuerza");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			life = Explorador.PhysicalAttack(); 
		            			System.out.println("Has dado un golpe de 5 de daño físico");
		            		} 
		            		if(opcionjuego==2) {
		            			life = Explorador.MagicalAttack(20); 
		            			System.out.println("Has dado un golpe de 5 de daño mágico");
		            		} 
		            		if(opcionjuego==3) {
		            			life = Explorador.ItemSalud(100, 10); 
		            			System.out.println("Te has recuperado 15 de vida");
		            		}
		            		if(opcionjuego==4) {
		            			life = Explorador.ItemArmadura(100, 10); 
		            			System.out.println("Has recuperado 15 de armadura");
		            		} 
		            		if(opcionjuego==5) {
		            			life = Explorador.ItemFuerzayMagia(200, 20, 10); 
		            			System.out.println("Tu ataque físico y mágico han aumentado por 10");
		            		} 
		            		
		            	}while(heros && villians);
	            	}
	            	
	            	if (player==4) {
	            		do {
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		System.out.println("5. Item de poder/fuerza");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			life = Asesino.PhysicalAttack(); 
		            			System.out.println("Has dado un golpe de 35 de daño físico");
		            		} 
		            		if(opcionjuego==2) {
		            			life = Asesino.MagicalAttack(20); 
		            			System.out.println("Has dado un golpe de 5 de daño mágico");
		            		} 
		            		if(opcionjuego==3) {
		            			life = Asesino.ItemSalud(100, 10); 
		            			System.out.println("Te has recuperado 10 de vida");
		            		}
		            		if(opcionjuego==4) {
		            			life = Asesino.ItemArmadura(100, 10); 
		            			System.out.println("Has recuperado 10 de armadura");
		            		} 
		            		if(opcionjuego==5) {
		            			life = Asesino.ItemFuerzayMagia(200, 20, 10); 
		            			System.out.println("Tu ataque físico y mágico han aumentado por 5");
		            		} 
		            		
		            	}while(heros && villians);
	            	}
	            	
	            	if (player==5) {
	            		do {
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		System.out.println("5. Item de poder/fuerza");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			life = Tanque.PhysicalAttack(); 
		            			System.out.println("Has dado un golpe de 5 de daño físico");
		            		} 
		            		if(opcionjuego==2) {
		            			life = Tanque.MagicalAttack(20); 
		            			System.out.println("Has dado un golpe de 5 de daño mágico");
		            		} 
		            		if(opcionjuego==3) {
		            			life = Tanque.ItemSalud(100, 10); 
		            			System.out.println("Te has recuperado 10 de vida");
		            		}
		            		if(opcionjuego==4) {
		            			life = Tanque.ItemArmadura(100, 10); 
		            			System.out.println("Has recuperado 10 de armadura");
		            		} 
		            		if(opcionjuego==5) {
		            			life = Tanque.ItemFuerzayMagia(200, 20, 10); 
		            			System.out.println("Tu ataque físico y mágico han aumentado por 5");
		            		} 
		            		
		            	}while(heros && villians);
	            	}
	            	
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
