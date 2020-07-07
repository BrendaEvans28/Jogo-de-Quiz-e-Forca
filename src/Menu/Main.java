package Menu;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner logando = new Scanner(System.in);
		
		//imprimindo na tela as opções
				System.out.println("Tela de Login: ");
				System.out.println();
						
			// 1) Informe o seu login;
				System.out.println("O nome do usuário é o meu primeiro nome, com letras minusculas!!!");
				System.out.println();
				System.out.println("Usuário -->");
				String login = logando.nextLine();
						
			// 2)Informe a sua senha;
				System.out.println("A senha é um conjuto de números >0 && <7");
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
	      	// 4) Verificar se o login e a senha estão corretos;
	      	// Login == "brenda";
	      	// Estamos comparando uma instância(objeto) com uma String.
	      			
	          if (login.equals("brenda")&& senha.equals("123456")) {
	  			System.out.printf("Usuário %s logado com sucesso.",login);
	  		}else {
	  			System.out.println("Login ou senha inválidos!");
	  		}
	          
	          if(login.equals("sair") || senha.equals("sair")){
	     
	          System.out.print("Você escolheu sair do jogo");
	          return;
	          }
			}
			System.out.printf("Usuário %s logado com sucesso.",login);
			System.out.println();
			Menuzinho obj = new Menuzinho();
			obj.Main();
		}
	}




	


