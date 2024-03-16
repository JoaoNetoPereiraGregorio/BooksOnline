package br.edu.ifg;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String email;
	private Boolean receptorEmail;
	private Carrinho carrinho;
	private ArrayList<Encomenda> encomendas = new ArrayList<>();

	public Usuario() {

	}

	public Usuario(String nome, String cpf, String dataNascimento, String email, Boolean receptorEmail,
			Carrinho carrinho, ArrayList<Encomenda> encomendas) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.receptorEmail = receptorEmail;
		this.carrinho = carrinho;
		this.encomendas = encomendas;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getReceptorEmail() {
		return receptorEmail;
	}

	public void setReceptorEmail(Boolean receptorEmail) {
		this.receptorEmail = receptorEmail;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public ArrayList<Encomenda> getEncomendas() {
		return encomendas;
	}

	public void setEncomendas(ArrayList<Encomenda> encomendas) {
		this.encomendas = encomendas;
	}

	public void adicionaEncomenda(Encomenda encomenda) {
		this.encomendas.add(encomenda);
	}

	public void removeEncomenda(Encomenda encomenda) {
		this.encomendas.remove(encomenda);
	}

	public String mostraEncomendas(ArrayList<Encomenda> encomendas) {
		String mensagem = "";
		for (Encomenda umaEncomeda : encomendas) {
			mensagem += umaEncomeda.toString();
		}
		return mensagem;

	}
	
	public String  mostraCarrinho(Carrinho carrinho) {
		String mensagem="";
		
		if(carrinho==null) {
			mensagem="Sem Carrinho";
		}else {
		mensagem=	carrinho.toString();
		}
				return mensagem;
		}
	

	@Override
	public String toString() {
		return "Nome:" + nome + ", cpf:" + cpf + ", Data de Nascimento:" + dataNascimento + ", Email:" + email
				+ ", Receptor Email:" + (receptorEmail ? "SIM":"NÃO");
	}
	
}
