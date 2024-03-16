package br.edu.ifg;

import java.util.ArrayList;

public class Livraria {
	private Catalogo catalogo;
	private ArrayList<Usuario> usuarios = new ArrayList<>();

	public Livraria() {

	}

	public Livraria(Catalogo catalogo, ArrayList<Usuario> usuarios) {
		this.catalogo = catalogo;
		this.usuarios = usuarios;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void adicionaUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void removeUsuario(Usuario usuario) {
		this.usuarios.remove(usuario);
	}

	public  boolean verificaLogin(String nome) {
		boolean loga = false;

		for (Usuario umUsuario : this.usuarios) {
			if (nome.equals(umUsuario.getNome())) {
				loga = true;
			}
		}
		return loga;
	}

	public  Usuario retornaUsuario(String nome) {
		Usuario usuario=null;
		for (Usuario umUsuario : this.usuarios) {
			if (nome.equals(umUsuario.getNome())) {
				usuario = umUsuario;
			}
		}
		return usuario;
	}

}
