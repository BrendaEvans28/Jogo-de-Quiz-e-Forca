package Menu;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner logando = new Scanner(System.in);
		
		//imprimindo na tela as op��es
				System.out.println("Tela de Login: ");
				System.out.println();
						
			// 1) Informe o seu login;
				System.out.println("O nome do usu�rio � o meu primeiro nome, com letras minusculas!!!");
				System.out.println();
				System.out.println("Usu�rio -->");
				String login = logando.nextLine();
						
			// 2)Informe a sua senha;
				System.out.println("A senha � um conjuto de n�meros >0 && <7");
				System.out.println();
				System.out.println("Senha -->");
				String senha = logando.nextLine();
		
		while(!login.equals("brenda") || !senha.equals("123456")){
	          System.out.print("Usuario ou Senha incorretos, tente outra vez. ");
	          System.out.println();
	          System.out.print("Usuario: ");
	          login = logando.next();
	          System.out.print("Senha: ");
	          senha = logando.next();
	          
	        // 3) Armazenar em variaveis o login e a senha 
	      	// 4) Verificar se o login e a senha est�o corretos;
	      	// Login == "brenda";
	      	// Estamos comparando uma inst�ncia(objeto) com uma String.
	      			
	          if (login.equals("brenda")&& senha.equals("123456")) {
	  			System.out.printf("Usu�rio %s logado com sucesso.",login);
	  		}else {
	  			System.out.println("Login ou senha inv�lidos!");
	  		}
	          
	          if(login.equals("sair") || senha.equals("sair")){
	     
	          System.out.print("Voc� escolheu sair do jogo");
	          return;
	          }
			}
			System.out.printf("Usu�rio %s logado com sucesso.",login);
			System.out.println();
			Menuzinho obj = new Menuzinho();
			obj.Main();
		}
	}




	


