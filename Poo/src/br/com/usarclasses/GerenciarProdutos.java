package br.com.usarclasses;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vamos criar um vertor (array|coleção) de categirias
		 */
		Categoria[] cat = {
				new Categoria(11,"Informática","Tecnologia"),
				new Categoria(12,"Suplementos","Diversos"),
				new Categoria(13,"Escolar","Para o estudo")
		};
		Fornecedor[] fornecedor = { 
				new Fornecedor(51,"Microsoft","465456564545548948948948949845645645647541548984978478998498989898959249595294524929452465245465246526452654624245264525424652672368683526452"),
				new Fornecedor(52,"Logitec","9648468544155945492962142984289252598494554646545456228224525425246625462246524656754"),
				new Fornecedor(53,"Tilibra","65465165489415452465198148194519419149841984198149425498298459489498498")
		};
		Produto pr = new Produto();
		pr.setId(60);
		pr.setNome("Mouse");
		pr.setDescricao("Mouse sem fio");
		pr.setCategoria(cat[0]);
		pr.setFornecedor(fornecedor[1]);
		pr.setPreco(20);
	}

}
