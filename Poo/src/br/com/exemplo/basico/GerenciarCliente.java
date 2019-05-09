package br.com.exemplo.basico;

import com.construtores.Cliente;

public class GerenciarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cliente cl = new Cliente(10,"arnaldo","arnaldoa@gmail.com");
		//cl.id = 10;
		//cl.nome = "Arnaldo";
		//cl.email = "Arnaldo@gmail.com";
		
		//String rs = cl.nomePorId(10);
		//System.out.println(rs);
		
		Cliente cl2 = new Cliente();
		cl2.setId(10);
		cl2.setNome("Arnaldo");
		cl2.setEmail("arnaldo@gmail.com");
		System.out.println(cl2.nomePorId(10));

	}

}
