package br.edu.ifg;

public class Encomenda {
	private Carrinho carrinho;
	private EnumEncomenda enumEncomenda;

	public Encomenda() {

	}

	public Encomenda(Carrinho carrinho, EnumEncomenda enumEncomenda) {
		this.carrinho = carrinho;
		this.enumEncomenda = enumEncomenda;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public EnumEncomenda getEnumEncomenda() {
		return enumEncomenda;
	}

	public void setEnumEncomenda(EnumEncomenda enumEncomenda) {
		this.enumEncomenda = enumEncomenda;
	}

	@Override
	public String toString() {
		return "Encomenda  ["+carrinho.toString()+"\n\nSituação:"+ enumEncomenda.getDescricao()+ "]";
	}

	
}
