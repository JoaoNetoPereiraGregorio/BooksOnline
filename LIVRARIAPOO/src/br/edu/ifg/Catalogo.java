package br.edu.ifg;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalogo {
	private ArrayList<Livro> livros = new ArrayList<>();

	Catalogo() {

	}

	public Catalogo(ArrayList<Livro> livros) {

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
		int i=1;
		for (Livro umLivro : livros) {
			mensagem +="   Livro "+i+umLivro.toString()+"\n\n";
			i++;
		}
		return mensagem;

	}

	@Override
	public String toString() {
		return "Catalogo\n\n" + mostraLivros(livros);
	}
	
	

}
