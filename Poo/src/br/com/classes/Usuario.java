package br.com.classes;

public class Usuario {
	// Declaração dos atributos do usuário
public String login;
public String senha;

	// Declaração do métodos da classe Usuário
public String cadastrar() {
		return ("Cadastro Realizado com sucesso!");

	}

	// Declaração do método logar para permitir o acesso ao sistema
public String logar() {
	String msg="";
		if (login.equals("adm") && senha.equals("123")) {
			msg = "Bem Vindo";
		} else {
			msg = "Login ou senha incorreto";
		}
		return msg;
	}

	// Declaração do método logout
public String logout() {
		return ("você saiu do aplicativo");
	}
}
