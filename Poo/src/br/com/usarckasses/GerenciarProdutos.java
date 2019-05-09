package br.com.usarckasses;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos {

	public static void main(String[] args) {
	    /*
	     * Vamos criar um vetor (Array|Cole��o) de categorias
	     */
		Categoria[] cat = {
							new Categoria(11,"Inform�tica","Tecnologia"),
							new Categoria(12,"Suprimentos","Diversos"),
							new Categoria(13,"Escolar", "Para o estudo")
							};
		for (int i = 0; i < cat.length ; i++)
			System.out.println(cat[i].getName());
		
		Fornecedor[] fornecedor = {
				
						new Fornecedor(51,"Microsoft","1111"),
						new Fornecedor(52, "Logitec","556"),
						new Fornecedor(53,"Tilibra","55487")
						} ;
		
		Produto pr = new Produto();
		pr.setId(60);
		pr.setNome("Mouse");
		pr.setDescricao("Mouse sem fio");
		pr.setCategoria(cat[0]);
		pr.setFornecedor(fornecedor[1]);
		pr.setPreco(20);
		
		
		
		

	}

}
