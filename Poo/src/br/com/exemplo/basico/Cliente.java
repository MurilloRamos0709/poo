package br.com.exemplo.basico;

public class Cliente {
	
	public int id;
	public String nome;
	public String email;
	
/*
 * M�todos de acesso get set ...
 */
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	
	/*
	 * Sempre p�blico
	 * Sempre com o mesmo nome da classe
	 * N�o tipo tem tipo de retorno,ou seja N�O � VOID OU
	 * QUALQUER OU TIPO
	 */
	
	public Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	}
	
	public Cliente() {}
	
	public String cadastrar() {
		return "Cadastro Realizado";
	}
	public String nomePorId(int id) {
		
		String msg="";
		
		if(this.id==id) {
			msg = this.nome;
		}
		else {
			msg = "N�o localizado";
		}
		return msg;
	}

}

