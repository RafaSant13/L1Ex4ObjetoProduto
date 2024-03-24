package model;

import javax.swing.JOptionPane;

public class Produto {
	
	private String nome;
	private float preco;
	private int qtdEstoque;

	public Produto() {
		this.nome = "";
		this.preco = 0f;
		this.qtdEstoque = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		if (preco < 0) {
			JOptionPane.showMessageDialog(null, "O produto não pode ter um preço negativo");

			this.preco = 0f;
		}
		else 
		{
			this.preco = preco;
		}
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			JOptionPane.showMessageDialog(null, "Um produto não pode ter um estoque negativo");

			this.qtdEstoque = 0;
		}
		else 
		{
			this.qtdEstoque = qtdEstoque;
		}
	}
	
	public boolean verificarProdutoDisponivel() {
		if (getQtdEstoque()<1) {
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public float totalValorEstoque() {
		float preco = getPreco();
		int qtdEstoque = getQtdEstoque();
		return preco * qtdEstoque;
	}

}
