package br.edu.ifg;

public enum EnumEncomenda {
	EF("EFETIVADA"), SU("SUSPENSA");

	private String descricao;

	private EnumEncomenda(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
