package Menu;

import java.util.Scanner;

public class Jogo {

	Scanner java = new Scanner(System.in);
	
	public void Jogada() {
	
		
		System.out.print("Informe o numero de jogadores: ");
		int numero  = java.nextInt();
		String jogadores[] = new String[numero];
		
		for(int i = 0; i < jogadores.length; i++) {
			System.out.print("Informe seu nome: ");
			String nome = java.next();
			System.out.print("Informe seu sobrenome: ");
			String sobrenome = java.next();
			System.out.print("Informe seu apelido: ");
			String apelido = java.next();
			Cadastro jogador = new Cadastro(nome,sobrenome,apelido);
			jogadores[i] = jogador.getNome();
			System.out.println();
		}
		
		int[] respostasCertas = new int[]{3,2,3,2,1,3,1,3,3,2,3};
		int[] respostasDoJogador = new int[10] ;
		int score = 0;
		int score1 = 0;
		int score2 = 0;
	
		String pergunta0 = "1 - Qual comando para instalar o SAMBA no linux ?"
				+"\n1 - apt-get update"
				+"\n2 - apt-get upgrade"
				+"\n3 - apt-get install samba";
		String pergunta1 = "2 - Qual comando entra no superusuário (root)?"
				+"\n1 - sudo ru"
				+"\n2 - sudo su "
				+"\n3 - sudo sudo";
		String pergunta2 = "3 - Qual comando para criar um diretório?"
				+"\n1 - pwd"
				+"\n2 - cd "
				+"\n3 - mkdir";
		String pergunta3 = "3 -  Qual comando usado para entrar no diretório ?"
				+"\n1 - cd .."
				+"\n2 - cd diretório"
				+"\n3 - cd /";
		String pergunta4 = "4 -  Qual comando mostra o diretório atual?"
				+"\n1 - pwd"
				+"\n2 - cd"
				+"\n3 - mkdir";
		String pergunta5 = "5 -  Qual é o diretório de configuração do sistema SAMBA ?"
				+"\n1 - cd /etc/pdbedit"
				+"\n2 - cd /etc/passwd"
				+"\n3 - cd /etc/samba";
		String pergunta6 = "6 -  qual comando para ver o IP da rede no linux?"
				+"\n1 - ipconfig"
				+"\n2 - ifconfig"
				+"\n3 - apconfig";
		String pergunta7 = "7 -  Qual comando que testa conectividade entre equipamentos em uma rede ?"
				+"\n1 - ip a"
				+"\n2 - pip"
				+"\n3 - ping ";
		String pergunta8 = "8 -  Qual comando instala o APACHE no linux ?"
				+"\n1 - apt install apache2"
				+"\n2 - apt-get install apache2"
				+"\n3 - sudo  apt-get intall apache2";
		String pergunta9 = "3 - Quem é encarregado de estabelecer a comunição entre duas redes?"
				+"\n1 - ping"
				+"\n2 - gateway"
				+"\n3 - touch";
		String pergunta10 = "4 -  Qual comando serve para configurar o servidor DHCP ?"
				+"\n1 - nano /etc/dhcp/dhcp.conf"
				+"\n2 - nano /etc/dhcpd/dhcpd.conf"
				+"\n3 - nano /etc/dhcp/dhcpd.conf";
		
		
	
		String[] perguntas = new String[]{pergunta0,pergunta1,pergunta2,pergunta3,pergunta4,pergunta5,pergunta6,pergunta7,pergunta8,pergunta9,pergunta10};
		
		
		for (int i = 0; i < perguntas.length;i++) {
			if(numero == 1) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[0]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
					score = score + 100;
					System.out.print("Parabens você acertou, sua pontuação atual é " + score);
					System.out.println();
				}else {
					System.out.println("Continue Tentando.");
					System.out.println();
				}
			}
			if (numero == 2 && i%2 == 0) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[0]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
				score = score + 100;
				System.out.print("Parabens você acertou, sua pontuação atual é " + score);
				System.out.println();
				}
			} else if(numero == 2 && i%2 == 1) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[0]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
				score1 = score1 + 100;
				System.out.print("Parabens você acertou, sua pontuação atual é " + score1);
				System.out.println();
				}

			}
			if(numero == 3 && i%3 ==0) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[0]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
				score = score + 100;
				System.out.print("Parabens você acertou, sua pontuação atual é " + score);
				System.out.println();
				}	
			}else if(numero == 3 && (i%3 == 1)) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[1]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
				score1 = score1 + 100;
				System.out.print("Parabens você acertou, sua pontuação atual é " + score1);
				System.out.println();
				}
			}else if(numero == 3 && i%3 == 2) {
				System.out.println("Ai vai a pergunta para o senhor(a): " + jogadores[2]);
				System.out.println(perguntas[i]);
				respostasDoJogador[i] = java.nextInt();
				if(respostasDoJogador[i]==respostasCertas[i]) {
				score2 = score2 + 100;
				System.out.print("Parabens você acertou, sua pontuação atual é " + score2);
				System.out.println();
				}
			}
			
			
		}
		
		if(numero == 1) {
			System.out.println("Resultado da partida:");
			System.out.println(jogadores[0] + " pontuação: " + score);
		}
		if(numero == 2) {
			System.out.println("Resultado da partida:");
			System.out.println(jogadores[0] + " pontuação: " + score);
			System.out.println("Resultado da partida:");
			System.out.println(jogadores[1] + " pontuação: " + score1);
		}
		if(numero == 3) {
			System.out.println("Resultado da partida:");
			System.out.println(jogadores[0] + " pontuação: " + score);
			System.out.println(jogadores[1] + " pontuação: " + score1);
			System.out.println(jogadores[2] + " pontuação: " + score2);
		}
	}
	
		
}
