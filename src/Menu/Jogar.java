package Menu;

import java.io.IOException;
import java.util.Scanner;

public class Jogar {
	Scanner Jogar = new Scanner(System.in);
	public void Jogadores() {
		System.out.println("Menu Jogo: ");
		System.out.println();
		System.out.println("1 - Quiz");
		System.out.println("2 - Forca");
		System.out.println();
		System.out.println("Digite um número do Menu: ");
			
		int numero = Jogar.nextInt();
		switch(numero) {
		case 1 : System.out.println("1 - Quiz");
		System.out.println();
		Jogo obj5 = new Jogo();
		obj5.Jogada();
		break;
		case 2 : System.out.println("2 - Forca");
		System.out.println();
		Jogo2 objforca = new Jogo2();
		try {
		objforca.forca();
		} catch(IOException e) { 
			e.printStackTrace();  
				}
			
		
		break;
		default:
			return;
		}
			
	}

}



