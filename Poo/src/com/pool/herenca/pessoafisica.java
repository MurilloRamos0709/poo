package com.pool.herenca;

import java.io.FileWriter;
import java.io.IOException;

public class pessoafisica extends Cliente {
	private String nome;
	private String cpf;
	private String rg;
	
	
	public pessoafisica() {
		super();
	}

	public pessoafisica(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public pessoafisica(String nome, String cpf, String rg, int id, String email, String telefone, String endereço) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		super.setId(id);
		super.setEmail(email);
		super.setEndereço(endereço);
		super.setTelefone(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public void cadastrar()
{
		FileWriter arquivo;
	
		try {
			FileWriter arquivo = new FileWriter("c:\\Murillo\\cadastro.txt");
				arquivo.append(this.nome);
				arquivo.append(this.getEmail());
				arquivo.append(this.getTelefone());
				arquivo.append(this.getEndereco());
				arquivo.append(this.cpf);
				arquivo.append(this.rg);
				arquivo.append("------------------------");
				
				
		} catch (IOException e) {
			// caso haja algum erro, será impressa na tela de console uma pilha com os erros
			e.printStackTrace();
		
		}
		
}
	

	
	
	