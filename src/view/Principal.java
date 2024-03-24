package view;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("Sabonete brilhoso");
		//O set de Preço e Estoque menor que o 0 deve disparar uma mensagem e definir o valor como 0
		p.setPreco(-8);
		p.setQtdEstoque(-9);
		System.out.printf("Nome do Produto: %s | Preço Unitário: R$%.2f | Quantidade de itens no estoque: %d %n", p.getNome(), p.getPreco(), p.getQtdEstoque());
		verificarProduto(p);
		System.out.println();
		
		p.setPreco(5f);
		p.setQtdEstoque(5);
		
		System.out.printf("Nome do Produto: %s | Preço Unitário: R$%.2f | Quantidade de itens no estoque: %d %n", p.getNome(), p.getPreco(), p.getQtdEstoque());
		verificarProduto(p);
		System.out.printf("Valor Total: %.2f", p.totalValorEstoque());
	}
	
	public static void verificarProduto (Produto p) {
		if(p.verificarProdutoDisponivel()) {
			System.out.println("Produto Disponível");
		}
		else
		{
			System.out.println("Produto Indisponível");
		}
	}

}
