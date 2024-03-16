package br.edu.ifg;

public class Livro {
	private String titulo;
	private String autor;
	private int numero;
	private String descricao;
	private double preco;

	public Livro() {

	}

	public Livro(String titulo, String autor, int numero, String descricao, double preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.numero = numero;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return " [Titulo: " + titulo + ", Autor: " + autor + ", Numero: " + numero + ", Descrição: " + descricao
				+ ", Preço :" + preco + "]";
	}
	
	

}
