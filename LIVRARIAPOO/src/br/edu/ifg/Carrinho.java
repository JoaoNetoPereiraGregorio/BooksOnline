package br.edu.ifg;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList<Livro> livros = new ArrayList<>();

	public Carrinho() {
	}

	public Carrinho(ArrayList<Livro> livros) {

		super();
		this.livros = livros;

	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public void adicionaLivro(Livro livro) {
		this.livros.add(livro);
	}

	public void removeLivro(Livro livro) {
		this.livros.remove(livro);
	}

	public String mostraLivros(ArrayList<Livro> livros) {
		String mensagem = "";
		for (Livro umLivro : livros) {
			mensagem += "\n" + umLivro.toString();
		}
		return mensagem;

	}

	public double somaValorLivros(ArrayList<Livro> livros) {
		double valorTotal = 0;
		for (Livro umLivro : livros) {
			valorTotal += umLivro.getPreco();
		}
		return valorTotal;
	}

	public void limpaCarrinho() {
		this.livros.clear();
	}

	@Override
	public String toString() {
		return mostraLivros(livros) + "\n\nValor total:" + somaValorLivros(livros);
	}

}
