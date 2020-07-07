package Menu;

import java.util.Scanner;

public class Menuzinho {
	Scanner Menuzinho = new Scanner(System.in);
	public void Main() {
		System.out.println();
		System.out.println("Menu :");
		System.out.println();
		System.out.println("1 - Jogar");
		System.out.println("2 - Informação Do Criador");
		System.out.println("3 - Sobre");
		System.out.println("4 - Sair");
		System.out.println();
		
		System.out.print("Digite um número do MENU :");
		int numero = Menuzinho.nextInt();
		switch (numero) {
			case 1: System.out.println("Jogar");
				System.out.println();
				Jogar obj4 = new Jogar();
				obj4.Jogadores();
			break;

			case 2: System.out.println("Informação Do Criador");
				System.out.println();
				Informação obj1 = new Informação();
				obj1.informar();
			break;
			case 3: System.out.println("Sobre");
				System.out.println();
				Sobre obj2 = new Sobre();
				obj2.informar();
			break;
			case 4: System.out.println("Sair");
				System.out.println();
				System.out.println("Dá Thauzinho ;)");
				System.exit(0);
			
			break;
			default:
				return;
		
		}
	}

}
