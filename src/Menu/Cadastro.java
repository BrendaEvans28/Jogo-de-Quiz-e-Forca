package Menu;

import java.util.Scanner;

public class Cadastro {
	
	protected String nome;
	protected String sobrenome;
	protected String apelido;
	
	public Cadastro() {
	}
	
	public Cadastro(String nome, String sobrenome, String apelido) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
