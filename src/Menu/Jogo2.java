package Menu;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Jogo2 extends Cadastro{
	//objeto Scanner para pedir dados do teclado
			Scanner entrada = new Scanner(System.in);

	void forca() throws IOException {
		
		//numero de tentaticas
		int vidas = 6;
		
		//Inicializando o jogador
		System.out.println("Informe os dados do jogador.");
		System.out.print("Qual nome do jogador? ");
		String nome = entrada.next();
		System.out.print("Qual sobrenome do jogador? ");
		String sobrenome = entrada.next();
		System.out.print("Qual nome do jogador? ");
		String apelido = entrada.next();
		
		//objeto jogador
		Cadastro jogador = new Cadastro(nome, sobrenome, apelido);
		
		
		//Chamando metodo que retorna o nome do jogador
		System.out.println("Iniciando jogo " + jogador.getNome());
		
		
		//inicializando objedo da classe Random
		Random palavra = new Random();
		
		//inicializando um array com com as palavras que serão encontradas
		String[] palavras = {"linux","samba","dhcp","apache","root","ping","netplan"};
		
		//inicializando a variavel que determina ganhador
		boolean ganhou = false;
		
		//incializando a variavel que sera usada nos inputs
		String letra = "";
		
		//sorteando a palavra e guardando em uma variavel
		int inicioSorteio = palavra.nextInt(palavras.length);
		
		//inicializando um array com a palavra encontrada
		String sorteado = palavras[inicioSorteio];
		
		//Definindo um array que tera o tamanho do array da palavra escondida
		String [] palavraEscondida = new String[sorteado.length()];
		int letraEncontrada = 0;
		
		//inicializando o array com o underline
		for (int i = 0; i < palavraEscondida.length; i++ ) {
			palavraEscondida[i] = "_";
		}
		
		//deixando definido um jeto de terminar o jogo, sem a conclusão
		while(!letra.equals("sair")) {
			
			//imprimindo os underline em linha
			for(String b : palavraEscondida) {
				System.out.print( b + " ");
			}
			//pedindo uma entrada de dado pro jogador
			System.out.println("");
			System.out.println("Digite uma letra: ");
			letra = entrada.next();
			
			//definira qual a letra certa
			boolean letraCerta = false;
		
			//laço para transpor a letra como caracter
			for (int i = 0; i < palavraEscondida.length;i++) {
				String caracter = Character.toString(sorteado.charAt(i));
				
				//comparar letra com caracter
				if(letra.equals(caracter)) {
					letraCerta = true;
					letraEncontrada++;
					palavraEscondida[i] = letra;
					
				//Se letras encontradas tiver o tamanho da palavra sorteada o jogador ganhou	
				if(letraEncontrada == sorteado.length()) {
					System.out.println("Você acertou a palavra");
					System.out.println("Parabens você ganhou " + jogador.getNome());
					System.out.println("Fim do jogo");
					return	;
				}
			}		
		}
			if (!letraCerta) {
				vidas--;
				System.out.println("Numero de chances restantes " + vidas);
			}
			if (vidas == 0) {
				System.out.println("Fim do jogo");
				System.out.println("Faleceu, tchau tchau");
				return;
			}
		}
	}
}




